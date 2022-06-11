package DSA.Tree;

import java.util.ArrayList;
import java.util.Scanner;

public class OnlyRight {

    static Scanner sc;

    public static void main(String[] args) {

        sc = new Scanner(System.in);
        Solution4 s = new Solution4();
        OnlyRight o = new OnlyRight();
        TreeNode root = o.createTree();

        s.onlyRight(root);
    }

    public TreeNode createTree() {

        TreeNode root = null;

        System.out.println("Enter a data ");
        int data = sc.nextInt();

        if (data == -1) return root;

        root = new TreeNode(data);

        System.out.println("Enter left data for " + data);
        root.left = createTree();
        System.out.println("Enter Right data for " + data);
        root.right = createTree();


        return root;

    }
}

class Solution4 {

    public void onlyRight(TreeNode root) {

        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) return;

        list.add(root.data);

        process(root, list);

        System.out.println(list);
    }

    public void process(TreeNode root, ArrayList<Integer> list) {

        if (root == null) return;

        if (root.right != null) {

            list.add(root.right.data);
        }

        process(root.right, list);
        process(root.left, list);
    }
}
