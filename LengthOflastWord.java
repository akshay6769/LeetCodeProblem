public class LengthOflastWord {
    public int lengthOfLastWord(String s) {
        int n = s.length();
        int count = 0;
        int i = n - 1;

        // Ignore trailing spaces
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // Count last word length
        while (i >= 0 && s.charAt(i) != ' ') {
            count++;
            i--;
        }

        return count;
    }

    public static void main(String args[]) {
        String s = "Hello World";
        LengthOflastWord obj = new LengthOflastWord();
        int result = obj.lengthOfLastWord(s);
        System.out.println(result); // Output: 5
    }
}
