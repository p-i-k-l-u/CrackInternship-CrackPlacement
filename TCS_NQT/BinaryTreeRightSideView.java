package TCS_NQT;

import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class BinaryTreeRightSideView {

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        recursionRight(root, 0, res);
        return res;
    }

    private void recursionRight(TreeNode root, int level, List<Integer> res) {
        if (root == null) {
            return;
        }

        if (res.size() == level) {
            res.add(root.val);
        }
        recursionRight(root.right, level + 1, res);
        recursionRight(root.left, level + 1, res);
    }

    public static void main(String[] args) {
        BinaryTreeRightSideView tree = new BinaryTreeRightSideView();

        // Creating a sample binary tree:
        // 1
        // / \
        // 2 3
        // \ \
        // 5 4
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(4);

        List<Integer> result = tree.rightSideView(root);
        System.out.println(result); // Output: [1, 3, 4]
    }
}
