class Hayvan {   //Superclass
    private String isim;

    public Hayvan(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String konus() {
        return "Hayvan konusuyor";

    }
}


class Kedi extends Hayvan {   //Subclass
    public Kedi(String isim) {
        super(isim);


    }

    @Override
    public String konus() {
        return this.getIsim() + " Miyavliyor";

    }
}

class Kopek extends Hayvan { //Subclass
    public Kopek(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " Havliyor";
    }
}

class At extends Hayvan {
    public At(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " Kisniyor";
    }
}

class Kus extends Hayvan {
    public Kus(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " Otuyor";
    }
}


public class Main {


    public static void konustur(Object object) {


        // System.out.println(object.konus());
        if (object instanceof Kopek) {
            Kopek kopek = (Kopek) object;
            System.out.println(kopek.konus());


        } else if (object instanceof Kedi) {
            Kedi kedi = (Kedi) object;
            System.out.println(kedi.konus());


        } else if (object instanceof At) {
            At at = (At) object;
            System.out.println(at.konus());

        } else if (object instanceof Hayvan) {
            Hayvan hayvan = (Hayvan) object;
            System.out.println(hayvan.konus());
        } else if (object instanceof Hayvan) {
            Kus kus = (Kus) object;
            System.out.println(kus.konus());
        }
    }


    public static void main(String[] args) {
        //instanceof
/*
        Kopek kopek=new Kopek("Karabas");


        if (kopek instanceof Hayvan) {
            System.out.println("Bu nesne Hayvan sinifindan.");

        }

*/
        Kopek kopek = new Kopek("Karabas");
        Kedi kedi = new Kedi("Tekir");
        At at = new At("Sahbatur");
        Hayvan hayvan = new Hayvan("Limon");
        Kus kus = new Kus("Muffin");
        konustur(kopek);
        konustur(kedi);
        konustur(at);
        konustur(hayvan);
        konustur(kus);

    }
}


