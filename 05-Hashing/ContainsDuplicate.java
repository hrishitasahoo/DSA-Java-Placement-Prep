import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (int x : arr) {
            if (set.contains(x)) {
                return true;
            }

            set.add(x);
        }

        return false;
    }
}

public class ContainsDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Solution obj = new Solution();
        System.out.println(obj.containsDuplicate(arr));

        sc.close();
    }
}
