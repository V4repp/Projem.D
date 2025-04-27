package test.odev.Loops;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
      /* Create a class called RoomReservation, write a program for the room reservation, your program asks the user wants to reserve a room.
    	if user entered yes, then ask which type of room the user wants to reserve. if user entered no, print "have a nice day"
    			(if user entered any invalid answer (other than yes/no) ask user to reenter until user provides a valid entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

            the program should be able to display the room he/she reserved and total price of the room.

            (if the user selected an invalid room, ask the user to reselect the room until
             user provides a valid entry)

    Burada internet üzerinden oda kiralama amaçlı bir code yazacağız. Önce kullanıcıya oda

    kiralamak isteyip istemediğini soracağız. Evet derse hangi tip oda istediğini soracağız.
      Hayır derse "İyi günler" diyerek kodu durduracağız.

    Eğer kullanıcı yukarıdaki soruya Eve/Hayır harix
    harici bir şey yazarsa "Yanlış giriş yaptınız, tekrar deneyi diyerek" bir daha

    "Evet/Hayır" cevabını kontrol edeceğiz. doğru cevap verene kadar bu soruyu sorduracağız.
    Bunlar odalar ve ücretleri:

                    King Bed (Kral Odası) ==> 120$
	            Queen Bed (Kraliçe Odası) ==> 100$
	            single Bed (Tek kişilik Oda)  ==> 80$

    Bunlar 1 gecelik fiyatlar. Kullanıcı odayı seçtikten sonra bir de kaç gün kalacağını
    da girecek. Programın sonunda kullanıcının hangi odayı seçtiğini, kaç gün kalacağını
    ve toplam ücreti yazdırmalıyız. Eğer kullanıcı burada olan oda seçeneklerini doğru
    girmezse "hatalı seçim, yeniden giriniz" diyerek tekrar oda seçeneklerini soracağız,
    ta ki doğru değer girene kadar... */

        Scanner scan = new Scanner(System.in);


        System.out.print("Oda kiralamak ister misiniz? Evet/Hayır ");
        String cevap1 = scan.next();
        if (cevap1.equalsIgnoreCase("Hayır")) {
            System.out.println("İyi günler.");


        } else if (cevap1.equalsIgnoreCase("Evet")) {
            System.out.println(" ");
            System.out.println("King Bed (Kral Odası) ==> 120$");
            System.out.println(" ");
            System.out.println("Queen Bed (Kraliçe Odası) ==> 100$");
            System.out.println(" ");
            System.out.println("Single Bed (Tek kişilik Oda)  ==> 80$");
            System.out.println(" ");
            System.out.println("Hangi odayı kiralamak istersiniz?\n Not:(Bunlar 1 gecelik fiyatlarıdır.)\n Not2:(Sadece odanın adını yazınız tam olduğuna dikkat ediniz.)");
            String cevap2 = scan.next();

            while (!(cevap2.equalsIgnoreCase("King") || cevap2.equalsIgnoreCase("Queen") || cevap2.equalsIgnoreCase("Single"))) {
                System.out.println("Girdiğiniz oda adı yanlıştır tekrar oda adı giriniz.");
                cevap2 = scan.next();
            }
            System.out.println("Kaç gün kalıcaksınız?");
            int sonuc3 = scan.nextInt();

            if (cevap2.equalsIgnoreCase("King")) {
                int sonucK = 120 * sonuc3;
                System.out.println("King Bed (Kral Odası) ==> " + sonucK+" $");

            } else if (cevap2.equalsIgnoreCase("Queen")) {
                int sonucQ = 100 * sonuc3;
                System.out.println("Queen Bed (Kraliçe Odası) ==> " + sonucQ+" $");

            } else if (cevap2.equalsIgnoreCase("Single")) {
                int sonucS = 80 * sonuc3;
                System.out.println("Single Bed (Tek kişilik Oda)  ==> " + sonucS+" $");
            } else {

            }
        } else {
            System.out.println("Girdiğiniz cevap yanlıştır. Evet yada Hayır yazınız.");
            cevap1 = scan.next();
        }
    }

}