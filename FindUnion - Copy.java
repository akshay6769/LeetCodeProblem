import java.util.ArrayList;

class FindUnion {
    static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m) {
        int i = 0, j = 0;
        ArrayList<Integer> Union = new ArrayList<>();
        
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) { // case 1: arr1[i] is smaller
                if (Union.isEmpty() || Union.get(Union.size() - 1) != arr1[i]) {
                    Union.add(arr1[i]);
                }
                i++;
            } else if (arr1[i] > arr2[j]) { // case 2: arr2[j] is smaller
                if (Union.isEmpty() || Union.get(Union.size() - 1) != arr2[j]) {
                    Union.add(arr2[j]);
                }
                j++;
            } else { // case 3: arr1[i] == arr2[j]
                if (Union.isEmpty() || Union.get(Union.size() - 1) != arr1[i]) {
                    Union.add(arr1[i]);
                }
                i++;
                j++;
            }
        }
        
        // Add remaining elements of arr1
        while (i < n) {
            if (Union.isEmpty() || Union.get(Union.size() - 1) != arr1[i]) {
                Union.add(arr1[i]);
            }
            i++;
        }
        
        // Add remaining elements of arr2
        while (j < m) {
            if (Union.isEmpty() || Union.get(Union.size() - 1) != arr2[j]) {
                Union.add(arr2[j]);
            }
            j++;
        }

        return Union;
    }

    public static void main(String args[]) {
        int n = 10;
        int m = 7;
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {2, 3, 4, 4, 5, 11,12};
        ArrayList<Integer> Union = findUnion(arr1, arr2, n, m);
        System.out.println("Union of arr1 and arr2 is ");
        for (int val : Union) {
            System.out.print(val + " ");
        }
    }
}
