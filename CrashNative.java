public class CrashNative {
    static {
        System.loadLibrary("crash");
    }

    private native void causeSegmentationFault();

    public static void main(String[] args) {
        new CrashNative().causeSegmentationFault();
    }
}