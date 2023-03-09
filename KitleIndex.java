package JavaTutorial;

import java.util.Scanner;

public class KitleIndex {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double boy, kilo, index;

        System.out.println("Lütfen metre cinsinden boy girin ");
        boy = scanner.nextDouble();

        System.out.println("Lütfen kilo girin ");
        kilo = scanner.nextDouble();

        index = kilo/(boy*boy);
        System.out.print("Vücut Kitle Indeksiniz " + index);

    }
}
