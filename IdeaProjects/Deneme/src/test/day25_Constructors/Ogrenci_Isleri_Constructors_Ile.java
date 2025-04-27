package test.day25_Constructors;

public class Ogrenci_Isleri_Constructors_Ile {

    String name ;
    String surname ;
    char gender ;
    int ID ;
    int age ;

    public Ogrenci_Isleri_Constructors_Ile(String name) {
        this.name = name;
    }

    public Ogrenci_Isleri_Constructors_Ile(String name, String surname, char gender, int ID, int age) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.ID = ID;
        this.age = age;
    }

    public Ogrenci_Isleri_Constructors_Ile(String surname, String name) {
        this.name = name;
        this.surname = surname;
    }

    public Ogrenci_Isleri_Constructors_Ile(String name, String surname, char gender, int age) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Ogrenci_Isleri_Constructors_Ile{" +
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
