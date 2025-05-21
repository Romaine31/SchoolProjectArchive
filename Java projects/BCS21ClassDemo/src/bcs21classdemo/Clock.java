/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcs21classdemo;

/**
 *
 * @author Sherry
 */
public class Clock {
    //members : data members / method members
   private int hours;
   private int minutes;
   private int seconds;  //instance variables (non-static variables) - accessed by objects of the class
   
   
   //constructor - initializ data members of the class
   
   //default contructor
   public Clock(){
       this.hours = 12;
       this.minutes =0;
       this.seconds=0;
   }
   
   public Clock(int hr, int min, int sec){
       setTime(hr,min, sec);
   }
   
   
   //getter methods (accessor methods)
   public int getHours(){
       return this.hours;
   }
   public int getMinutes(){
       return this.minutes;
   }
   public int getSeconds(){
       return this.seconds;
   }
  //setter methods (mutator methods)- assign value to instance variables
   
   public void setHours(int hr){
       if(hr >=0 && hr <24)
           this.hours = hr;  //0-23
       else
           this.hours =0;
   }
   
   public void setMinutes(int min){
       if (min >=0 && min <60)  
           this.minutes = min;  //0-59
       else
           this.minutes =0;
   }
   
   public void setSeconds(int sec){
        if (sec >=0 && sec <60)  
            this.seconds =sec; //0-59
        else
            this.seconds = 0;
   }
   
   public void setTime(int hr, int min, int sec){
       setHours(hr);
       setMinutes(min);
       setSeconds(sec);
       
   }
   
   public void printTime(){  
    //TO do: Format the time as hh:mm:ss
       if (this.hours<10)
           System.out.print("0");
       System.out.print(this.hours + ":");
       
       if (this.minutes<10)
           System.out.print("0");
       System.out.print(this.minutes + ":");
       
       if (this.seconds<10)
           System.out.print("0");
       System.out.println(this.seconds);
       
   }
   
   
   @Override
   public String toString(){
       String time = "";
       if (this.hours<10)
           time = time + "0";
       time = time + this.hours + ":";
       
       if (this.minutes<10)
           time = time + "0";
       time = time + this.minutes + ":";
       
       if (this.seconds<10)
           time = time + "0";
       time = time + this.seconds;
     
       return time;  
   }
   
   
   public void incrementHours(){
       if (this.hours >=0 && this.hours <=22)
        this.hours++;  //prob: if hours = 23,  adding 1 will make it 24 (invalid)
       else
           this.hours =0;
       
       
       /*Option 2:
         this.hours++;
         if (this.hours>=24)
            this.hours =0;
        */
   }
   
   public Clock makeCopy (Clock c){
       this.hours = c.hours;
       this.minutes=c.minutes;
       this.seconds = c.seconds;
       
       return c;
       
   }
   
   public void incrementMinutes(){
       if (this.minutes >=0 && this.minutes <=58)
           this.minutes++;
       else{
           this.minutes = 0;
           incrementHours(); //use already existing incrementHours method
       }       //JOHN ROMAINE CAGUBCUB
   }
}
