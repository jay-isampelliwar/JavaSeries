package BinarySearchTree;

import java.util.*;
public class MyBST {
    static Scanner sc;
    public static void main(String[] args) {

         sc = new Scanner(System.in);
        MyBST myBST = new MyBST();
        TreeNode root;
        root = myBST.createBST();
        print(root);
        System.out.println();
        levelOrderPrint(root);
    }

    private static void levelOrderPrint(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);

        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            if (cur == null) {
                System.out.println();
                if(queue.isEmpty()) break;
                queue.add(null);

            }
            else {
                System.out.print(cur.data+" ");

                if (cur.left != null) queue.add(cur.left);
                if (cur.right != null) queue.add(cur.right);
            }

        }
    }

//My logic

//    public TreeNode createBST() {
//
//        System.out.println("Enter data for root");
//        int data = sc.nextInt();
//        TreeNode root = new TreeNode(data);
//
//        while (data != -1) {
//
//            System.out.println("Enter data : ");
//            data = sc.nextInt();
//            if (data == -1) break;
//            TreeNode node = new TreeNode(data);
//            insert(root ,node);
//        }
//
//        return root;
//    }
//
//    private void insert(TreeNode root ,TreeNode node) {
//
//        if(root.data > node.data) {
//            if (root.left == null) {
//                root.left = node;
//                return;
//            }
//            else {
//                insert(root.left , node);
//            }
//        }
//        else {
//
//            if (root.right == null) {
//                root.right = node;
//                return;
//            }
//            else {
//                insert(root.right , node);
//            }
//        }
//
//        return;
//    }
    public TreeNode createBST() {

        System.out.println("Enter data for root");
        int data = sc.nextInt();
        TreeNode root = new TreeNode(data);

        while (true) {
            System.out.println("Enter data to insert");
            data = sc.nextInt();
            if(data == -1) break;
            insertItrative(root , data);
        }

        return root;
    }

    private TreeNode insertRecursivly(TreeNode root, int data) {

        if (root == null) return new TreeNode(data);

        if(root.data > data) {
            root.left = insertRecursivly(root.left , data);
        }
        else if(root.data < data) {
            root.right = insertRecursivly(root.right , data);
        }

        return root;
    }


    public static TreeNode insertItrative(TreeNode root , int data) {

        TreeNode cur = root;
        TreeNode parent = null;

        while (cur != null) {

            parent = cur;

            if(cur.data > data) {
                cur = cur.left;
            } else if (cur.data < data) {
                cur = cur.right;
            }
        }

        if (parent == null) return new TreeNode(data);

        if(parent.data > data) {

            parent.left = new TreeNode(data);
        }
        else if (parent.data < data) {
            parent.right = new TreeNode(data);
        }


        return root;
    }

    public static void print(TreeNode root) {

        if (root == null) return;

        print(root.left);
        System.out.print(root.data+" ");
        print(root.right);
    }

}
