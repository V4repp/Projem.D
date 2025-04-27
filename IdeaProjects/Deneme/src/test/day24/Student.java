package test.day24;

public class Student {

    String isim ;
    String soyIsim ;
    String cinsiyet ;
    int okulNumarasi ;

    @Override
    public String toString() {
        return "Student{" +
                "isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", cinsiyet='" + cinsiyet + '\'' +
                ", okulNumarasi=" + okulNumarasi +
                '}';
    }
}
