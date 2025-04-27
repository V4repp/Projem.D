package test.day25_Constructors;

public class OgrenciIsleri {

    String name ;
    String surname ;
    char gender ;
    int ID ;
    int age ;

    @Override
    public String toString() {
        return "OgrenciIsleri{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender=" + gender +
                ", ID=" + ID +
                ", age=" + age +
                '}';
    }

    public void okuma () {
        System.out.println(name + " kitap okuyor...");
    }

    public void studying(){
        System.out.println(name + " ders çalışıyor...");

    }
}
