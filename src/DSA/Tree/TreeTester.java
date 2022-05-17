package Tree;

import java.util.ArrayList;
import java.util.Scanner;

public class TreeTester {

    static Scanner sc;
    static int index = 0;
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        sc = new Scanner(System.in);
        Solution s = new Solution();
        TreeTester tree = new TreeTester();

        while (true) {

            int data = sc.nextInt();

            if (data == -11) break;
            list.add(data);
        }

        TreeNode root = tree.createTree(list);

        s.inOrder(root);
        System.out.println();
        s.preOrder(root);
        System.out.println();
        s.postOrder(root);



    }

    public TreeNode createTree(ArrayList<Integer> list) {

        TreeNode root = null;

        int data = list.get(index++);

        if (data == -1) return null;

        root = new TreeNode(data);

        root.left = createTree(list);

        root.right = createTree(list);

        return root;
    }
}

class Solution {

    public void inOrder(TreeNode root) {

        if(root == null) return;

        preOrder(root.left);
        System.out.print(root.data+" ");
        preOrder(root.right);
    }

    public void preOrder(TreeNode root) {

        if(root == null) return;

        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public void postOrder(TreeNode root) {

        if(root == null) return;

        preOrder(root.left);
        preOrder(root.right);
        System.out.print(root.data+" ");
    }
}
class Node {

    TreeNode left;
    TreeNode right;
    int data;

    public Node(int data) {

        this.data = data;
    }
}

