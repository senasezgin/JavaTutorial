package JavaTutorial;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("n1 sayısını giriniz: ");
        int n1 = input.nextInt();

        System.out.println("n2 sayısına giriniz: ");
        int n2 = input.nextInt();

        int i = 1, ebob=0, ekok=0;
        while (i <= n1 && i <= n2){

            if (n1 % i == 0 && n2 % i == 0) {
                System.out.println(i);
                ebob = i;
            }
            i++;
        }
        ekok=(n1*n2)/ebob;

        System.out.println("Ebob" + ebob);
        System.out.println("Ekok" + ekok);





       /* for (int i=1; i<=(n1*n2); i++){
            if (i%n1==0 && i%n2 ==0){
                System.out.println(i);
                break;
            }
        }*/





       /*

        if (n1 > n2) {
            for (int i = 1; i <= n1; i++) {
                if (n1 % i == 0 && n2 % i == 0) {
                    System.out.println(i);
                }

            }
        } else {
            for (int i = 1; i <= n2; i++) {
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                    System.out.println(i);
                }

            }
        } */

    }
}


