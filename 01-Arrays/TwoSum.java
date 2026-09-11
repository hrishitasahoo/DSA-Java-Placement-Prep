import java.util.*;

class Solution {
    public int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int need = target - arr[i];

            if (map.containsKey(need)) {
                return new int[]{map.get(need), i};
            }

            map.put(arr[i], i);
        }

        return new int[]{-1, -1};
    }
}

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        Solution obj = new Solution();
        int[] ans = obj.twoSum(arr, target);

        System.out.println(ans[0] + " " + ans[1]);

        sc.close();
    }
}
