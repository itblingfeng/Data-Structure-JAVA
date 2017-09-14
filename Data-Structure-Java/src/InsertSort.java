import java.util.Arrays;

//插入排序
class InsertArray {
    private Long[] array;
    private int tag;

    public InsertArray(Integer maxSize) {
        this.array = new Long[maxSize];
    }

    public void insert(Long num) {
        this.array[tag] = num;
        tag++;
    }

    public void sort() {
        /*通过最右边的数(最大值)依次比较获得合适的插入位置，*/
        //  20 10 8 33 2 9 13
        // i-1 i i+1
        for (int i = 1; i < tag; i++) {
            long temp = array[i];
            int j = i;
            while(j>0&&array[j-1]>=temp){
                array[j] = array[j-1];
                --j;
            }
            array[j] = temp;
        }
    }

    public Long[] getArray() {
        return this.array;
    }
}

public class InsertSort {
    public static void main(String[] args){
        long start = System.currentTimeMillis();
        InsertArray insertArray = new InsertArray(10);
        insertArray.insert(13l);
        insertArray.insert(12l);
        insertArray.insert(9l);
        insertArray.insert(102l);
        insertArray.insert(199l);
        insertArray.sort();
        Long[] array = insertArray.getArray();
        System.out.println(Arrays.toString(array));
        long end = System.currentTimeMillis();
        System.out.println(end -start);
    }
}
