package test.day27;

public class ExceptionHandling {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Sorunun cevabı az sonra...");

        try {
            Thread.sleep(5000);

            System.out.println("trows keyword");

            Thread.sleep(5000);


            System.out.println("2. sorunun cevabı...");
            Thread.sleep(3000);

            System.out.println("Cevabı try/catch bloğu");
        }catch (InterruptedException e) {
        }

       Thread.sleep(4000);
       Thread.sleep(4000);
//       Thread.sleep(4000);
//       Thread.sleep(4000);

       int yas = 15;
       if (yas<0){
           throw new RuntimeException("Yaş 0'ın altında olamaz!");
       } else if (yas<18) {
           throw new RuntimeException("Seçme ve seçilme yaşı 18'in üstüdür.");
       }else {
           System.out.println("Seçme ve seçilme hakkında sahipsiniz.");
       }


    }
    }
