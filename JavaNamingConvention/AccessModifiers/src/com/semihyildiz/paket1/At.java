package com.semihyildiz.paket1;

import com.semihyildiz.paket2.Hayvan;

public class At extends Hayvan {


    public At(String isim) {
        super(isim);
    }

    public void ismini_soyle() {
        System.out.println(super.isim);  //protected bir alanı farklı pakette super komutu ile kullanabiliriz.

    }
}
