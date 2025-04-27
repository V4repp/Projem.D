package test.day18;

public class Braching_Statement_Break_Continue {
    public static void main(String[] args) {


        for (int i =1;i<50;i++){
            if (i==25){
                break;
            }else {

                System.out.println(i);
            }
        }
        System.out.println("------------------- Braching_Statement -----------------------------");
        for (int i =50 ; i>0; i--){
            if (i%5==0){
                continue;
            }
            System.out.println(i);

        }


    }
}
