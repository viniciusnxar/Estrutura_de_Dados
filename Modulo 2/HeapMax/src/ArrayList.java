public class ArrayList{
    private int[] array;
    private int index;
    private int maxSize;

    public ArrayList(){
        maxSize = 12;
        index = 0;
        array = new int[maxSize];
    }

    public int size(){
        return index;
    }

    private void reCreate(){
        maxSize = maxSize*2;
        int[] auxArray = new int[maxSize];
        for(int i = 0; i<index; i++){
            auxArray[i] = array[i];
        }
        array = auxArray;
    }

    public int get(int index){
        return array[index];
    }

    public void set(int index, int value){
        array[index] = value;
    }

    public void add(int value){
        array[index] = value;
        index++;
        if(index==maxSize){
            reCreate();
        }

    }

    public int remove(int index){
        int removed = array[index];

        for(int i = index+1; i<=this.index; i++){
            array[i-1] = array[i];
        }
        this.index--;
        return removed;
    }

    @Override
    public String toString() {
        String elements = "";

        for(int i = 0; i<index; i++){
            elements+= array[i]+" ";
        }
        return elements;
    }
    
}