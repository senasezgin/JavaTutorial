package JavaTutorial;

import java.util.Scanner;

public class Kuvetleri {
    public static void main(String[] args){
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Sınır sayısını girin: ");
        n = input.nextInt();

        for (int i = 1, j=1 ; i <= n && j<= n ; i*=4, j*=5  ){
                System.out.println(i);
                System.out.println(j);

            }

    }


}
