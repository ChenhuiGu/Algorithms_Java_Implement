package Algorithm4th.BinaryTree;

import java.util.*;

/**
 * 迭代实现二叉树的遍历
 */
class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }


public class BinaryTreeTraversalIteration {

    public List<Integer> preOrder(TreeNode head){
       List<Integer> res = new ArrayList<>();
       if(head != null){
           Deque<TreeNode> stack = new LinkedList<>();
           stack.push(head);
           while(!stack.isEmpty()){
               TreeNode node = stack.pop();
               res.add(node.val);
               if(node.right != null){
                   stack.push(node.right);
               }
               if(node.left != null){
                   stack.push(node.left);
               }
           }
       }
       return res;
    }
    
    public List<Integer> inOrder(TreeNode head){
        List<Integer> res = new ArrayList<>();
        if(head != null){
            Deque<TreeNode> stack = new LinkedList<>();
            while(!stack.isEmpty() || head != null){
                if(head != null){
                    stack.push(head);
                    head = head.left;
                }else{
                    head = stack.pop();
                    res.add(head.val);
                    head = head.right;
                }
            }
        }
        return res;
    }

    public List<Integer> postOrder(TreeNode head){
        List<Integer> res = new ArrayList<>();
        if(head != null){
            Deque<TreeNode> stack = new LinkedList<>();
            Deque<Integer> collect = new LinkedList<>();
            stack.push(head);
            while(!stack.isEmpty()){
                TreeNode node = stack.pop();
                collect.push(node.val);
                if(node.left != null){
                    stack.push(node.left);
                }
                if(node.right != null){
                    stack.push(node.right);
                }
            }
            res.addAll(collect);
        }
        return res;
    }
}
