package test.odev;

public class MaasHesabi {
    public static void main(String[] args) {
        //1. Aşağıdaki değişkenleri oluştur:
        //					SaatBasıUcret, HaftalikToplamCalısmaSaati, VergiOranı
        //
        //			2. Yukarıda oluşturduğun depişkenlere değer ata ve aşağıdaki bilgierli bu değerlere göre hesapla:
        //					1. VergiOncesiMaas
        //					2. VergiKesintisi
        //					3. VergiSonrasiMaas
        //
        //					Bilgi: VergiSonrasiMaas = SaatBasıUcret* HaftalikToplamCalısmaSaati* 52
        //
        //			3. Yukarıdaki tüm hesaplanan değerleri ve değişkenleri sıra ile print et.
        double saat_basi_ucret = 475.35;
        double vergi_orani = 0.125;
        double haftalikToplamCalismaSaati = 40;

        double vergiOncesiMaas = saat_basi_ucret * haftalikToplamCalismaSaati*4;
        double vergiKesintisi = vergiOncesiMaas * vergi_orani;
        double vergiSonrasiMaas= vergiOncesiMaas-vergiKesintisi;

        System.out.println("saat_basi_ucret = " + saat_basi_ucret+" TL");
        System.out.println("vergi_orani = " + vergi_orani);
        System.out.println("haftalikToplamCalismaSaati = " + haftalikToplamCalismaSaati+" Saat");
        System.out.println("vergiOncesiMaas = " + vergiOncesiMaas+" TL");
        System.out.println("vergiKesintisi = " + vergiKesintisi+" TL");
        System.out.println("vergiSonrasiMaas = " + vergiSonrasiMaas+" TL");
    }
}
