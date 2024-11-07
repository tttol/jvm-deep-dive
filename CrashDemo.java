public class CrashDemo {
    static {
        System.loadLibrary("crash");
    }

    private native void causeSegmentationFault();

    public static void main(String[] args) {
        new CrashDemo().causeSegmentationFault();
    }
}