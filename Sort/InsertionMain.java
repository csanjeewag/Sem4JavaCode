/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sort;

/**
 *
 * @author Chanaka Sanjeewa
 */
class Insertion{
    public void I_sort(int arr[]){
        
        for(int i=1; i<arr.length; ++i){
            
            int j= i-1;
            int key = arr[i];
            while(j>=0 && key<arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]=key;
            
        }
        
    }
     public void display(){
       
       
   }
}

public class InsertionMain {
    
    public static void main(String[] arg){
        Insertion sort = new Insertion();
        int[] arr = {45,25,85,55};
        sort.I_sort(arr);
       for(int i=0; i<arr.length;i++){
           System.out.print(arr[i]+" ");
          
       }
        
    }
}
