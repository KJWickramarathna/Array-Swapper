public class BubbleSort {

    // Method to perform bubble sort on an array
    public void bubbleSort(int[] arr) {
        int n = arr.length;
        // Traverse through all elements in the array
        for (int i = 0; i < n - 1; i++) {
            // Last i elements are already sorted
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if the element found is greater than the next element
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Method to print the array
    public void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Main method to test the bubble sort
    public static void main(String[] args) {
        BubbleSort sorter = new BubbleSort();
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        
        System.out.println("Unsorted array:");
        sorter.printArray(arr);
        
        sorter.bubbleSort(arr);
        
        System.out.println("Sorted array:");
        sorter.printArray(arr);
    }
}
