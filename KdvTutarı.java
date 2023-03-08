package JavaTutorial;

import java.awt.*;
import java.util.Scanner;

public class KdvTutarı {
    public static void main(String[] args){
        double tutar, kdvOran1= 0.18 , kdvOran2 = 0.08, kdvliTutar, kdvOran, kdvliFiyat ;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Harcama Tutarını girin ");
        tutar = scanner.nextDouble();

        kdvOran = (tutar <= 0) && (tutar <= 1000 ) ? kdvOran1 : kdvOran2;

        kdvliTutar =  kdvOran * tutar;
        kdvliFiyat = kdvliTutar + tutar;
        System.out.println(kdvliFiyat);





        /* double kdvTutar = tutar * kdvOran;
        double kdvliTutar = tutar+ kdvTutar;

        System.out.println("Kdvsiz tutar : " + tutar);
        System.out.println("Kdv Oranı : "+ kdvOran);
        System.out.println("kdv Tutarı : "+kdvTutar);
        System.out.println("kdvli tutar : " +kdvliTutar);

         */



    }

}
