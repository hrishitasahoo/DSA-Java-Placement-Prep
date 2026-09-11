import java.util.*;

class Solution {
    public boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        char[] x = a.toCharArray();
        char[] y = b.toCharArray();

        Arrays.sort(x);
        Arrays.sort(y);

        return Arrays.equals(x, y);
    }
}

public class CheckAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();

        Solution obj = new Solution();
        System.out.println(obj.isAnagram(a, b));

        sc.close();
    }
}
