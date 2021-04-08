import java.util.Arrays;
import java.util.Scanner;

public class InterpolationSearch {
    public static void main(String[] rgs) {
        Scanner scan = new Scanner(System.in);
        int n = 5;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        Arrays.sort(arr);
        int numbr = scan.nextInt();
        InterpolationSearch is = new InterpolationSearch();
        int res = is.search(arr, 0, n - 1, numbr);
        
        if(res == -1) {
            System.out.println("The given number is not present");
        } else {
            System.out.println("The given number " + numbr + " is present");
        }
    }

    int search(int[] arr, int low, int high, int num) {
        int pos = 0;
        if(low <= high && num >= arr[low] && num <= arr[high]) {
            if(low == high) {
            	pos = low;
            } else {
                pos = low + (((high - low) / (arr[high] - arr[low])) * (num - arr[low]));
            }

            if(arr[pos] == num) {
                return pos;
            }
            if(num < arr[pos]) {
                return search(arr, low, pos - 1, num);
            }
            if(num > arr[pos]) {
                return search(arr, pos + 1, high, num);
            }
        }
        return -1;
    }
}
