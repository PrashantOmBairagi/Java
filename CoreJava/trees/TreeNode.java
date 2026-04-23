package CoreJava.trees;
class Node{
    int val;
    Node left;
    Node right;

    Node(int val){
        this.val = val;
    }
}
/*                       a
                       /   \
                      b     c
                    / \    / \
                   d   e  f   null

 */
public class TreeNode {
    static void main() {
        Node a = new Node (10);
        Node b = new Node (20);
        Node c = new Node (30);
        Node d = new Node (40);
        Node e = new Node (50);
        Node f = new Node (60);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f;
        display(a);
        System.out.println("Sum = " + Sumtree(a));
        System.out.println("Multiply= " + mulTree(a));
        System.out.println("Max = " + maxValOfTree(a));
        System.out.println("SizeOfTree: "+ sizeOfTree(a));
        int level = levelOfTree(a);
        System.out.println("Level/height of Tree:" + level + "/" + (level-1) +" respectively");

    }
    private static void display(Node root) {
        if(root == null) return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);

    }
    private static int Sumtree( Node root) {
        if(root == null) return 0;
        return root.val + Sumtree(root.left) + Sumtree(root.right);
    }
    private static long mulTree( Node root) {
        if(root == null) return 1;
        return root.val * mulTree(root.left) * mulTree(root.right);
    }
    private static int maxValOfTree( Node root) {
        if(root == null) return 0;
        return Math.max(root.val, Math.max(maxValOfTree(root.left), maxValOfTree(root.right)));
    }
    private static int sizeOfTree( Node root) {
        if(root == null) return 0;
        return 1 + sizeOfTree(root.left) + sizeOfTree(root.right);
    }
    private static int levelOfTree( Node root) {
        if(root == null) return 0;
        return 1+ Math.max(levelOfTree(root.left), levelOfTree(root.right));
    }
}
