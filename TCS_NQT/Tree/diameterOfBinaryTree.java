package TCS_NQT.Tree;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class diameterOfBinaryTree {

    int diameter = 0;

    int findMax(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int lh = findMax(root.left);
        int rh = findMax(root.right);

        // Update the diameter if the path through root is larger
        diameter = Math.max(diameter, lh + rh);

        // Return the height of the tree
        return 1 + Math.max(lh, rh);
    }

    int diameterOfBinaryTree(TreeNode root) {
        findMax(root);
        return diameter;
    }

    public static void main(String[] args) {
        diameterOfBinaryTree tree = new diameterOfBinaryTree();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println("Diameter of the tree is: " + tree.diameterOfBinaryTree(root));
    }
}
