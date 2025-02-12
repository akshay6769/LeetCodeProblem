public class IntegeToRoman {
    public String intToRoman(int num) {
        StringBuilder roman = new StringBuilder();
        int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 1 };
        String[] symbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "I" };
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                roman.append(symbols[i]);
                num -= values[i];

            }
        }
        return roman.toString();
    }

    public static void main(String args[]) {
        int nums = 3749;
        IntegeToRoman obj = new IntegeToRoman();
        String result = obj.intToRoman(nums);
        System.out.println(result);
    }
}
