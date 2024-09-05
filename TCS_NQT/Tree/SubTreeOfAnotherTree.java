package TCS_NQT.Tree;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class SubTreeOfAnotherTree {

    String preOrderTraversal(TreeNode node) {
        if (node == null)
            return "null";

        StringBuilder sb = new StringBuilder();
        sb.append(node.val).append(",");
        sb.append(preOrderTraversal(node.left)).append(",");
        sb.append(preOrderTraversal(node.right));

        return sb.toString();
    }

    boolean isSubTree(TreeNode root, TreeNode subRoot) {
        String fullTree = preOrderTraversal(root);
        String subTree = preOrderTraversal(subRoot);

        return fullTree.contains(subTree);
    }

    public static void main(String[] args) {
        SubTreeOfAnotherTree tree = new SubTreeOfAnotherTree();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(4);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(6);

        TreeNode subRoot = new TreeNode(4);
        subRoot.left = new TreeNode(1);
        subRoot.right = new TreeNode(2);

        System.out.println("Is subRoot a subtree of root? " + tree.isSubTree(root, subRoot));
    }
}
