package JavaTutorial;

import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int yas, yolcuTipi, yolculukTipi ;
        double mesafe, normalTutar, indirimliTutar, yasIndirimi, tipIndirimi, fiyat;

        System.out.print("Mesafe km cinsinden giriniz: ");
        mesafe = input.nextDouble();
        String mesaj = (mesafe < 0) ? "Hatalı veri girdiniz!!" : " Devam edebilirsiniz.";
        System.out.println(mesaj);
        normalTutar = mesafe*0.10;


        System.out.print("Yaş giriniz: ");
        yas = input.nextInt();
        System.out.println(mesaj);
        mesaj = (yas < 0) ? "Hatalı veri girdiniz!!" : " Devam edebilirsiniz.";

        System.out.print("Yolculuk Tipi 1 or 2: ");
        yolculukTipi = input.nextInt();


        if (yolculukTipi==1){
            if (yas<12){
                fiyat = normalTutar - (normalTutar*0.5);
                System.out.print("Toplam Tutar: " +fiyat);

            } else if (yas>=12 && yas<24 ) {
                fiyat = normalTutar-(normalTutar*0.10);
                System.out.print("Toplam Tutar: " +fiyat);

            } else if (yas>=65) {
                fiyat = normalTutar-(normalTutar*0.30);
                System.out.print("Toplam Tutar: " +fiyat);

            } else {
                fiyat=normalTutar;
                System.out.print("Toplam Tutar: " +fiyat);
            }


        } else if (yolculukTipi==2) {
            if (yas<12){
                indirimliTutar = normalTutar - (normalTutar*0.5);
                fiyat = 2*(indirimliTutar-(indirimliTutar*0.20));
                System.out.print("Toplam Tutar: " +fiyat);
            } else if (yas>=12 && yas<=24 ) {
                indirimliTutar = normalTutar - (normalTutar*0.1);
                fiyat = 2*(indirimliTutar-(indirimliTutar*0.20));
                System.out.print("Toplam Tutar: " +fiyat);


            } else if (yas>=65) {
                indirimliTutar = normalTutar - (normalTutar*0.3);
                fiyat = 2*(indirimliTutar-(indirimliTutar*0.20));
                System.out.print("Toplam Tutar: " +fiyat);

            } else {
                tipIndirimi = normalTutar*0.20;
                fiyat = 2*(normalTutar-tipIndirimi);
                System.out.print("Toplam Tutar: " +fiyat);

            }

        }

        else {
            System.out.print("Yanlış tip girdiniz ");

        }



    }


}