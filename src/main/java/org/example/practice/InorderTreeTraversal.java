package org.example.practice;

import java.util.*;

public class InorderTreeTraversal {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> li = new ArrayList<>();
        if (root == null) { return li; }

        Stack<TreeNode> st = new Stack<>();
        TreeNode current = root;
        while(current != null || !st.isEmpty()) {
            while(current != null) {
                st.push(current);
                current = current.left;
            }
            current = st.pop();
            li.add(current.val);
            current = current.right;
        }

        return li;
    }

    public static void main(String[] args) {
//        System.out.println(new InorderTreeTraversal().inorderTraversal(new TreeNode(1,null, new TreeNode(2, new TreeNode(3, null, null), null))));
        System.out.println(new InorderTreeTraversal().inorderTraversal(new TreeNode(1
                , new TreeNode(2, new TreeNode(4, null, null), new TreeNode(5, null, null))
                , new TreeNode(3, new TreeNode(6, null, null), new TreeNode(7, null, null))
        )));

    }
}
