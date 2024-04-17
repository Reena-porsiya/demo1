package com.demo;

public class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }

    public void printInstanceVariable() {
        System.out.println(" Instance Variable: " + name);
    }

    public static void main(String[] args) {
      
        Student s1 = new Student("Reena");
        Student s2 = new Student("Malar");
        Student s3 = new Student("Pratheeksha");

        
        Thread t1 = new Thread(s1::printInstanceVariable);
        Thread t2 = new Thread(s2::printInstanceVariable);
        Thread t3 = new Thread(s3::printInstanceVariable);

      
        t1.start();
        t2.start();
        t3.start();
    }
}
