package test.day24;

public class Zoo {
    public static void main(String[] args) {

        Animals animals1 = new Animals();
        animals1.name = "Kaplan";
        animals1.gender = "Dişi";
        animals1.color = "Sarı";
        animals1.cageNum = 10;
        animals1.age = 6;


        Animals animals2 = new Animals();
        animals2.name= "Leopar";
        animals2.gender = "Erkek";
        animals2.color = "Beyaz";
        animals2.cageNum = 11;
        animals2.age = 15;


        Animals animals3 = new Animals();
        animals3.name= "Timsah";
        animals3.gender = "Erkek";
        animals3.color = "yeşil";
        animals3.cageNum = 1;
        animals3.age = 70;

        System.out.println("animals1 = " + animals1);
        System.out.println("animals2 = " + animals2);
        System.out.println("animals3 = " + animals3);
    }
}
