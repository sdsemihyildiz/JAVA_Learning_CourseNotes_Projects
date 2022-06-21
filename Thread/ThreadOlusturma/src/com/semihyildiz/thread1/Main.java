package com.semihyildiz.thread1;

public class Main {

    public static void main(String[] args) {
        System.out.println("Main Thread calisiyor.");
    //Bu printer objelerini bir threade dönüşmüş olan bir printer classından ürettiğimiz için thread gibi davranacaklar.

        Printer printer1= new Printer("Printer1");
        Printer printer2= new Printer("Printer2");
        //.start komutu ile başlatıyoruz.
        printer1.start();
        printer2.start();







    }
}
