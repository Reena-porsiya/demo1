package com.demo;

public class Students {
    static String staticName; // Static variable

    public Students(String name) {
        staticName = name;
    }

    public void printStaticVariable() {
        System.out.println("Static Variable: " + staticName);
    }

    public static void main(String[] args) {
       
        Students student1 = new Students("Reena");
        Students student2 = new Students("Malar");
        Students student3 = new Students("Pratheeksha");

        
        Thread t1 = new Thread(student1::printStaticVariable);
        Thread t2 = new Thread(student2::printStaticVariable);
        Thread t3 = new Thread(student3::printStaticVariable);


        t1.start();
        t2.start();
        t3.start();
    }
}
