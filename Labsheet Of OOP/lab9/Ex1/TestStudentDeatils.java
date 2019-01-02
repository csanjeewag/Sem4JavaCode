/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9.Ex1;

import lab9.Ex1.StudentDetails;

/**
 *
 * @author Chanaka Sanjeewa
 */
public class TestStudentDeatils extends StudentDetails  {
    
    public static void main(String[] args){
        
        StudentDetails s1 = new StudentDetails();
        s1.setName("Chanaka Sanjeewa");
        s1.setAge(21);
        System.out.println(s1.getStr());
        
    }
    
}
