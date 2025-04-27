package test.odev;

public class Oxygen_Tank {
    public static void main(String[] args) {
        double oksijen_miktari = 10;

        if (oksijen_miktari <= 100 && oksijen_miktari >= 50 && oksijen_miktari>=0) {
            if (oksijen_miktari <= 100 && oksijen_miktari >= 91) {
                System.out.println("Tankınız dolu.");
            } else if (oksijen_miktari <= 90 && oksijen_miktari >= 81) {
                System.out.println("Hâlâ devam edebilirsiniz.");
            } else if (oksijen_miktari <= 80 && oksijen_miktari >= 71) {
                System.out.println("Çok uzağa gitmeyin.");
            } else if (oksijen_miktari <= 70 && oksijen_miktari >= 51) {
                System.out.println("Geri dönüşe başlayın.");
            } else {
                System.out.println("Dikkatli olun, oksijen miktarınız %50.");
            }
        }else{
            System.out.println("Tankınız %50'den azdır.");
        }
String Oksijen_miktari=(oksijen_miktari <= 100 && oksijen_miktari >= 91)?"Tankınız dolu.":(oksijen_miktari <= 90 && oksijen_miktari >= 81)?
        "Hâlâ devam edebilirsiniz.":(oksijen_miktari <= 80 && oksijen_miktari >= 71)?"Çok uzağa gitmeyin.":
        (oksijen_miktari <= 70 && oksijen_miktari >= 51)?"Geri dönüşe başlayın.":"Dikkatli olun, oksijen miktarınız %50.";
        System.out.println("Oksijen_miktarı = " + Oksijen_miktari);


    }
}
//OxygenTank adında bir class oluştur. Denize tüple dalış yapan insanları oksijen seviyesine göre uyaran bir yazılım yapacağız. Aşağıdaki oksiken seviyelerine uyf-gun olacak şekilde mesajı konsola yazdıracağız.
//                91 -100 -->  Tankınız dolu
//                81 -90  --> Hâlâ devam edebilirsiniz
//                71 - 80 --> Çok uzağa gitmeyin
//                51 - 70 --> Geri dönüşe başlayın
//                50 --> Dikkatli olun, oksijen miktarınız %50
//Kolay gelsin...