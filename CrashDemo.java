public class CrashDemo {
    // ネイティブライブラリをロード
    static {
        System.loadLibrary("crash"); // ライブラリ名（crash.soやcrash.dllを指します）
    }

    // ネイティブメソッドの宣言
    private native void causeSegmentationFault();

    public static void main(String[] args) {
        new CrashDemo().causeSegmentationFault(); // メソッド呼び出し
    }
}