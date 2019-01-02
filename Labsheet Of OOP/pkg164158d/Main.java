/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg164158d;

public class Main {

    public static void main(String[] args) {
        Main a = new Main();
        System.out.println(a.checkeven(55));
        System.out.println(a.CountVowel("sanjeewa"));
        System.out.println(a.deference(75125));
        Integer[] arry={45,85,12,74,65,25,46,24,99};
        Integer rear[] = a.maxminavg(arry);
        System.out.println("MAX="+rear[0]+" MIN="+rear[1]+" AVG="+rear[2]);
    }
    
  public String checkeven(int a){
        
      if(a%2==0)
          return "Even";
      else 
          return "Odd";
      
      
  }
  public int CountVowel(String a){
 
char[] ch=a.toLowerCase().toCharArray();
    int z=0;
    for(int i=0;i<a.length();++i){
    if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
        ++z;
   
    }
       return z;
  }
  
  public int deference(int a){
      int z=0;
     while(a!=0){
         int t= a%10;
         z=z+t;
         a=a/10;
      }
  return z;
  }
  
  public Integer[] maxminavg(Integer[] ar){
     int  max=ar[0];
     int min = ar[0];
     int total= 0;
     int avg=0;
      for(int i=0;i<ar.length;++i){
          if(min<ar[i])
              min=ar[i];
          if(max>ar[i])
              max=ar[i];
          total+=ar[i];
      
      }
      avg=total/ar.length;
      Integer[] zarry = {min,max,avg};
      return zarry;
  
  }
  
}
