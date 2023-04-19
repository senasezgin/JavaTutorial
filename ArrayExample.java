package JavaTutorial;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayExample {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> cikti = new ArrayList<>();
        int count = 0;

        System.out.print("Dizinin boyustunu giriniz: ");
        int n = input.nextInt();
        int[] list = new int[n];


        System.out.println("Diziniz elemanları giriniz ");
        for (int i = 0; i < n; i++) {
            System.out.print(i + ".Elemanı giriniz:");
            int eleman = input.nextInt();
            list[count++] = eleman;
        }
        System.out.println(list);


        for (int eleman : list) {
            if (!cikti.contains(eleman)) {
                cikti.add(eleman);
            }
        }

        System.out.println(cikti);


    }
}
