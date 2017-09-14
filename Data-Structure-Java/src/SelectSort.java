import java.util.Arrays;

class ArraySelect {
    private Long[] array;
    private int tag;
    private Integer min;

    public ArraySelect(Integer maxSize) {
        this.array = new Long[maxSize];
    }

    public void insert(Long num) {
        this.array[tag] = num;
        tag++;
    }

    public void sort() {
        /*记录最小值的下标*/
        min = 0;
        /*记录最小值*/
        for (int i = 0; i < tag; i++) {
            for (int j = i; j < tag; j++) {
                if (array[j] < array[min])
                      min = j;
            }
           if(array[i]!=array[min])
                change(i,min);
        }
    }
    private void change(int front,int back){
        long temp = this.array[front];
        this.array[front] = this.array[back];
        this.array[back] = temp;
    }

    public Long[] getArray() {
        return this.array;
    }
}

public class SelectSort {
    public static void main(String [] args){
        ArraySelect arraySelect = new ArraySelect(10);
        arraySelect.insert(21l);
        arraySelect.insert(28l);
        arraySelect.insert(100l);
        arraySelect.insert(2l);
        arraySelect.sort();
        Long[] array = arraySelect.getArray();
        System.out.println(Arrays.toString(array));
    }
}
