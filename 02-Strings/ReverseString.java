import java.util.*;

class Solution {
    public String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        Solution obj = new Solution();
        System.out.println(obj.reverse(str));

        sc.close();
    }
}
