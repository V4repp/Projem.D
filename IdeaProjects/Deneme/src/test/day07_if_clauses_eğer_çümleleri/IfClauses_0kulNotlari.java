package test.day07_if_clauses_eğer_çümleleri;

public class IfClauses_0kulNotlari {
    public static void main(String[] args) {

/* Girilen nota uygun olacak şekilde öğrencinin kredisini ekrana yazdıran bir program yazalım.
Notlar ve kredi karşıklıkları:
0-60 : E
61-70 : D
71-80 : C
81-90 : B
91-100: A*/


        int not = -81;


        if (not > 0 && not < 100) {

            if (not >= 0 && not <= 60) {
                System.out.println("Krediniz \"E\"'dir. Başarısızdır.");
            } else if (not >= 61 && not <= 70) {
                System.out.println("Krediniz \"D\"'dir. Geçtiniz. ");
            } else if (not >= 71 && not <= 80) {
                System.out.println("Krediniz \"C\"'dir. Başarılı.");

            } else if (not >= 81 && not <= 90) {
                System.out.println("Krediniz \"B\"'dir. Teşekkür belgesi. ");

            } else {
                System.out.println("Krediniz \"A\"'dır. Taktir belgesi.");
            }
        } else {
            System.out.println("Girdiğiniz notu kontrol ediniz.(not 0'dan küçük ve 100'den büyük olamaz!)");
        }


    }
}
