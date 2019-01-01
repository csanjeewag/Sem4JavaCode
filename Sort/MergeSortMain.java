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
class MergeSort{
    
  public void merge(int arr[], int left, int mid, int right){
      
      int n1 = mid - left+1;
      int n2 = right-mid;
       int Left[] = new int [n1]; 
        int Right[] = new int [n2];
        
       for(int i=0; i<n1;i++){
           Left[i]= arr[left+i];
       }
       for(int j=0; j<n2;j++){
           Right[j] = arr[mid+j+1];
       }
       int i = 0, j = 0; 
       int k = left;
       
       while(i<n1 && j<n2){
                if (Left[i] <= Right[j]) 
            { 
                arr[k] = Left[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = Right[j]; 
                j++; 
            } 
            k++;
       }
       while (i < n1) 
        { 
            arr[k] = Left[i]; 
            i++; 
            k++; 
        } 
        while (j < n2) 
        { 
            arr[k] = Right[j]; 
            j++; 
            k++; 
        }
      
  }
  
     void sort(int arr[], int left, int right) 
    { 
        if (left < right) 
        { 
            
            int m = (left+right)/2; 
  
            // Sort first and second halves 
            sort(arr, left, m); 
            sort(arr , m+1, right); 
  
            // Merge the sorted halves 
            merge(arr, left, m, right); 
        } 
    } 
     public void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
    
}

public class MergeSortMain {
    public static void main(String args[]) 
    { 
        MergeSort ob = new MergeSort();
        
        int arr[] = {12, 11, 13, 5, 6, 7}; 
  
         ob.sort(arr, 0, arr.length-1); 
  
        System.out.println("\nSorted array"); 
        ob.printArray(arr); 
    }   
}
