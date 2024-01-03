public class Main {
    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap();

        maxHeap.insert(99);
        maxHeap.insert(57);
        maxHeap.insert(60);
        maxHeap.insert(32);
        maxHeap.insert(15);
        maxHeap.insert(53);
        System.out.println(maxHeap.getHeap());
        maxHeap.insert(95);
        System.out.println(maxHeap.getHeap());
        maxHeap.delete();
        System.out.println(maxHeap.getHeap());
    }
}