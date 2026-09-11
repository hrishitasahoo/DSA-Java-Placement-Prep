import java.util.*;

class Solution {
    public HashMap<Character, Integer> frequency(String str) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        return map;
    }
}

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        Solution obj = new Solution();
        System.out.println(obj.frequency(str));

        sc.close();
    }
}
