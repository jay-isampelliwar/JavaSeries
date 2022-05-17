package Tree;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class BottomView {

    static Scanner sc;
    public static void main(String[] args) {

        sc = new Scanner(System.in);
        BottomView b = new BottomView();
        Solution7 s = new Solution7();
        TreeNode root = b.createTree();

        s.bottomView(root);

    }

    public TreeNode createTree() {

        TreeNode root = null;

        System.out.println("Enter Data : ");
        int data = sc.nextInt();

        if(data == -1) return null;

        root = new TreeNode(data);

        System.out.println("Enter LEFT data for "+data);
        root.left = createTree();
        System.out.println("Enter RIGHT data for "+data);
        root.right = createTree();

        return root;
    }
}
class Solution7 {

    public void bottomView(TreeNode root) {

        HashMap<Integer , TreeNode> map = new HashMap<>();

        getView(root , map , 0);

        TreeMap<Integer , TreeNode> treeSet = new TreeMap<>();

        treeSet.putAll(map);

        for (Map.Entry<Integer , TreeNode> val : treeSet.entrySet()) {

            System.out.print(val.getValue().data+" ");
        }
    }

    public static void getView(TreeNode root , HashMap<Integer , TreeNode> map , int level) {

        if (root == null) return;

        map.put(level , root);

        getView(root.left , map , level-1);
        getView(root.right , map , level+1);
    }
}

