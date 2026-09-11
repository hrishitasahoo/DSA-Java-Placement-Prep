import java.util.*;

class Solution {
    public int maxSubArray(int[] arr) {
        int current = arr[0];
        int best = arr[0];

        for (int i = 1; i < arr.length; i++) {
            current = Math.max(arr[i], current + arr[i]);
            best = Math.max(best, current);
        }

        return best;
    }
}

public class MaximumSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Solution obj = new Solution();
        System.out.println(obj.maxSubArray(arr));

        sc.close();
    }
}
