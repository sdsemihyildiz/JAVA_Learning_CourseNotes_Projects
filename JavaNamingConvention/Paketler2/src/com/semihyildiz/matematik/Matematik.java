package com.semihyildiz.matematik;

public class Matematik implements IMatematik {

    public void toplama(int a, int b) {
        System.out.println("Toplama sonucu: " + (a + b));

    }

    @Override
    public void cikarma(int a, int b) {
        if (a - b < 0) {
            System.out.println("Cikarma sonucu: " + ((a - b) * -1));


        }
        System.out.println("Cikarma sonucu: " + (a - b));

    }

    @Override
    public void carpma(int a, int b) {
        System.out.println("Carpma sonucu: " + (a * b));

    }

    @Override
    public void bolme(int a, int b) {
        System.out.println("Bolme sonucu: " + (double) (a / b));

    }
}
