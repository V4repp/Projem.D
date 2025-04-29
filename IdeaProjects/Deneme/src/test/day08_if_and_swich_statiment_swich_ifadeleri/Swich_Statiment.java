package test.day08_if_and_swich_statiment_swich_ifadeleri;

public class Swich_Statiment {
    public static void main(String[] args) {
        /* Asansor adında bir class oluştur.
        Kat numarası girildiğinde, numaraya uygun olarak  aşağıdaki bilgileri yazdırın
			katNumarası 1 -> "Kat 1 seçildi. Firmalar: Lobby, Verizon, Starbucks"
			katNumarası 2 -> "Kat 2 seçildi. Firmalar: Companies: Cydeo, NASA, Intelsat"
			katNumarası 3 -> "Kat 3 seçildi. Firmalar: Companies: Lyft, BofA, Stake house"*/

        int katNumarasi=2;

        switch (katNumarasi){

            case 1:
                System.out.println("Kat 1 seçildi. Firmalar: Lobby, Verizon, Starbucks");
                break;
            case 2:
                System.out.println("Kat 2 seçildi. Companies: Cydeo, NASA, Intelsat");
                break;
            case 3:
                System.out.println("Kat 3 seçildi. Companies: Lyft, BofA, Stake house");
                break;
            default:
                System.out.println("Girdiğiniz kat numarasını kontrol edin!!!");
                break;

        }





    }
}
