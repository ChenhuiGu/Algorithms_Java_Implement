package BinaryTree;
import java.util.ArrayList;
import java.util.List;

public class BinaryTreeTraversalMirrors {
    public List<Integer> preOrder(TreeNode root){
        List<Integer> res = new ArrayList<>();
        if(root == null) return res;
        TreeNode curr = root,mostRight = null;
        while(curr != null){
            mostRight = curr.left;
            if(mostRight != null){//存在左子树
                while(mostRight.right != null && mostRight.right != curr){
                    mostRight = mostRight.right;
                }
                if(mostRight.right == null){
                    res.add(curr.val);
                    mostRight.right = curr;
                    curr = curr.left;
                    continue;
                }else{//mostRight.right != curr
                    mostRight.right = null;
                }
            }else{//不存在左子树
                res.add(curr.val);
            }
            // 左子树为空
            curr = curr.right;
        }
        return res;
    }

    //public List<Integer> inOrder(){
    //
    //}

}
