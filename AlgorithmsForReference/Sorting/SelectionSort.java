import java.util.Scanner;

public class SelectionSort {

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
        for(int i = n-1; i > 0; i--) {
            int largest = 0;
            for(int j = 1;j <= i; j++) {
                if(input[j] > input[largest]) {
                    largest = j;
                }
            }
            swap(input,largest,i);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(input[i] + " ");
        }

    }
    public static void swap(int[] array, int i, int j) {

        if(i==j)
            return;
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }

}
