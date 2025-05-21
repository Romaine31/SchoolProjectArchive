/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Romaine
 */
public class Student {
    private int studentNo;
    private String fname, lname, course;
    
    public Student() {
    this.studentNo = 0;
    this.fname = "";
    this.lname = "";
    this.course = "";
}
    public void setStudentNo(int N){
        this.studentNo = N;
    }
    public void setFname(String F){
        this.fname = F;
    }
    public void setLname(String L){
        this.lname = L;
    }
    public void setCourse(String C){
        this.course = C;
    }
    
    public int getStudentNo(){
        return this.studentNo;
    }
    public String getFname(){
        return this.fname;
    }
    public String getLname(){
        return this.lname;
    }
    public String getCourse(){
        return this.course;
    }
    
}
