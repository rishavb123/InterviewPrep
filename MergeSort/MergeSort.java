public class MergeSort {

    public static int[] sort(int[] arr, int low, int high) {
        
        return arr;

    }

    public static void main(String[] args) {
        int[] arr = new int[] {2, 1, 5, 7, 12, 15, 3};
        printArr(arr);
        sort(arr, 0, arr.length - 1);
        printArr(arr);
    }

    public static void printArr(int[] arr) {
        for(int a: arr)
            System.out.print(a + " ");
        System.out.println();
    }

}