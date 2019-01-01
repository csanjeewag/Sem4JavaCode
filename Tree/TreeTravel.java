/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tree;

/**
 *
 * @author Chanaka Sanjeewa
 */
class Node{
    int key;
    Node left,right;
    
    public Node(int item){
        key = item;
        left = right = null;
    }
}

class BinaryTree{
    Node root;
    
    BinaryTree(){
        root = null;
    }
   
    public void printPostorder(Node node){
           if (node == null) 
            return; 
        printPostorder(node.left);
        printPostorder(node.right);
        System.out.print(node.key+" ");
        
    }
    
    public void printInorder(Node node) 
    { 
        if (node == null) 
            return; 
  
        printInorder(node.left); 
        System.out.print(node.key + " "); 
        printInorder(node.right); 
    } 
     
    public void printPreorder(Node node) 
    { 
        if (node == null) 
            return; 
        System.out.print(node.key + " "); 
        printPreorder(node.left); 
        printPreorder(node.right); 
    }
       
    
       
       
    
}

public class TreeTravel {
  
  public static void main(String[] args) 
    { 
        BinaryTree tree = new BinaryTree(); 
        tree.root = new Node(50); 
        tree.root.left = new Node(40); 
        tree.root.right = new Node(60); 
        tree.root.left.left = new Node(30); 
        tree.root.left.left.right = new Node(35); 
  
        System.out.println("Preorder traversal of binary tree is "); 
        tree.printPreorder(tree.root); 
  
        System.out.println("\nInorder traversal of binary tree is "); 
        tree.printInorder(tree.root); 
  
        System.out.println("\nPostorder traversal of binary tree is "); 
        tree.printPostorder(tree.root); 
    } 
}
