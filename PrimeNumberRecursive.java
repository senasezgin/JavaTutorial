package JavaTutorial;

import java.util.Scanner;

public class PrimeNumberRecursive {
    static void prime(int number) {

        int count = 0;

        for (int y = 2; y <= number-1 ; y++) {
            if (number % y == 0) {
                count++;
            }
        }
            if (count == 0) {
                System.out.print(number + "sayısı asaldır ");
            } else {
                System.out.println(number + "sayısı asal değildir");
            }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı girin:  : ");
        int number= input.nextInt();
        prime(number);


    }
}
