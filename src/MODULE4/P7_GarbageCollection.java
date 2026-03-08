package MODULE4;

public class P7_GarbageCollection {
    public void finalize() {
        System.out.println("garbage collected");
    }

    static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            P7_GarbageCollection obj = new P7_GarbageCollection();
            obj = null;
        }
        System.gc();
    }
}
