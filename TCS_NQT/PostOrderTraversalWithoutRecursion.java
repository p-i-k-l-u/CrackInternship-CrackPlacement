package TCS_NQT;

import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class PostOrderTraversalWithoutRecursion {
    public List<Integer> postOrder(TreeNode root) {
        Stack<TreeNode> st1 = new Stack<TreeNode>();
        Stack<TreeNode> st2 = new Stack<TreeNode>();
        List<Integer> postOrder = new ArrayList<Integer>();

        if (root == null)
            return postOrder;

        st1.push(root);
        while (!st1.isEmpty()) {
            root = st1.pop();
            st2.add(root);
            if (root.left != null)
                st1.push(root.left);
            if (root.right != null)
                st1.push(root.right);
        }
        while (!st2.isEmpty()) {
            postOrder.add(st2.pop().val);
        }
        return postOrder;
    }

    public static void main(String[] args) {
        PostOrderTraversalWithoutRecursion pot = new PostOrderTraversalWithoutRecursion();

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

        List<Integer> result = pot.postOrder(root);
        System.out.println(result);
    }
}
