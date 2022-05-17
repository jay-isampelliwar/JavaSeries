package Tree;

import java.util.ArrayList;
import java.util.Scanner;

public class RightView {

        static Scanner sc;
        public static void main(String[] args) {

            sc = new Scanner(System.in);
            Solution2 s = new Solution2();
            RightView tree = new RightView();
            TreeNode root = tree.createTree();

            s.rightView(root);
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

class Solution2 {

        public void rightView(TreeNode root) {

            ArrayList<Integer> list = new ArrayList<>();

            if (root == null) return;

            list.add(root.data);
            p(root , list , 0);

            System.out.println(list);
        }

        public static void p(TreeNode root , ArrayList<Integer> list , int level) {

            if (root == null) return;

            if(level == list.size()) {
                list.add(root.data);
            }

            p(root.right , list , level + 1);
            p(root.left , list , level + 1);

        }
}



