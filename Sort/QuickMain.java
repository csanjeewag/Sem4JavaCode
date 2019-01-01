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
class Quick{
    
  private  int partitin(int arr[], int low, int high){
        int pivot = arr[high];
        int ch = low;
        int i;
        for(i = low; i<high; i++){
            if(arr[i]<= pivot){
                int item = arr[i];
                   
                    arr[i] = arr[ch];
                    arr[ch] = item;
                    ch++; 
            }
                 
        }
        int item = arr[i];
                    arr[i] = arr[ch];
                    arr[ch] = item;
                   return ch;
    }
    
  public  void quickSort( int arr[], int low,int high){
        if(low<high){
            int pi = partitin( arr,  low,  high);
            quickSort(arr,low,pi-1);
            quickSort(arr,pi+1,high);
            
        }
        
    }
  public void display(int[] arr){
      for(int i=0;i<arr.length;i++){
          System.out.print(arr[i]+" ");
      }
  }
}

public class QuickMain {
    
    public static void main(String[] arg){
        Quick q_sort = new Quick();
        
        int[] arr = {70,80,60,10,50,40,85};
        q_sort.quickSort(arr, 0, arr.length-1);
        q_sort.display(arr);
    }
    
}
