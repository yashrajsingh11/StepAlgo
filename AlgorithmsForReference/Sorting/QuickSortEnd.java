import java.util.Scanner;

public class QuickSortEnd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = scanner.nextInt();
        int[] input = new int[n];
        System.out.println("Enter the elements for an array");

        for (int i = 0; i < n; i++) {
            input[i] = scanner.nextInt();
        }

        scanner.close();
        quickSort(input, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(input[i] + " ");
        }
    }

    public static int partition(int[] input, int beg, int end) {

        int pivot = input[end];
        int i = beg;
        int k = beg;
        int j = end;

        while(i < j) {
            if(input[i] > pivot) {
                i = i + 1;
            } else {
                swap(input, i, k);
                for (int m = beg; m <= end; m++) {
                    System.out.print(input[m] + " ");
                }
                System.out.println();
                i = i + 1;
                k = k + 1;
            }
        }

        swap(input,k,j);
        for (int m = beg; m <= end; m++) {
            System.out.print(input[m] + " ");
        }
        System.out.println();
        return k;
    }

    public static void quickSort(int[] input, int beg, int end) {
        if (beg < end) {
            int pivotIndex = partition(input, beg, end);
            quickSort(input, beg, pivotIndex - 1);
            quickSort(input, pivotIndex + 1, end);
        }
    }

    public static void swap(int[] array, int i, int j) {
        if(i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        System.out.println(array[i] + " and " + array[j] + " got swapped");
    }
}
