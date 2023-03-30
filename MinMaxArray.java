package JavaTutorial;

import java.util.Scanner;
import java.util.Arrays;

public class MinMaxArray {
    public static void main(String[] args) {
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};

        System.out.println(Arrays.toString(list));

        Scanner input = new Scanner(System.in);
        System.out.print("Girilen Sayı : ");
        int n = input.nextInt();

        Arrays.sort(list);
        int max=0;
        int min=0;

        for (int i : list) {
            if (n < i) {
                max = i;
                System.out.println("Girilen sayıdan büyük en yakın sayı :" + max);
                break;
            }
        }

        for (int i= list.length-1; i>0; i--) {

            if (n > list[i]){
                min=list[i];
                System.out.println("Girilen sayıdan küçük en yakın sayı :"+min);
                break;
            }
        }

    }
}
