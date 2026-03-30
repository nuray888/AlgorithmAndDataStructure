package learning.binary_tree;

import java.util.Scanner;

public class BinaryTree {
    private static class Node{
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    public void populate(Scanner sc){
        System.out.println("Enter the root value");
        int rootValue = sc.nextInt();
        root = new Node(rootValue);
        populate(sc,root);

    }
    private void populate(Scanner sc,Node node){
        System.out.println("Do you want to enter left side of "+node.value);
        boolean leftSide = sc.nextBoolean();
        if(leftSide){
            System.out.println("Enter the value of left side of "+node.value);
            int leftSideValue = sc.nextInt();
            node.left = new Node(leftSideValue);
            populate(sc,node.left);
        }

        System.out.println("Do you want to enter right side of "+node.value);
        boolean rightSide = sc.nextBoolean();
        if(rightSide){
            System.out.println("Enter the value of right side of "+node.value);
            int rightSideValue = sc.nextInt();
            node.right = new Node(rightSideValue);
            populate(sc,node.right);

        }

    }

    public void display(){
        display(root,"");
    }
    private void display(Node node,String prefix){
        if(node == null){
            return;
        }
        System.out.println(prefix+node.value);
        display(node.left,prefix+"\t");
        display(node.right,prefix+"\t");
    }

    public void preorder(){
        preorder(root);
    }
    private void preorder(Node node){
        if(node == null){
            return;
        }
        System.out.println(node.value+" ");
        preorder(node.left);
        preorder(node.right);
    }
    public void inorder(){
        preorder(root);
    }
    private void inorder(Node node){
        if(node == null){
            return;
        }
        preorder(node.left);
        System.out.println(node.value+" ");
        preorder(node.right);
    }

    public void postorder(){
        preorder(root);
    }
    private void postorder(Node node){
        if(node == null){
            return;
        }
        preorder(node.left);
        preorder(node.right);
        System.out.println(node.value+" ");
    }
}
