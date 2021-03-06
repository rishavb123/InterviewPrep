public class QuickSort {
    
    public static int[] sort(int[] arr, int low, int high) {
        if(low < high) {
            int pi = partition(arr, low, high);
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
        return arr;
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];

        System.out.println("Pivot: " + pivot);
        int i = low - 1;
        for(int j = low; j < high; j++) {
            if(arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                printArr(arr);
            }
        }

        int temp2 = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp2;

        printArr(arr);
        return i + 1;
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