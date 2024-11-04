import java.util.Arrays;

//Class name ArraySwapper//
public class ArraySwapper {
    static Integer [] array = {5,6,8,921,23,76,92,107,8143};
    static int outerIndex;
    
    public static void swap(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static void insert(int endIndex) {
        int i = endIndex;
        while (i > 0 && array[i]<array[i - 1]){
            swap(i, i - 1);
            System.out.println("i: " + i + ",j: " + (i - 1) + ","
                    + "Array state: " + Arrays.deepToString(array));
            i--;
        }-.
    }
    public static void insertionSort(){
        for (outerIndex = 1; outerIndex < array.length; outerIndex++) {
            insert(outerIndex);// insert method calling// // insert ekata mulinma pass karana agaya 1 wenawa //
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Array before sorting: "
            + Arrays.deepToString(array));
        
        insertionSort();// they called insertion sort here//
        
        System.out.println("Array after sorting: "
            + Arrays.deepToString(array));
    }
    
}
