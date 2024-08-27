package TCS_NQT;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class CheckBalanceBinaryTreeOrNot {

    public boolean isBalanced(TreeNode root) {
        return checkHeight(root) != -1;
    }

    int checkHeight(TreeNode root) {
        if (root == null)
            return 0;

        int leftHeight = checkHeight(root.left);
        if (leftHeight == -1)
            return -1;
        int rightHeight = checkHeight(root.right);
        if (rightHeight == -1)
            return -1;

        if (Math.abs(leftHeight - rightHeight) > 1)
            return -1;
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        CheckBalanceBinaryTreeOrNot cbbt = new CheckBalanceBinaryTreeOrNot();

        // Creating a sample tree:
        // 1
        // / \
        // 2 3
        // / \ \
        // 4 5 6
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        boolean result = cbbt.isBalanced(root);
        System.out.println("Is the binary tree balanced? " + result);
    }
}
