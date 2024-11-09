public class NPE {
    public static void main(String[] args) {
        Object n = null;
        n.hashCode();
    }
}
