package SpecialTree;

import java.util.ArrayList;
import java.util.Scanner;

public class SpecialTree {

    class TreeNode {

        int data;
        TreeNode right;
        TreeNode left;
        TreeNode middle;

        TreeNode(int data) {

            this.data = data;
            this.left = null;
            this.middle = null;
            this.right = null;
        }
    }

    public  static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {

            int data = sc.nextInt();
            if (data == -10) break;
            list.add(data);
        }
        SpecialTree specialTree = new SpecialTree();
        TreeNode root = specialTree.createTree(list);

        specialTree.printIt(root);

    }

    private void printIt(TreeNode root) {

        if(root == null) return;

        System.out.print(root.data+" ");
        printIt(root.left);
        printIt(root.middle);
        printIt(root.right);
    }

    static int i = 0;
    private TreeNode createTree(ArrayList<Integer> list) {

        TreeNode root = null;
        int data = list.get(i);
        if(data == -1) return root;

        System.out.println("Hell0");
        root = new TreeNode(list.get(i++));

        root.left = createTree(list);
        root.middle = createTree(list);
        root.right = createTree(list);

        return root;

    }
}
