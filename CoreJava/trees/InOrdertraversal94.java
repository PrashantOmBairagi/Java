package CoreJava.trees;

import java.util.ArrayList;
import java.util.List;

public class InOrdertraversal94 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example 1: [1, null, 2, 3]
        // Tree Structure: 1 -> Right: 2 -> Left: 3
        TreeNode root1 = new TreeNode(1);
        root1.right = new TreeNode(2);
        root1.right.left = new TreeNode(3);

        System.out.println("Example 1 Ineorder: " + sol.inorderTraversal(root1));
        // Expected Output: [1, 3, 2]

        // Example 2: [1, 2, 3, 4, 5]
        // Tree Structure: 1 is root, 2 & 3 are children, 4 & 5 are children of 2
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);
        root2.left.left = new TreeNode(4);
        root2.left.right = new TreeNode(5);

        System.out.println("Example 2 Ineorder: " + sol.inorderTraversal(root2));
        // Expected Output: [4, 2, 5, 1, 3]
    }
}
