package JavaTutorial;

import java.util.Scanner;

public class Manav {
    public static void main(String[] args){
        double armut=2.14, elma=3.67, domates=1.11, muz=0.95, patlıcan=5, Toptutar;
        int patlıcanKilo, armutKilo, elmaKilo, domatesKilo, muzKilo;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Armut Kaç kilo: ");
        armutKilo = scanner.nextInt();

        System.out.print("Elma Kaç kilo: ");
        elmaKilo = scanner.nextInt();

        System.out.print("Domates Kaç kilo: ");
        domatesKilo = scanner.nextInt();

        System.out.print("Muz Kaç kilo: ");
        muzKilo = scanner.nextInt();

        System.out.print("Patlıcan Kaç kilo: ");
        patlıcanKilo = scanner.nextInt();

        Toptutar = muzKilo*muz + armutKilo*armut + elmaKilo*elma + domatesKilo*domates + patlıcanKilo*patlıcan;
        System.out.print("Toplam Tutar: " + Toptutar + " TL");


    }
}
