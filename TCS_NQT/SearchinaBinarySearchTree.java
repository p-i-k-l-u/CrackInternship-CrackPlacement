package TCS_NQT;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class SearchinaBinarySearchTree {

    public TreeNode searchBST(TreeNode root, int val) {
        while (root != null && root.val != val) {
            root = val < root.val ? root.left : root.right;
        }
        return root;
    }

    public static void main(String[] args) {
        // Example usage
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        SearchinaBinarySearchTree searchTree = new SearchinaBinarySearchTree();
        TreeNode result = searchTree.searchBST(root, 2);

        if (result != null) {
            System.out.println("Node found with value: " + result.val);
        } else {
            System.out.println("Node not found");
        }
    }
}
