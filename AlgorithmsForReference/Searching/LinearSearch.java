import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 10;
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        
        int numbr = scan.nextInt();
        int res = search(arr, n, numbr);
        if(res == -1) {
            System.out.println("The given number is not present");
        }
        else {
            System.out.println("The given number " + numbr + " is at index " + res);
        }
    }

    public static int search(int[] arr, int n, int num) {
        for (int i = 0; i < n; i++) {
            if(arr[i] == num) {
                return i;
            }
        }
        return -1;
    }
}
