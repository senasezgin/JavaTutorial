package JavaTutorial;

import java.util.Date;
import java.util.Scanner;

public class BurcHesaplama {
    public static void main(String[] args){
        String[] burc = new String[12];
        int ay = 0, gun=0,yil=0;
        burc[0]="21_2_0-20_3_0-Koc";
        burc[1]="21_3_0-21_4_0-Boga";
        burc[2]="22_4_0-22_5_0-Ikizler";
        burc[3]="23_5_0-22_6_0-Yengec";
        burc[4]="23_6_0-22_7_0-Aslan";
        burc[5]="23_7_0-22_8_0-Basak";
        burc[6]="23_8_0-22_9_0-Terazi";
        burc[7]="23_9_0-21_10_0-Akrep";
        burc[8]="22_10_0-21_11_0-Yay";
        burc[9]="22_11_0-21_0_1-Oglak";
        burc[10]="22_0_0-19_1_0-Kova";
        burc[11]="20_1_0-20_2_0-Balik";

        Scanner reader  = new Scanner(System.in);

        System.out.print("Doğum ayı giriniz: ");
        ay = reader.nextInt()-1;
        System.out.print("Doğum gününüzü giriniz:");
        gun = reader.nextInt();

        if(ay==0 && gun < 22 ) yil += 1;
        if((ay<12 && ay>=0) && (gun<32 && gun>0)) {

            for(int i=0 ;i<burc.length;i++) {
                //orn: "21_2_0-20_3._0-Koc"

                String[] burcInfo = burc[i].split("-");
                String burcIsim = burcInfo[2];
                String[] beforeDateString = burcInfo[0].split("_");
                String[] afterDateString = burcInfo[1].split("_");

                Date userDate = new Date(yil,ay,gun);


                int _gun,_ay,_yıl;
                _gun = Integer.parseInt(String.valueOf(beforeDateString[0]));
                _ay = Integer.parseInt(String.valueOf(beforeDateString[1]));
                _yıl = Integer.parseInt(String.valueOf(beforeDateString[2]));

                Date beforeDate = new Date(_yıl,_ay,_gun);


                _gun = Integer.parseInt(String.valueOf(afterDateString[0]));
                _ay = Integer.parseInt(String.valueOf(afterDateString[1]));
                _yıl = Integer.parseInt(String.valueOf(afterDateString[2]));

                Date afterDate = new Date(_yıl,_ay,_gun);
                boolean result = (userDate.after(beforeDate) && userDate.before(afterDate)) || (userDate.equals(beforeDate) || userDate.equals(afterDate));
                if(result) System.out.print(burcIsim);
            }
        }
        else System.out.print("hatalı bilgi girdiniz");
    }
}
