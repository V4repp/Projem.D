package test.day14;

public class Remove_Dublicates {
    public static void main(String[] args) {

        /*String str = "aabbcc";

          String result = ""; //"abc"*/

        String str1="aaaabbbcc";
        String sonuc="";//a/b

        for (int i = 0;i<=str1.length()-1;i++){//i=0/

            String str2=""+str1.charAt(i);//a/b

          /*  if (!sonuc.contains(str2)){
                sonuc+=str2;
            }
*/
         if(sonuc.contains(str2)){
              continue;
          }else{
              sonuc+=str2;
          }

        }

        System.out.println("sonuc = " + sonuc);


    }
}
