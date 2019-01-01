/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Search;

/**
 *
 * @author Chanaka Sanjeewa
 */
    class B_Sort{
        public int sort(int arr[], int left, int right, int value) throws Exception{
            if(right>=left){
                
                int mid = (right+left)/2;
                int midvalue = arr[mid];
                if(midvalue==value){
                    return mid;
                }
                else if(midvalue>value){
                    
                   return sort(arr,left,mid-1,value);
                }
                else
                {
                    return sort(arr,mid+1,right,value);
                }
                
            }
             throw new Exception("there are no index to match value");
        }
        
        public int binarysearch(int arr[], int value){
        try{
            int result = sort(arr,0,arr.length-1,value); 
            System.out.println("result="+result);
            return result;
             }catch (Exception e){
                 System.out.println(""+e);
             }
              return 0;
        }
    }

public class BinarySearchMain {
      public static void main(String args[]) throws Exception
    { 
        B_Sort ob = new B_Sort(); 
        int arr[] = { 2, 3, 5, 10, 40,50,55,77,80 }; 
        int n = arr.length; 
        int x = 10; 
//        int result = ob.sort(arr,0,6,45); 
//        if (result == -1) 
//            System.out.println("Element not present"); 
//        else
//            System.out.println("Element found at "
//                               + "index " + result); 
    ob.binarysearch(arr, 80);
        
                
    } 
}
