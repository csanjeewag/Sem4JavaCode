 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chanaka Sanjeewa
 */

class Queue{
    int front; // first out value index
    int rear; // last out value index
    int size; // array filling size
    int capasity ; // array capasity
    int arr[];
    
    Queue(int cap){
        this.capasity = cap;
        this.front = this.size = 0;
        this.rear = this.capasity-1;
        this.arr = new int[cap];
    }
    
    public boolean isFull(Queue q){
        
       return (q.size == q.capasity); 
    }
    
    public boolean isEmpty(Queue q) 
    { 
        return (q.size == 0); 
    }
    
    public void enqueue(int item){
        if(isFull(this)){
            return ; // turminate enqueue
        }
        
        this.rear = (this.rear+1)%this.capasity; 
        this.arr[this.rear]= item;
               
        ++this.size;
        System.out.println(item+" enqueued to queue");
    }
    
    public int dequeue(){
        if(isEmpty(this)){
            System.out.println("array is empty");
           return Integer.MIN_VALUE; 
        }
        
        int item = arr[front];
        this.front = (this.front + 1)%this.capasity;
        --this.size;
        System.out.println("dequeue "+item);
        return item;
    }
    
    public   int front() 
    { 
        if (isEmpty(this)) 
            return Integer.MIN_VALUE; 
           
        return this.arr[this.front]; 
    } 
  
   public int rear() 
    { 
        if (isEmpty(this)) 
            return Integer.MIN_VALUE; 
           
        return this.arr[this.rear]; 
    } 
   
   public void display(){
       int f = front;
       for(int i=0; i<size;i++){
           System.out.print(arr[f]+" ");
           f = (f+1)%capasity;
       }
   }
    
    
   
}

public class QueueMain {
    
    public static void main(String[] arg){
        Queue queue = new Queue(5);
        
        queue.enqueue(10); 
        queue.enqueue(20); 
        queue.enqueue(30); 
        queue.enqueue(40);
        queue.dequeue();
     //   queue.dequeue();
        
        System.out.println("front "+queue.front());
       // System.out.println(queue.front());
        System.out.println("rear "+queue.rear());
        queue.display();
        
    }
}
