package test.day26;

public class Odev1Methods {
    static String ruhsat;
    String marka;
    String rengi;
    int yili;
    int yavaslamasn;
    int hizlanmasn;

    public Odev1Methods(String marka, String rengi, int yili, int yavaslamasn, int hizlanmasn) {
        this.marka = marka;
        this.rengi = rengi;
        this.yili = yili;
        this.yavaslamasn = yavaslamasn;
        this.hizlanmasn = hizlanmasn;

    }

    @Override
    public String toString() {
        return "Odev1Methods{" +
                "marka='" + marka + '\'' +
                ", rengi='" + rengi + '\'' +
                ", yili=" + yili +
                ", yavaslamasn=" + yavaslamasn +
                ", hizlanmasn=" + hizlanmasn +
                ", ruhsat=" + ruhsat +
                '}';
    }

    public static void main(String[] args) {
Odev1Methods object1 = new Odev1Methods("BMW","Siyah",2001,15,40);

        Odev1Methods object2 = new Odev1Methods("Mercedes","Beyaz",2018,20,50);


        System.out.println("object1 = " + object1);
        System.out.println("object2 = " + object2);

    }

    static {
        System.out.println("Ben static bloğum.");
        Odev1Methods object3 = new Odev1Methods("Togg","Beyaz",2023,10,30);
        System.out.println("object3 = " + object3);
        object3.ruhsat = "Türkiye";
        System.out.println("object3 = " + object3);
    }
    {
        System.out.println("Instance block");
        System.out.println("Her obje koştuğunda bende koşarım.");
    }
}
