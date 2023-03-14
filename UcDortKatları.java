package JavaTutorial;

import java.util.Scanner;

public class UcDortKatları {
    public static void main(String[] args){
        int k, sayi=0 , toplam=0 ;
        Scanner inp = new Scanner(System.in);

        System.out.println("Sayı giriniz: ");
        k= inp.nextInt();

        for (int i=0; i <=k; i++){
            if((i%3 ==0) && (i%4==0) ){
                sayi +=1;
                toplam +=i;

            }
        } System.out.println(" 3 ve 4'ün katlarının ortalaması: " + (toplam/sayi));
    }

}
