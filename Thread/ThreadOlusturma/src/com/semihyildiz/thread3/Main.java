package com.semihyildiz.thread3;

public class Main {
    public static void main(String[] args) {
        //Anonim class ile thread olusturma, herhangi bir extra class tanımlamadan calistirmak için böyle yapabiliriz.

        Thread printer1= new Thread(new Runnable() {
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
        });
        printer1.start();

        System.out.println("Main thread calisiyor.");

    }
}
