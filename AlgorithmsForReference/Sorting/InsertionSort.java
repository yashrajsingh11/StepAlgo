import java.util.Scanner;

public class InsertionSort {

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
        for(int i = 1; i<n;i++) {
            int newElement = input[i];
            int j;
            for(j = i; j > 0 && input[j-1]>newElement; j--) {
                input[j] = input[j-1];
            }
            input[j] = newElement;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(input[i] + " ");
        }

    }

}
