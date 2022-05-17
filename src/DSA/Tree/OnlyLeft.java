package Tree;

import java.util.ArrayList;
import java.util.Scanner;

public class OnlyLeft {

    static Scanner sc;
    public static void main(String[] args) {

        sc = new Scanner(System.in);
        Solution3 s = new Solution3();
        OnlyLeft tree = new OnlyLeft();
        TreeNode root = tree.createTree();

        s.onlyLeft(root);
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
class Solution3 {

    public void onlyLeft(TreeNode root) {

        ArrayList<Integer> list = new ArrayList<>();

        if (root == null) return;

        list.add(root.data);

        p(root , list);

        System.out.println(list);
    }

    public static void p(TreeNode root , ArrayList<Integer> list) {

        if (root == null) return;

        if (root.left != null) {

            list.add(root.left.data);
        }

        p(root.left , list);
        p(root.right , list);
    }
}