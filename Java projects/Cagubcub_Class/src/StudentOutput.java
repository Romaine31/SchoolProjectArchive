/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Romaine
 */
public class StudentOutput {
    public static void main (String[] args){
        Student one = new Student();
        
        System.out.println(one.getStudentNo() + " " + one.getFname() + " " + one.getLname() + " " + one.getCourse());
        
        one.setStudentNo(201880237);
        one.setFname("John Romaine");
        one.setLname("Cagubcb");
        one.setCourse("BCS21");
        
        System.out.println(one.getStudentNo() + " " + one.getFname() + " " + one.getLname() + " " + one.getCourse());
    }
}
