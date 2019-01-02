/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkList;

/**
 *
 * @author Chanaka Sanjeewa
 */
class NodeL{
    int data;
    NodeL next;
    
    public NodeL(int value){
        this.data = value;
        this.next = null;
    }
}

class LinkList{
    public NodeL head;
    public NodeL tail;
    
    public LinkList(){
      
        head = null;
        tail = head;
    }
  
     public boolean isEmpty() {
        
    if(head == null){ return true;}
    return false;
    }
     
     public boolean search(int key){
         NodeL current = head;
         while(current != null){
             if(key == current.data){
                 return true;
             }
             current = current.next;
         }
         return false;
     }
     public int getvalue(int index) throws Exception{
            NodeL current = head;
            int i=0;
         while(current != null){
             if(index == i){
                 System.out.println(current.data+" value for "+i);
                 return current.data;
             }
            
             current = current.next;
              i++;
         }
          System.out.println("no value for "+index);
          
          throw new Exception("no data");
     }
      public void insertFront(int value) {
       
          if(search(value)){
              System.out.println("value can not duplicate");
              
          }else{
            NodeL newnode = new NodeL(value);
              System.out.println("value added "+newnode.data);
              
         
             newnode.next = head;
             head = newnode;
             tail = head;
              
          }
          
      }
      public void insertSort(int value){
        
          NodeL current = head;
          NodeL previous = current;
          if(head==null){
              NodeL newnode = new NodeL(value);
              head = newnode;
              return;
          }
          if(head.data > value){
            NodeL newnode = new NodeL(value);
            newnode.next = head;
                head = newnode;
                return;
          }
          while(current != null){
              if(current.data ==value) return;
              if(current.data > value){
               NodeL newnode = new NodeL(value);
               newnode.next = previous.next;
               previous.next = newnode;
               return;
              }
              
              previous = current;
              current = current.next;
          }
           NodeL newnode = new NodeL(value);
               newnode.next = previous.next;
               previous.next = newnode;
      }
      public boolean insertRear(int value){
          NodeL current = head;
          NodeL previous = current;
          if(isEmpty()){
              insertFront(value);
              System.out.println("value "+value+" added to rear");
              return true;
          }
          
          while(current != null){
              if(current.data == value){
                  System.out.println("value "+value+" duplicate");
                  return false;
              }
              previous = current;
              current = current.next;
              
          }
          NodeL newnode = new NodeL(value);
          System.out.println("value "+value+" added to rear");
          
          previous.next = newnode;
          return true;
      }
      
      public NodeL deleteFirst(){
          if(head != null)
          {
              NodeL del = head;
              head = head.next;
              return del;
          }
          return null;
      }
      
      public boolean deletefromvalue(int val){
          NodeL current= head;
          NodeL previous = current;
          if(head.data == val){
              head = head.next;
              System.out.println("delete success!");
              return true;
          }
          while(current != null){
            if(current.data == val) {
               previous.next = current.next;
               System.out.println("delete success!");
               return true;
            }
            previous = current;
             current= current.next;
          }
          System.out.println("Delete fail, There is not data like "+val);
          return false;
      }
      
      public boolean deletefFromIndex(int index){
          NodeL current= head;
          NodeL previous = current;
          if(isEmpty()){
              System.out.println("LinkList is Empty");
              return false;
          }
          if(index == 0){
              System.out.println("index "+index+" value deleted!");
              this.deleteFirst();
              return true;
          }
          int i = 0;
          while(current != null){
              if(i==index){
                  System.out.println("index "+index+" value deleted!");
                  previous.next = current.next;
                  return true;
              }
              previous = current;
              current = current.next;
              ++i;
          }
          System.out.println(index+", index is outbound");
          return false;
      }
      public void display(){
          NodeL current = head ;
          if(isEmpty()){
             System.out.println("List is Empty.");
         }
          while(current != null){
             System.out.print(current.data+" ");
             current = current.next;
         }
         System.out.println();
      }
  
}
public class LinkMain {
    
    public static void main(String[] arg) throws Exception{
        LinkList list = new LinkList();
         list.insertRear(75);
        list.insertFront(10);
        list.insertFront(40);
        list.insertFront(30);
        list.insertFront(50);
        list.insertFront(10);
       // list.getvalue(10);
        list.display();
        list.deletefromvalue(70);
        list.deletefFromIndex(2);
        list.insertRear(75);
        list.display();
     
        System.out.println("Sort array////////////////////");
        
         LinkList sortlist = new LinkList();
         sortlist.insertSort(55);
         sortlist.insertSort(16);
          sortlist.insertSort(50);
         sortlist.insertSort(16);
//         sortlist.insertSort(20);
//         sortlist.insertSort(25);
         sortlist.display();
//         System.out.println("");
//        System.out.println("Happy New Year!");
//        System.out.println("This mean ...");
//        System.out.println("");
//        for(int i=1; i<366; i++){
//            System.out.println("Happy New Day for "+i+" day of year.");
//        }
    }
}
