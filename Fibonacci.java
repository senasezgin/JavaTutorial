package JavaTutorial;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Adım sayısını giriniz");
        int n = input.nextInt();
        int count = 0;
        int n1=0, n2=1;
        int toplam;
        for (int i=1; i<=n; i++){
            while (count < n){
                toplam = n1 + n2;
                n1 = n2;
                n2 = toplam;
                count +=1;
                System.out.print(" "+toplam);

            }

        }


    }
}
