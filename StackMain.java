/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chanaka Sanjeewa
 */
class Stack{
    int MAX; // arry size
    int top;
    int arr[] ;
    
    Stack(int x) // x=array size
     {
        MAX = x;
        arr = new int[MAX];
        top = -1;
    }
    
    public boolean isEmpty(){
        if(top<0){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean push(int x){
        if(top>= (MAX-1)){
            System.out.println("Stack overflow");
            return false;
        }
        else{
            ++top;
            arr[top] = x;
            System.out.println(x+" data added");
            return true;
        }
    }
    
    public int pop(){
        if(this.isEmpty()){
            System.out.println("Stack is empty");
            return 0;
        }
        else{
            System.out.println("top data is "+arr[top]);
            return arr[top--];
        }
    }
    
}

public class StackMain {
    
    public static void main(String arg[]){
        Stack s = new Stack(10);
        s.push(45);
        s.push(55);       
        s.push(85);
        s.pop();
        s.pop();
    }
}
