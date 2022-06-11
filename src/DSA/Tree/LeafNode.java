package DSA.Tree;

import java.util.Scanner;

public class LeafNode {

    static Scanner sc;

    public static void main(String[] args) {

        sc = new Scanner(System.in);
        Solution5 s = new Solution5();
        LeafNode leafNode = new LeafNode();
        TreeNode root = leafNode.createTree();

        s.leafs(root);
    }

    public TreeNode createTree() {

        TreeNode root;

        System.out.println("Enter a data " + " ");
        int data = sc.nextInt();

        if (data == -1) return null;

        root = new TreeNode(data);

        System.out.println("Enter Left node data for " + data);
        root.left = createTree();

        System.out.println("Enter right node data for " + data);
        root.right = createTree();

        return root;
    }
}

class Solution5 {

    public void leafs(TreeNode root) {

        if (root == null) return;

        if (root.left == null && root.right == null) {

            System.out.print(root.data + " ");
        }

        leafs(root.left);
        leafs(root.right);
    }
}