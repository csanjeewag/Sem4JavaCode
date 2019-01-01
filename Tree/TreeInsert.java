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

class Node1{
    int key;
    Node1 left,right;
    
    public Node1(int item){
        key = item;
        left = right = null;
    }
}

class BinaryTree1{
    Node1 root;
    
    BinaryTree1(){
        root = null;
    }
   
    public void InsertValue(int item){
          this.insert(root,item);
    }
    public void DeleteValue(int item){
        this.Delete(root, item);
    }
    public Node1 MinValue(){
        return this.Min(root);
    }
    public Node1 MaxValue(){
        return this.Max(root);
    }
    public Node1 SearchValue(int item){
        
        return this.BiSearch(root, item);
    }
    public void Inorder(){
        this.printInorder(root);
    }
     public void Postorder(){
        this.printPostorder(root);
    }
      public void Preorder(){
        this.printPreorder(root);
    }
    
   private void insert(Node1 node, int item){
       
       if(root == null){
            root = new Node1(item);
            System.out.println("main root "+root.key);
           return;
       }
       if(node==null || (node.key == item)){ 
           
          return;
       }
       else{
           if(item<node.key){
                 if(node.left==null){
                  node.left = new Node1(item);
                  return;
                  }
                  insert(node.left,item);
           }
           else{
               if(node.right==null){
               node.right = new Node1(item); 
               return ;
               }
               insert(node.right,item);
           }
       }
   }
   
   private Node1 Delete(Node1 root,int key){
       if (root == null) { return null; }
 
       
  
        if(root.key == key)
        { 
            // node with only one child or no child 
            if (root.left == null) 
            { return root.right; }
            else if (root.right == null) 
            {   return root.left ; }
  
            // node with two children: Get the inorder successor (smallest 
            // in the right subtree) 
            root.key = Min(root.right).key; 
  
            // Delete the inorder successor 
            root.right = Delete(root.right, root.key); 
        } 
       
        else if (key < root.key) 
        { root.left = Delete(root.left, key); }
        else if (key > root.key) 
        {  root.right = Delete(root.right, key); }
   
        return root; 
   }
   
   private Node1 Min(Node1 root){
       
       if(root == null){
           System.out.println("no item");
           return null;
       }
       else if(root.left == null && root.right == null){
          // System.out.println("min "+root.key);
           return root;
       }
       else if(root.left != null){
         return Min(root.left);
       }
       else{
        return  Min(root.right); 
       }
   }
   
      private Node1 Max(Node1 root){
       
       if(root == null){
           System.out.println("no item");
           return null;
       }
       else if(root.left == null && root.right == null){
          // System.out.println("min "+root.key);
           return root;
       }
       else if(root.right != null){
         return Max(root.right);
       }
       else{
        return  Max(root.left); 
       }
   }
   
   private Node1 BiSearch(Node1 root,int item){
       if(root==null){
           System.out.println("no item");
           return null;
       }
       if(root.key == item){
           System.out.println("item found = "+item);
        return root;
       }
       else if(root.key>item){
        return  BiSearch(root.left,item); 
       }
       else if(root.key<item){
        return   BiSearch(root.right,item);

       }
       else{
           return null;
       }
       
   }
   
    private void printPostorder(Node1 node){
           if (node == null) 
            return; 
        printPostorder(node.left);
        printPostorder(node.right);
        System.out.print(node.key+" ");
        
    }
    
    private void printInorder(Node1 node) 
    { 
        if (node == null) 
            return; 
  
        printInorder(node.left); 
        System.out.print(node.key + " "); 
        printInorder(node.right); 
    } 
     
    private void printPreorder(Node1 node) 
    { 
        if (node == null) 
            return;
       
        System.out.print(node.key + " "); 
        printPreorder(node.left); 
        printPreorder(node.right); 
    }
       
    
       
       
    
}

public class TreeInsert  {
  
  public static void main(String[] args) 
    { 
        BinaryTree1 tree = new BinaryTree1(); 
        tree.InsertValue( 50);
         tree.InsertValue( 60);
        tree.InsertValue( 40);
        tree.InsertValue( 30);
//        tree.insert(tree.root, 80);
//         tree.insert(tree.root, 90);
//        tree.insert(tree.root, 65);
        
        System.out.println("inorder"); 
        tree.Inorder(); 
        System.out.println();
        System.out.println("MIN = "+tree.MinValue().key);
        System.out.println("MAX = "+tree.MaxValue().key);
        
        tree.DeleteValue(60);
        System.out.println("inorder "); 
        tree.Inorder(); 
         
    } 
}
 