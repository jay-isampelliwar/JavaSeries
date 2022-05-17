package Tree;

import java.util.ArrayList;
import java.util.Scanner;

public class LeftView {

    static Scanner sc;
    public static void main(String[] args) {

        sc = new Scanner(System.in);
        Solution1 s = new Solution1();
        LeftView tree = new LeftView();
        TreeNode root = tree.createTree();

        s.leftView(root);
    }

    public TreeNode createTree() {

        TreeNode root = null;

        System.out.println("Enter a data "+" ");
        int data = sc.nextInt();

        if (data == -1) return null;

        root = new TreeNode(data);

        System.out.println("Enter Left node data for "+data);
        root.left = createTree();

        System.out.println("Enter right node data for "+data);
        root.right = createTree();

        return root;
    }
}

class Solution1 {

    public void leftView(TreeNode root) {

        ArrayList<Integer> list = new ArrayList<>();

        if (root == null) return;

        p(root , list , 1);

        System.out.println(list);
    }

    static int maxLevel = 0;
    public static void p(TreeNode root , ArrayList<Integer> list , int level) {

        if(root == null) {
            return;
        }

        if(level > maxLevel) {
            maxLevel = level;
            list.add(root.data);
        }

        p(root.left , list , level+1);
        p(root.right , list , level+1);

    }
}


