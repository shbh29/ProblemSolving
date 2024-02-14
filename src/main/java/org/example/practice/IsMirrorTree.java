package org.example.practice;

import java.util.*;

public class IsMirrorTree {
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

    public boolean isSymmetric(TreeNode root) {
        Stack<TreeNode> traversalStack = new Stack<>();
        List<TreeNode> leftSubTreeNodes = new ArrayList<>();
        List<TreeNode> rightSubTreeNodes = new ArrayList<>();

        if(root == null || (root.left == null && root.right == null)) { return true; }
        else if (root.left == null || root.right == null) { return false; }

        // traverse left subtree
        traversalStack.push(root.left);
        leftSubTreeNodes.add(root.left);
        while (!traversalStack.isEmpty()) {
            TreeNode current = traversalStack.pop();
            if(current.right != null) {
                traversalStack.add(current.right);
            }
            leftSubTreeNodes.add(current.right);

            if(current.left != null) {
                traversalStack.add(current.left);
            }
            leftSubTreeNodes.add(current.left);
        }

        // traverse right subtree
        traversalStack.push(root.right);
        rightSubTreeNodes.add(root.right);
        while (!traversalStack.isEmpty()) {
            TreeNode current = traversalStack.pop();
            if(current.left != null) {
                traversalStack.add(current.left);
            }
            rightSubTreeNodes.add(current.left);
            if(current.right != null) {
                traversalStack.add(current.right);
            }
            rightSubTreeNodes.add(current.right);
        }

        // compare left subtree and right subtree
        if(leftSubTreeNodes.size() != rightSubTreeNodes.size()) { return false; }
        int i = 0;
        while(i < leftSubTreeNodes.size()) {
            TreeNode left = leftSubTreeNodes.get(i);
            TreeNode right = rightSubTreeNodes.get(i++);
            if (left == null && right == null) {

            } else if(left == null || right == null){
                return false;
            } else if(left.val != right.val) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        System.out.println(
//                new IsMirrorTree().isSymmetric(
//                        new TreeNode(1
//                                , new TreeNode(2, new TreeNode(4, null, null), new TreeNode(3, null, null))
//                                , new TreeNode(2, new TreeNode(3, null, null), new TreeNode(4, null, null))
//                        )
//                )
//        );
//        System.out.println(
//                new IsMirrorTree().isSymmetric(
//                        new TreeNode(1, new TreeNode(2, new TreeNode(3, null, null), new TreeNode(4, null, null)), null)
//                )
//        );
        System.out.println(
                new IsMirrorTree().isSymmetric(
                        new TreeNode(1
                                , new TreeNode(2 , null , new TreeNode(3, null, null))
                                , new TreeNode(2 , null , new TreeNode(3, null, null))
                        )
                )
        );
    }
}
