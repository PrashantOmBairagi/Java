package CoreJava.trees;

import java.util.*;

public class PreOrderTraversal144 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example 1: [1, null, 2, 3]
        // Tree Structure: 1 -> Right: 2 -> Left: 3
        TreeNode root1 = new TreeNode(1);
        root1.right = new TreeNode(2);
        root1.right.left = new TreeNode(3);

        System.out.println("Example 1 Preorder: " + sol.preorderTraversal(root1));
        // Expected Output: [1, 2, 3]

        // Example 2: [1, 2, 3, 4, 5]
        // Tree Structure: 1 is root, 2 & 3 are children, 4 & 5 are children of 2
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);
        root2.left.left = new TreeNode(4);
        root2.left.right = new TreeNode(5);

        System.out.println("Example 2 Preorder: " + sol.preorderTraversal(root2));
        // Expected Output: [1, 2, 4, 5, 3]
    }
}
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        traversal(root,result);
        return result;
    }
    private static void traversal(TreeNode root,List<Integer> result ){
        if (root == null) return;
        result.add(root.val);
        traversal(root.left,result);
        traversal(root.right,result);
    }
}
