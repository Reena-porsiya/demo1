package com.demo;

public class Students3 {
    String name; // Static variable

    public Students3(String name) {
        this.name = name;
    }

    public void printStaticVariable() {
        System.out.println("Static Variable: " +this.name);
    }

    public static void main(String[] args) {
       
        Students3 student1 = new Students3("Reena");
       // Students3 student2 = new Students3("Malar");
       // Students3 student3 = new Students3("Pratheeksha");

        
        Thread t1 = new Thread(student1::printStaticVariable);
        Thread t2 = new Thread(student1::printStaticVariable);
        Thread t3 = new Thread(student1::printStaticVariable);


        t1.start();
        t2.start();
        t3.start();
        t1.run();
        
        student1.name = "Malar";
        t1.run();
        t2.run();
        t3.run();
    }
}
