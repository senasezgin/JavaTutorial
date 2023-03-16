package JavaTutorial;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int n = input.nextInt();
        int toplam = 0;

        for (int i=1; i<=n; i++)
            if (n%i==0) {
                ;
                toplam = +i;
            }
        if (toplam==n){
            System.out.println("Mükemmel sayıdır");

        }else{
            System.out.println("Mükemmel sayı değildir");
                }


    }
}
