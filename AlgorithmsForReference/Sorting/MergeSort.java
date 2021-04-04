import java.util.Scanner;

public class MergeSort {

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
        int beg = 0;
        int end = n - 1;
        mergeSort(input,beg,end);

        for (int i = 0; i < n; i++) {
            System.out.print(input[i] + " ");
        }
    }

    public static void merge(int[] input, int beg, int mid, int end) {

        int n1 = mid - beg + 1;
        int n2 = end - mid;
        int[] temp1 = new int[n1];
        int[] temp2 = new int[n2];
        
        for(int i = 0; i < n1; i++) {
            temp1[i] = input[beg + i];
        }
        
        for(int j = 0; j < n2; j++) {
            temp2[j] = input[1 + mid + j];
        }

        int i = 0;
        int j = 0;
        int k = beg;
        
        while(i < n1 && j < n2) {
            if(temp1[i] <= temp2[j]) {
                input[k] = temp1[i];
                i = i + 1;
            } else {
                input[k] = temp2[j];
                j = j + 1;
            }
            k = k + 1;
        }

        while(i < n1) {
            input[k] = temp1[i];
            i = i + 1;
            k = k + 1;
        }

        while(j < n2) {
            input[k] = temp2[j];
            j = j + 1;
            k = k + 1;
        }
    }

    public static void mergeSort (int[] input, int beg, int end) {
        if(beg < end) {
            int mid = (beg + end) / 2;
            for(int i = beg; i <= end; i++){
                System.out.print(input[i] + " ");
            }

            System.out.println();
            mergeSort(input, beg, mid);
            mergeSort(input, mid + 1, end);
            merge(input, beg, mid, end);
            
            for(int i = beg; i <= end; i++){
                System.out.print(input[i] + " ");
            }
            System.out.println();
        }
    }
}
