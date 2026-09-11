import java.util.*;

class Solution {
    public void moveZeroes(int[] arr) {
        int index = 0;

        for (int x : arr) {
            if (x != 0) {
                arr[index++] = x;
            }
        }

        while (index < arr.length) {
            arr[index++] = 0;
        }
    }
}

public class MoveZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Solution obj = new Solution();
        obj.moveZeroes(arr);

        for (int x : arr) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}
