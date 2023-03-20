package JavaTutorial;

import java.util.Scanner;

public class UsAlmaRecursive {
    static int us(int base, int exponent) {
        if (exponent==0) {
            return 1;
        }else {
            return base* us(base, exponent-1);

        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Taban degeri giriniz: ");
        int base = input.nextInt();
        System.out.println("Üs degeri giriniz: ");
        int exponent = input.nextInt();
        System.out.println("Sonuç: " + us(base, exponent));

        System.out.println();

        }
}
