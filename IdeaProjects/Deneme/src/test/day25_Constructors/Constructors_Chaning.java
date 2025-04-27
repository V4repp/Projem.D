package test.day25_Constructors;

public class Constructors_Chaning {

    String name ;
    String breed;
    int age ;

    public Constructors_Chaning() {
        this("Eugene");
       // this("Harry", "Potter");
        System.out.println("Constructors_1");
    }

    public Constructors_Chaning(String name) {
        this("Harry", "Potter");
        this.name = name;
        System.out.println("Constructors_2");
    }

    public Constructors_Chaning(String breed, String name) {//<---Constructors
        this.breed = breed;
        this.name = name;
        System.out.println("Constructors_3");
    }

    public Constructors_Chaning(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        System.out.println("Constructors_4");
    }

    @Override
    public String toString() {
        return "Constructors_Chaning{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                '}';
    }
}
