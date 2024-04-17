package com.demo;

public class Student2 {
    String name;

    public Student2(String name) {
        this.name = name;
    }

    public void printInstanceVariable() {
        System.out.println(" Instance Variable: " + name);
    }

    public static void main(String[] args) {
      
        Student2 s1 = new Student2("Reena");
        Student2 s2 = new Student2("Malar");
        Student2 s3 = new Student2("Pratheeksha");

        
        Thread t1 = new Thread(s1::printInstanceVariable);
        

      
        t1.start();
       
    }
}
