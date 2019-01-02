/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9.Ex1;

/**
 *
 * @author Chanaka Sanjeewa
 */
public class StudentDetails {
   private String name;
   private int age;
   
   public void setName(String newName){
       this.name = newName;
   }
    
   public void setAge(int newAge){
       this.age = newAge;
   }
    
   public String getStr(){
       String str = ""+this.name+" is "+this.age+" years old.";
   return str;
   }
    
}
