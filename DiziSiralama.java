package JavaTutorial;

import java.util.Arrays;
import java.util.Scanner;

public class DiziSiralama {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int count =0;

        System.out.print("Dizinin boyustunu giriniz: ");
        int n = input.nextInt();
        int[] list = new int[n];

        System.out.println("Diziniz elemanları giriniz ");
        for(int i=0; i<n; i++) {
            System.out.print(i + ".Elemanı giriniz:");
            int eleman = input.nextInt();
            list[count++] = eleman;
        }
        Arrays.sort(list);
        System.out.print("Küçükten büyüğe: ");
        for (int j=0; j<list.length; j++){
            System.out.print(list[j]+ " ");



        }
    }

}
