import java.util.*;

class Solution {
    public int missingNumber(int[] arr) {
        int n = arr.length;
        int sum = n * (n + 1) / 2;

        for (int x : arr) {
            sum -= x;
        }

        return sum;
    }
}

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Solution obj = new Solution();
        System.out.println(obj.missingNumber(arr));

        sc.close();
    }
}
