package Calismalar;

public class Ternaries {
    public static void main(String[] args) {
        int not = 100;
        String sonuc = (not >= 0 && not <= 50) ? "Notunuz E'dir." : (not >= 51 && not <= 70) ? "notunuz D'dir." :(
                not>=71 && not<=80)?"Notunuz C'dir.":(not>=81 && not<=90)?"notuz B'dir.":(
                        not>=91 && not<=100)?"Notunuz A'dır.":"Girilen not yanlıştır kontrol edip yeniden giriniz.";


    }
}
