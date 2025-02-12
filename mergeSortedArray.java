import java.util.*;

public class mergeSortedArray {
    public static void merge(int[] nums1, int[] nums2, int n, int m) {
        // Declare 2 pointers:
        int left = n - 1;
        int right = 0;
        // swap the element until nums1[left] is
        // smaller than nums2[right];
        while (left >= 0 && right < m) {
            if (nums1[left] > nums2[right]) {
                int temp = nums1[left];
                nums1[left] = nums2[right];
                nums2[right] = temp;
                left--;
                right++;
            } else {
                break;
            }
        }
        // sort nums1[] and nums2[] individually:
        Arrays.sort(nums1);
        Arrays.sort(nums2);
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 4, 8, 10 };
        int[] nums2 = { 2, 3, 9 };
        int n = 4, m = 3;
        merge(nums1, nums2, n, m);
        System.out.println("The merged arrays are:");
        System.out.print("nums1[] = ");
        for (int i = 0; i < n; i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.print("\nnums2[] = ");
        for (int i = 0; i < m; i++) {
            System.out.print(nums2[i] + " ");
        }
        System.out.println();
    }
}
