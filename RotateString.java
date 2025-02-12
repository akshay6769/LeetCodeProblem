public class RotateString {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length())
            return false;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            // Rotate the string one step
            if (rotateOnce(s, i).equals(goal)) {
                return true;
            }
        }
        return false;
    }

    private String rotateOnce(String s, int shift) {
        int n = s.length();
        return s.substring(shift) + s.substring(0, shift);
    }

    public static void main(String args[]) {
        String s = "abcde";
        String goal = "cdeab";
        RotateString obj = new RotateString();
        boolean result = obj.rotateString(s, goal);
        System.out.println(result); // Output: true
    }
}
