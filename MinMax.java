package JavaTutorial;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç sayı gireceksiniz: ");
        int n = input.nextInt();

        int i=1,  sayac =1, number ;
        int maxNumber=0, minNumber=0;


        while (i <= n){
            System.out.println( i + ". Sayı girin");
            number  = input.nextInt();

            if (i==1){
                maxNumber = number;
                minNumber = number;
            }
            if (number>=maxNumber) {
                maxNumber=number;

            } if (number<minNumber) {
                minNumber=number;

            }
            i++;

        }
        System.out.println("Max Number: "+maxNumber);
        System.out.println("Min Number: "+minNumber);


       /* for(int i=1; i<=n; i++){
            System.out.print(i + ". Sayıyı Giriniz : ");
            number = input.nextInt();

            if(i==1){
                maxNumber = number;
                minNumber = number;
            }
            if(number>=maxNumber){
                maxNumber=number;
            }
            if(number<=minNumber){
                minNumber = number;
            }
        }
        System.out.println("Max Number : " + maxNumber);
        System.out.println("Min Number : " + minNumber); */
    }
}



