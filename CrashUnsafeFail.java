import sun.misc.Unsafe;

public class CrashUnsafeFail {
   public static void main(String[] args) throws Exception {
      var unsafe = Unsafe.getUnsafe();      
      var address = 0;
      unsafe.putAddress(address, 0L); 
   }
}