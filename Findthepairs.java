import java.util.*;

public class Findthepairs {

    public static long findThePair(List<Integer> arr) {
        long evenCount = 0, oddCount = 0;

        for (int num : arr) {
            if (num % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }

        long evenPairs = (evenCount * (evenCount - 1)) / 2;
        long oddPairs = (oddCount * (oddCount - 1)) / 2;

        return evenPairs + oddPairs;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        System.out.println(findThePair(arr));
    }
}
