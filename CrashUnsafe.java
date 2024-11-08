import sun.misc.Unsafe;

public class CrashUnsafe {
   public static void main(String[] args) throws Exception {
      var field = Unsafe.class.getDeclaredField("theUnsafe");
      field.setAccessible(true);
      var unsafe = (Unsafe) field.get(null);
      
      var address = 0;
      unsafe.putAddress(address, 0L); 
   }
}