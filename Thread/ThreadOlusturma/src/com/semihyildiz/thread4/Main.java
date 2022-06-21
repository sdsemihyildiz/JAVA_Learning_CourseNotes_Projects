package com.semihyildiz.thread4;

public class Main {
    public static void main(String[] args) {
        //tek bir defa kullanılabilecek isim verilmemiş bir thread.
       new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread calisiyor.");
                for (int i=1;i<=10;++i){
                    System.out.println("Yaziyor: "+i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }

            }
        }) .start();


        System.out.println("Main thread calisiyor.");

    }
}