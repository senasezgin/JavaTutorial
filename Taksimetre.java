package JavaTutorial;

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args){
        int minTutar=20, km;
        double perKm=2.20, total, starPrice=10 ;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Harcama km cinsinden giriniz ");
        km = scanner.nextInt();
        total = (km*perKm);
        total += starPrice;
        total = (total< 20) ? 20 : total;
        System.out.println("Toplam tutar: " + total );




    }
}
