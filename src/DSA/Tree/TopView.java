package DSA.Tree;

import java.util.*;

public class TopView {

    static Scanner sc;

    public static void main(String[] args) {

        sc = new Scanner(System.in);
        TopView t = new TopView();
        Solution6 s = new Solution6();
        TreeNode root = t.createTree();

        s.topView(root);

    }

    public TreeNode createTree() {

        TreeNode root;

        System.out.println("Enter Data : ");
        int data = sc.nextInt();

        if (data == -1) return null;

        root = new TreeNode(data);

        System.out.println("Enter LEFT data for " + data);
        root.left = createTree();
        System.out.println("Enter RIGHT data for " + data);
        root.right = createTree();

        return root;
    }
}

class Solution6 {

    public void topView(TreeNode root) {

        Queue<Pair> q = new LinkedList<>();
        Map<Integer, Integer> map = new TreeMap<>();

        q.add(new Pair(0, root));

        while (!q.isEmpty()) {

            Pair cur = q.poll();

            map.putIfAbsent(cur.hd, cur.node.data);

            if (cur.node.left != null) {

                q.add(new Pair(cur.hd - 1, cur.node.left));
            }

            if (cur.node.right != null) {

                q.add(new Pair(cur.hd + 1, cur.node.right));
            }
        }

        ArrayList<Integer> list = new ArrayList<>();

        for (Map.Entry<Integer, Integer> items : map.entrySet()) {

            list.add(items.getValue());
        }


        System.out.println(list);
    }
}

class Pair {

    int hd;
    TreeNode node;

    Pair(int hd, TreeNode node) {

        this.hd = hd;
        this.node = node;
    }
}
