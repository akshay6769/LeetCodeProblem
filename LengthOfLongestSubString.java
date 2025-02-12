import java.util.HashSet;

public class LengthOfLongestSubString {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int left = 0, right = 0;
        int maxLength = 0;
        HashSet<Character> set = new HashSet<>();

        while (right < n) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }

        return maxLength;
    }

    public static void main(String args[]) {
        String s = "abcabcbb";
        int result = lengthOfLongestSubstring(s);
        System.out.println(result); // Output: 3
    }
}
