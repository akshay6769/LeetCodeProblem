import java.util.*;

public class RomanToInteger {
    public int romanToInt(String s) {
        // Map for storing Roman numerals and their values
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int total = 0;
        int prevValue = 0;

        // Traverse the string from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = romanMap.get(s.charAt(i));

            if (currentValue < prevValue) {
                total -= currentValue;  // Subtract smaller value (for cases like IV, IX)
            } else {
                total += currentValue;  // Otherwise, add value
            }
            prevValue = currentValue;
        }
        return total;
    }

    public static void main(String args[]) {
        String s = "MCMXCIV"; // Expected output: 1994
        RomanToInteger obj = new RomanToInteger();
        int result = obj.romanToInt(s);
        System.out.println(result);
    }
}

