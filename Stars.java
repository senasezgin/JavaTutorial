package JavaTutorial;

import java.util.Scanner;

public class Stars {
    public static void main(String[] args){
        Scanner klavye = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz :");
        int n = klavye.nextInt();

        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= ((2 * i) - 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for (int x = 1; x <= n-1 ; x++) {
            for (int z = 1; z <= x; z++) {
                System.out.print(" ");
            }
            for (int y = (2*(n-x)-1); y >= 1 ; y--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }



    }
}
