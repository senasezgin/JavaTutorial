package JavaTutorial;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args ){
        Scanner scanner = new Scanner(System.in);
        int n1, n2, islem;
        double sonuc;

        System.out.print(" 1. sayıyı giriniz ");
        n1 = scanner.nextInt();

        System.out.print(" 2. sayıyı giriniz ");
        n2 = scanner.nextInt();

        System.out.print("Toplama için:1, Çıkartma için:2, Çarpma için:3, Bölme için:4 basınız ");

        islem = scanner.nextInt();
         switch (islem) {
             case 1:
                 System.out.print("n1+n2= " + (n1+n2));
                 break;
             case 2:
                 System.out.print("n1-n2= " + (n1*n2));
                 break;
             case 3:
                 System.out.print("n1*n2= " + (n1*n2));
                 break;
             case 4:
                 if(n2==0){
                     System.out.print("Gecersiz");
                     break;
                 }
                 System.out.print("n1/n2= " + (n1/n2));
                 break;
             default:
                 System.out.print("Geçersiz işlem. ");


         }

    }
}
