package Day1_HesapMakinesi;

import java.util.Scanner;

public class C01_HesapMakinesi {

    static double sayi1;
    static double sayi2;
    static String operators ;

    public static void main(String[] args) {

        hesapMakinesi();

    }

    public static void hesapMakinesi(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("ilk sayiyi giriniz");
        sayi1 = scanner.nextDouble();

        System.out.println("ikinci sayiyi giriniz");
        sayi2 = scanner.nextDouble();

        System.out.println("yapilacak islemi giriniz ('+' , '-' , '*' , '/')");
        operators = scanner.next();

        double sonuc = 0;

        switch (operators){

            case "+":
                sonuc = sayi1+sayi2;
                break;
            case "-":
                sonuc = sayi1-sayi2;
                break;
            case "*":
                sonuc = sayi1*sayi2;
                break;
            case "/":
                if (sayi2!=0){
                    sonuc = sayi1 / sayi2;
                }
                else {
                    System.out.println("ifira bılme hatasi");
                    return;
                }
                return;
            default:
                System.out.println("gecersiz operator");
                return;

        }
        System.out.println("sonuc : " + sonuc);

    }


}
