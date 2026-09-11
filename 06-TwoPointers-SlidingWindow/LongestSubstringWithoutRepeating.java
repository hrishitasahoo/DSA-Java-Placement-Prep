import java.util.*;

class Solution {
    public int longestSubstring(String str) {
        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int answer = 0;

        for (int right = 0; right < str.length(); right++) {
            while (set.contains(str.charAt(right))) {
                set.remove(str.charAt(left));
                left++;
            }

            set.add(str.charAt(right));
            answer = Math.max(answer, right - left + 1);
        }

        return answer;
    }
}

public class LongestSubstringWithoutRepeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        Solution obj = new Solution();
        System.out.println(obj.longestSubstring(str));

        sc.close();
    }
}
