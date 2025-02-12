public class CheckStrinEqualNotToSwap {
    public static boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2)) {
            return true;
        }

        StringBuilder sr = new StringBuilder(s2);
        int n = sr.length();
        int start = 0;
        int end = n - 1;
        while (start < end) {
            char temp = s2.charAt(start);
            sr.charAt(start) = sr.charAr(end);
            sr.charAt(end) = temp;
            if (s1.equals(sr)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        String s1 = "bank";
        String s2 = "kanb";
        boolean result = areAlmostEqual(s1, s2);
        System.out.println(result);
    }

}
