import java.util.ArrayList;
import java.util.List;

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class SortedArrayToBst {
    public TreeNode sortedArrayToBst(int[] nums) {
        if (nums.length == 0) return null;
        return constructTreeFromArray(nums, 0, nums.length - 1);
    }
    
    private TreeNode constructTreeFromArray(int[] nums, int left, int right) {
        if (left > right) return null;
        int midpoint = left + (right - left) / 2;
        TreeNode node = new TreeNode(nums[midpoint]);
        node.left = constructTreeFromArray(nums, left, midpoint - 1);
        node.right = constructTreeFromArray(nums, midpoint + 1, right);
        return node;
    }

    // Method to convert the tree to a list representation for output
    public List<Integer> bstToList(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        buildList(root, result);
        return result;
    }
    
    private void buildList(TreeNode node, List<Integer> list) {
        if (node == null) {
            list.add(null); // Add null for missing nodes
            return;
        }
        list.add(node.val);
        buildList(node.left, list);
        buildList(node.right, list);
    }

    // Example usage
    public static void main(String[] args) {
        SortedArrayToBst converter = new SortedArrayToBst();
        int[] nums = {-10, -3, 0, 5, 9};
        TreeNode bstRoot = converter.sortedArrayToBst(nums);
        
        // Convert BST to list representation and print it
        List<Integer> bstList = converter.bstToList(bstRoot);
        System.out.println(bstList); // Output: [0, -10, 5, null, -3, null, 9]
    }
}
