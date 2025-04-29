package test.day06_unary_operations_tekil_işlemler;

public class UnaryOperations {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 10;

        System.out.println("------------------------- Increment(arttırma)/Decrement(azalma) -----------------------------------");
        System.out.println("num1 = " + (num1 + 1));//21
        System.out.println(num1);//20
        System.out.println("num1 = " + (++num1));//21
        System.out.println("num1 = " + num1);//21

        num1 = num1 + 1;//
        System.out.println("num1 = " + num1);//22

        num1++;//23
        System.out.println("num1 = " + (num1++));//23
        System.out.println("num1 = " + num1);//24

        System.out.println("num1 = " + (--num1));//23
        System.out.println("num1 = " + (num1--));//23
        System.out.println("num1 = " + num1);//22
        System.out.println();
        System.out.println("----------------------------- Kısayol (shorthand) Operatörleri-------------------------------------------------");

        num1 += num2;//32
        num1 = num1 + num2;//42

        System.out.println("num1 = " + num1);
        num1 -= 20;
        num1 *= num2;
        System.out.println("num1 = " + num1);
        num1 /= num2;
        System.out.println("num1 = " + num1);
        num1 %= num2;//2
        System.out.println("num1 = " + num1);

        System.out.println();
        System.out.println("----------------------------- Kısayol (shorthand) Operatörleri-------------------------------------------------");

        System.out.println("(num1>num2) = " + (num1 > num2));//true/false
        boolean karsilastirma_1 = num1 < num2;
        boolean karsilastirma_2 = num1 <= num2;
        boolean karsilastirma_3 = num1 == num2;
        boolean karsilastirma_4 = num1 != num2;// eşit değil (!=)
        int num10 = 10;
        int num11 = 1;
        boolean krsilastirma = num10!=num11;
        System.out.println("krsilastirma = " + krsilastirma);

        System.out.println("karsilastirma_1 = " + karsilastirma_1);
        System.out.println("karsilastirma_2 = " + karsilastirma_2);
        System.out.println("karsilastirma_3 = " + karsilastirma_3);
        System.out.println("karsilastirma_4 = " + karsilastirma_4);


    }
}
