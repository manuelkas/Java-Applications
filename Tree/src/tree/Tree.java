/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

/**
 *
 * @author shalm
 */

    class TreeNode<T extends Comparable<T>> {
        //package access members
        TreeNode<T> leftNode;
        T data;
        TreeNode<T> rightNode;
        
        public TreeNode(T nodeData) {
            data = nodeData;
            leftNode = rightNode = null;     //no children 
        }
        
        //insertion point and insert new node
        public void insert(T insertValue) {
            //left subtree
            if (insertValue.compareTo(data)< 0) {
                if (leftNode == null) {        //insert new TreeNode
                    leftNode = new TreeNode<>(insertValue);
                }
                else {
                    leftNode.insert(insertValue);
                }
            }
            //insert right subtree
            else if (insertValue.compareTo(data)> 0) {
                if(rightNode == null) {
                    rightNode= new TreeNode<>(insertValue);
                }
                else {
                    rightNode.insert(insertValue);       //traverse recursively
                }
            }
        }
    }
    
    //class Tree definition 
    public class Tree<T extends Comparable<T>> {
        private TreeNode<T> root;
        
        //constructor 
        public Tree() {
            root = null;
        }
        //insert new node
        public void insertNode(T insertValue) {
            if (root == null) {
                root = new TreeNode<>(insertValue);    //root node created
            }
            else {
                root.insert(insertValue);              //insert mehtod
            }
        }
        
        public void preorderTraversal() {
            preorderHelper(root);
        }
        private void preorderHelper(TreeNode<T> node) {
            if (node == null) {
            return;
            }
        
        System.out.printf("%s ", node.data);
        preorderHelper(node.leftNode);
        preorderHelper(node.rightNode);
    }
    
    //begin inorder traversal 
    public void inorderTraversal() {
        inorderHelper(root);
    }
    
    //recursive method
    private void inorderHelper(TreeNode<T> node) {
        if (node == null) {
            return;
        }
        inorderHelper(node.leftNode);                //traverse left subtree
        System.out.printf("%s ", node.data);         //output date
        inorderHelper(node.rightNode);              //traverse right subtree
    }
    
    //being postorder traversal
    public void postorderTraversal() {
        postorderHelper(root);        
    }
    //recursive method for postorder traversal 
    private void postorderHelper(TreeNode<T> node) {
        if (node == null) {
            return;
        }
        
        postorderHelper(node.leftNode);           //traverse left subtree
        postorderHelper(node.rightNode);          //traverse right subtree
        System.out.printf("%s ", node.data);      //outout data 
    } 
    
    public int getDepth() {
        return getDepthHelper(root);
    }
    
    private int getDepthHelper(TreeNode<T> node) {
        if (node == null) {
            return 0;                            //base case
        }
        
        //find depth of deeper subtree
        int left = getDepthHelper(node.leftNode);
        int right = getDepthHelper(node.rightNode);
        return Math.max(left, right) +1;
    }
    
}















