package test.day28.encapsulation;

public class Student {

    private String name;
    private String lastName;
    private int age;
    private int schoolID;
    private String classNum;

    public Student() {

    }

    public Student(String name, String lastName, int age, int schoolID, String classNum) {
        setName(name);
        setLastName(lastName);
        setAge(age);
        setSchoolID(schoolID);
        setClassNum(classNum);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            System.out.println("İsim girilmemiştir.");
            System.exit(0);
        }
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null) {
            System.out.println("Soyisim girilmemiştir.");
            System.exit(0);
        }
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 6 && age < 100) {
            this.age = age;
        } else {
            System.out.println("Girilen yaş geçerli değildir.");
            System.exit(0);
        }
    }

    public int getSchoolID() {
        return schoolID;
    }

    public void setSchoolID(int schoolID) {
        this.schoolID = schoolID;
    }

    public String getClassNum() {
        return classNum;
    }

    public void setClassNum(String classNum) {
        this.classNum = classNum;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", schoolID=" + schoolID +
                ", classNum='" + classNum + '\'' +
                '}';
    }

   /* public Student( String name,String lastName, int age, int schoolID, String classNum) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.schoolID = schoolID;
        this.classNum = classNum;
    }*/
}
