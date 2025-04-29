package test.day08_if_and_swich_statiment_swich_ifadeleri;

public class Ternaries_Okul_notlari {
    public static void main(String[] args) {

        /* Girilen nota uygun olacak şekilde öğrencinin kredisini ekrana yazdıran bir program yazalım.
        Notlar ve kredi karşıklıkları:
        0-60 : E
        61-70 : D
        71-80 : C
        81-90 : B
        91-100: A*/
        int not = 75;
        String sonuc = (not >= 0 && not <= 60) ? "Notunuz E'dir. not= " + not :
                (not >= 61 && not <= 70) ? "Notunuz D'dir. Not= " + not : (not <= 71 && not >= 80) ? "Notunuz C'dir. Not= " + not :
                        (not >= 81 && not <= 90) ? "Notunuz B'dir. Not= " + not : (not <= 91 && not >= 100) ? "Notunuz A'dir. Not= " + not :
                                "Geçerli not değildir girdiğiniz notu kontrol ediniz.";

        System.out.println("sonuc = " + sonuc);
    }
}
