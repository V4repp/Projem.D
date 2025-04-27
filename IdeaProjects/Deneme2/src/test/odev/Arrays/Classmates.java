package test.odev.Arrays;

import java.util.Arrays;

public class Classmates {
    public static void main(String[] args) {
        /*1. create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines */

        String[] isimler = new String[10];
        isimler [0]="GAMZE ŞEN";
        isimler [1]="MİRAÇ KANDEMİR";
        isimler [2]="YÜCEL ÇEVİK";
        isimler [3]="KUBİLAY ERKURAN";
        isimler [4]="HAYATİ TÜTEN";
        isimler [5]="ALİ ÖZTÜRK";
        isimler [6]="MAHMUT YÜZBAŞIOĞLU";
        isimler [7]="BİRSEN VURAL";
        isimler [8]="SERDAL YÜCEL";
        isimler [9]="BÜNYAMİN SÖNMEZ";

        String as1="GAMZE ŞEN";
        String as2="MİRAÇ KANDEMİR";
        String as3="YÜCEL ÇEVİK";
        String as4="KUBİLAY ERKURAN";
        String as5="HAYATİ TÜTEN";
        String as6="ALİ ÖZTÜRK";
        String as7="MAHMUT YÜZBAŞIOĞLU";
        String as8="BİRSEN VURAL";
        String as9="SERDAL YÜCEL";
        String as10="BÜNYAMİN SÖNMEZ";

       char a1=isimler[0].charAt(0);
       char a2=isimler[1].charAt(0);
       char a3=isimler[2].charAt(0);
       char a4=isimler[3].charAt(0);
       char a5=isimler[4].charAt(0);
       char a6=isimler[5].charAt(0);
       char a7=isimler[6].charAt(0);
       char a8=isimler[7].charAt(0);
       char a9=isimler[8].charAt(0);
       char a10=isimler[9].charAt(0);
       char s1=isimler[0].charAt(isimler[0].indexOf(" ")+1);
       char s2=isimler[1].charAt(isimler[1].indexOf(" ")+1);
       char s3=isimler[2].charAt(isimler[2].indexOf(" ")+1);
       char s4=isimler[3].charAt(isimler[3].indexOf(" ")+1);
       char s5=isimler[4].charAt(isimler[4].indexOf(" ")+1);
       char s6=isimler[5].charAt(isimler[5].indexOf(" ")+1);
       char s7=isimler[6].charAt(isimler[6].indexOf(" ")+1);
       char s8=isimler[7].charAt(isimler[7].indexOf(" ")+1);
       char s9=isimler[8].charAt(isimler[8].indexOf(" ")+1);
       char s10=isimler[9].charAt(isimler[9].indexOf(" ")+1);
        System.out.println(as1+" ==> "+a1+"."+s1+".");
        System.out.println(as2+" ==> "+a2+"."+s2+".");
        System.out.println(as3+" ==> "+a3+"."+s3+".");
        System.out.println(as4+" ==> "+a4+"."+s4+".");
        System.out.println(as5+" ==> "+a5+"."+s5+".");
        System.out.println(as6+" ==> "+a6+"."+s6+".");
        System.out.println(as7+" ==> "+a7+"."+s7+".");
        System.out.println(as8+" ==> "+a8+"."+s8+".");
        System.out.println(as9+" ==> "+a9+"."+s9+".");
        System.out.println(as10+" ==> "+a10+"."+s10+".");
    }
}
