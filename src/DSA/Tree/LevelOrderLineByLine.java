package Tree;

import java.util.*;

public class LevelOrderLineByLine {

    static Scanner sc;
    public static void main(String[] args) {

        sc = new Scanner(System.in);
        Solution8 s = new Solution8();
        LevelOrderLineByLine tree = new LevelOrderLineByLine();
        TreeNode root = tree.createTree();

        ArrayList<ArrayList<Integer>> list;

        list = s.levelOrder(root);

        System.out.println(list);
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

class Solution8 {

    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> subList = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);
        q.add(null);

        while(q.size() > 1) {

            TreeNode cur = q.poll();

            if(cur == null) {
                q.add(null);
                subList.removeAll(list);
                continue;
            }

            subList.add(cur.data);
            if(cur.left != null) {

                q.add(cur.left);
            }

            if(cur.right != null) {

                q.add(cur.right);
            }
        }

        return list;

    }
}
