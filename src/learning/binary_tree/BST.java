package learning.binary_tree;

public class BST {
    private class Node{
        int value;
        Node left;
        Node right;
        public Node(int value) {
            this.value = value;
        }
        int height;
    }
    Node root;

    public int height(Node node){
        if(node == null) return -1;
        return node.height;
    }

    public boolean isEmpty(Node node){
        return node == null;
    }

    public void insert(int value){

    }

    private Node insert(int value,Node node){
        if(node == null){
            return new Node(value);
        }
        if(value < node.value){
            insert(value,node.left);
        }if(value > node.value){
            insert(value,node.right);
        }
        return node;
    }

    public boolean isBalanced(){
        return isBalanced(root);
    }
    private boolean isBalanced(Node node){
        if(node == null){
            return true;
        }
        return height(node.left)==height(node.right) && isBalanced(node.left) && isBalanced(node.right);
    }
    public void display(){
        display(root,"Root node: ");
    }
    private void display(Node node,String details){
        if(node == null){
            return;
        }
        System.out.println(details+node.value);
        display(node.left,"Left: "+node.value);
        display(node.right,"Right: "+node.value);
    }


}
