import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] gs) {
        Scanner scan = new Scanner(System.in);
        int n = 5;
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        Arrays.sort(arr);
        int numbr = scan.nextInt();
        int res = search(arr, 0, n - 1, numbr);
        
        if(res == -1) {
            System.out.println("The given number is not present");
        }
        else {
            System.out.println("The given number " + numbr + " is present");
        }
    }

    public static int search(int[] arr, int beg, int end, int num){
        if(beg <= end) { 
            int mid = (beg + end) / 2;
            System.out.println(arr[mid]);
            
            if(arr[mid] == num) {
                return mid;
            }
            
            if(arr[mid] > num) {
                return search(arr, beg, mid - 1, num);
            } else {
                return search(arr, mid + 1, end, num);
            }
        }
        return -1;
    }
}
