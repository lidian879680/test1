package com.ld.test.dataStruct.binaryTree;

import java.util.LinkedList;
import java.util.Objects;

/**
 * @className PreOrderTraversal_stack
 * @description todo
 * @date 2021/7/26 17:14
 **/
public class InOrderTraversal_stack {
    public static void main(String[] args) {
        TreeNode root = PreOrderTraversal_recursion.initTreeNode();
        InOrderTraversal_stack preOrderTraversal_stack = new InOrderTraversal_stack();
        preOrderTraversal_stack.traveral(root);
    }

    private void traveral(TreeNode root) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        TreeNode currentNode = root;
        while (Objects.nonNull(currentNode) || stack.size() > 0) {
            if (Objects.nonNull(currentNode)) {
                stack.addFirst(currentNode);
                currentNode = currentNode.getLeft();
            }else {
                currentNode = stack.pop();
                System.out.print(currentNode.getVal());
                currentNode = currentNode.getRight();
            }
        }
    }
}
