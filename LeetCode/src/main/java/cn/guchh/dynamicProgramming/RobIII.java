package cn.guchh.dynamicProgramming;

import java.util.HashMap;
import java.util.Map;

/**
 * @author chenhuigu
 */
public class RobIII {
    /**
     * 普通递归
     *
     * @param root
     * @return
     */
    public int rob(TreeNode root) {
        if (root == null) {
            return 0;
        }
        //爷爷 + 四个孙子
        int money = root.val;
        if (root.left != null) {
            money += rob(root.left.left) + rob(root.left.right);
        }
        if (root.right != null) {
            money += rob(root.right.left) + rob(root.right.right);
        }
        //与2个儿子比较
        return Math.max(money, rob(root.left) + rob(root.right));
    }

    /**
     * 哈希表储存计算值
     *
     * @param root
     * @return
     */
    public int rob01(TreeNode root) {
        Map<TreeNode, Integer> hashMap = new HashMap<>();
        return myRob(root, hashMap);
    }

    private int myRob(TreeNode root, Map<TreeNode, Integer> hashMap) {
        if (root == null) {
            return 0;
        }
        if (hashMap.containsKey(root)) {
            return hashMap.get(root);
        }
        //爷爷 + 四个孙子
        int money = root.val;
        if (root.left != null) {
            money += myRob(root.left.left, hashMap) + myRob(root.left.right, hashMap);
        }
        if (root.right != null) {
            money += myRob(root.right.left, hashMap) + myRob(root.right.right, hashMap);
        }
        //与2个儿子比较
        money = Math.max(money, myRob(root.left, hashMap) + myRob(root.right, hashMap));
        hashMap.put(root, money);
        return money;

    }

    /**
     * 数组储存节点的状态[当前节点不偷，当前节点偷]
     */
    public int rob02(TreeNode root) {
        int[] res = myRob02(root);
        return Math.max(res[0],res[1]);
    }
    private int[] myRob02(TreeNode root){
        int[] res = new int[2];
        if(root == null){
            return res;
        }
        int[] left = myRob02(root.left);
        int[] right = myRob02(root.right);
        // 不偷
        res[0] = Math.max(left[0],left[1]) + Math.max(right[0],right[1]);
        //偷
        res[1] = left[0] + right[0] + root.val;
        return res;



    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}