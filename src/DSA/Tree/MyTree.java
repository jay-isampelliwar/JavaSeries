package DSA.Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class MyTree {
    static Scanner sc;

    public static void main(String args[]) {

        sc = new Scanner(System.in);
        MyTree tree = new MyTree();

        TreeNode root = tree.createTree();

//        System.out.print("INORDER : ");
//        tree.inOrder(root);
        System.out.print("\nPREORDER : ");
        tree.itrativePreOrder(root);
//        System.out.print("\nPOSTORDER : ");
//        tree.postOrder(root);
//        System.out.print("\nLEVEL ORDER TRAVEL : ");
//        tree.levelOrder(root);

    }

    public TreeNode createTree() {

        TreeNode root = null;

        System.out.println("Enter data");
        int data = sc.nextInt();

        root = new TreeNode(data);

        if (data == -1) return null;

        System.out.println("Enter Left node data for " + data);
        root.left = createTree();

        System.out.println("Enter right node data for " + data);
        root.right = createTree();

        return root;
    }

    public void inOrder(TreeNode root) {

        if (root == null) return;

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public void preOrder(TreeNode root) {

        if (root == null) return;

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void itrativePreOrder(TreeNode root) {
        if (root == null) return;

        Stack<TreeNode> st = new Stack<>();
        st.push(root);

        while (!st.isEmpty()) {

            TreeNode cur = st.pop();
            System.out.print(cur.data + " ");

            if (cur.right != null) {
                st.push(cur.right);
            }
            if (cur.left != null) {
                st.push(cur.left);
            }
        }

        return;
    }

    public void postOrder(TreeNode root) {

        if (root == null) return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public void levelOrder(TreeNode root) {

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {

            TreeNode currentNode = q.poll();
            System.out.print(currentNode.data + " ");
            if (currentNode.left != null)
                q.offer(currentNode.left);
            if (currentNode.right != null)
                q.offer(currentNode.right);
        }
    }
}

class TreeNode {

    TreeNode left, right;
    int data;

    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
