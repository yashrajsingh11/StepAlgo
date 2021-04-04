import java.util.Scanner;

public class BubbleSort {
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
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (input[j] > input[j + 1]) {
                    swap(input, j, j + 1);
                    for(int k = 0; k < n; k++) {
                        System.out.print(input[k] + " ");
                    }
                    System.out.println();
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(input[i] + " ");
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

