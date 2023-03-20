package JavaTutorial;

import java.util.Scanner;

public class Desen {

    static void des( int number ){
        int number1 = number;
        for (int i = number ; i>0 ; i=i-5 ){
            number1 -=5;
            System.out.print(number1 + " ");
        }
        int sonSayi = number1;


        for(int i=sonSayi; i<number; i+=5){
            sonSayi +=5;
            System.out.print(sonSayi + " ");

        }



    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı girin: ");
        int number = input.nextInt();
        des(number);

    }
}
