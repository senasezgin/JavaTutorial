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
                yasIndirimi = normalTutar*0.5;
                indirimliTutar = normalTutar - yasIndirimi;
                System.out.print("Toplam Tutar: " + indirimliTutar);
            } else if (yas>=12 && yas<24 ) {
                yasIndirimi = normalTutar*0.10;
                indirimliTutar = normalTutar-yasIndirimi;
                System.out.print("Toplam Tutar: " + indirimliTutar);
            } else if (yas>=65) {
                yasIndirimi = normalTutar*0.30;
                indirimliTutar = normalTutar-yasIndirimi;
                System.out.print("Toplam Tutar: " + indirimliTutar);
            } else {
                System.out.print("Toplam Tutar: " + normalTutar);
            }

        } else if (yolculukTipi==2) {
            if (yas<12){
                yasIndirimi = normalTutar*0.5;
                indirimliTutar = normalTutar - yasIndirimi;
                tipIndirimi = indirimliTutar*0.20;
                fiyat = 2*(indirimliTutar-tipIndirimi);
                System.out.print("Toplam Tutar: " + fiyat);
            } else if (yas>=12 && yas<=24 ) {
                yasIndirimi = normalTutar*0.10;
                indirimliTutar = normalTutar-yasIndirimi;
                tipIndirimi = indirimliTutar*0.20;
                fiyat = 2*(indirimliTutar-tipIndirimi);
                System.out.print("Toplam Tutar: " + fiyat );
            } else if (yas>=65) {
                yasIndirimi = normalTutar*0.30;
                indirimliTutar = normalTutar-yasIndirimi;
                tipIndirimi = indirimliTutar*0.20;
                fiyat = 2*(indirimliTutar-tipIndirimi);
                System.out.print("Toplam Tutar: " + fiyat );
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
