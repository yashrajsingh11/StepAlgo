import java.util.Arrays;
import java.util.Scanner;

public class JumpSearch {
    public static void main(String[] rgs){
        Scanner scan = new Scanner(System.in);
        int n = 5;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        Arrays.sort(arr);
        int numbr = scan.nextInt();
        JumpSearch js = new JumpSearch();
        int res = js.search(arr, n, numbr);
        if(res == -1) {
            System.out.println("The given number is not present");
        }
        else {
            System.out.println("The given number " + numbr + " is present");
        }
    }

    int search(int arr[], int n, int num) {
        int jump = (int)Math.sqrt(n);
        int prev_jump = 0;
        for (int i = 0; i < n; i++) {
            if(arr[jump] == num) {
                return jump;
            }
            if(arr[jump] > num) {
                break;
            }
            prev_jump = jump;
            jump = jump + (int)Math.sqrt(n);
            if(jump > n) {
                return -1;
            }
        }
       
        for (int i = prev_jump; i < jump; i++) {
            if(arr[i] == num){
                return i;
            }
        }
        return -1;
    }
}
