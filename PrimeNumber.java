package JavaTutorial;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("1'den 100'e kadar asal sayılar : ");

        for (int i = 2; i <= 100; i++) {
            boolean PrimeIs = true;

            for (int y = 2; y<= i / 2; y++) {
                if (i % y == 0) {
                    PrimeIs = false;
                    break;
                }

            }
            if (PrimeIs){
                System.out.print( " " + i );
            }

        }
    }
}