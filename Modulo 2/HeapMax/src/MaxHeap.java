public class MaxHeap extends Heap {

    @Override
    public void insert(int value) {
        heap.add(value);
        int current = heap.size() - 1;

        while (current > 0 && heap.get(parent(current)) < value) {
            swap(parent(current), current);
            current = parent(current);
        }
    }

    @Override
    public Integer delete() {
        if (heap.size() == 0) {
            return null;
        }
        if (heap.size() == 1) {
            return heap.remove(0);
        }

        int maxValue = heap.get(0);
        heap.set(0, heap.remove(heap.size() - 1));
        int parent = 0;
        int maxIndex = 0;
        while (true) {
            int leftIndex = leftChild(parent);
            int rightIndex = rightChild(parent);

            if (leftIndex < heap.size() && heap.get(leftIndex) > heap.get(maxIndex)) {
                maxIndex = leftIndex;
            }

            if (rightIndex < heap.size() && heap.get(rightIndex) > heap.get(maxIndex)) {
                maxIndex = rightIndex;
            }

            if (maxIndex != parent) {
                swap(maxIndex, parent);
                parent = maxIndex;
            } else {
                break;
            }
        }
        return maxValue;
    }
}
