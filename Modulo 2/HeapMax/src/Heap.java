abstract class Heap{
    protected ArrayList heap;
    public Heap(){
        heap = new ArrayList();
    }

    public ArrayList getHeap(){
        return heap;
    }

    public int leftChild(int index){
        return index*2+1;
    }

    public int rightChild(int index){
        return index*2+2;
    }

    public int parent(int index){
        return (index-1)/2;
    }

    public void swap(int index1, int index2){
        int aux = heap.get(index1);
        heap.set(index1, heap.get(index2));
        heap.set(index2,aux);
    }

    public abstract void insert(int value);
    public abstract Integer delete();
}