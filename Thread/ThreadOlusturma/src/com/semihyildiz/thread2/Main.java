package com.semihyildiz.thread2;

public class Main {

    public static void main(String[] args) {
        //runnable ile thread oluşturma
        Thread printer1= new Thread(new Printer("Printer1"));
        Thread printer2= new Thread(new Printer("Printer2"));

        printer1.start();
        printer2.start();






        System.out.println("Main Thread calisiyor.");








    }
}
