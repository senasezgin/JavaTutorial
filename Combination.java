package JavaTutorial;

import java.util.Scanner;

public class Combination {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaçın kaçlı kombinasyonu sırayla giriniz: ");

        int n = scanner.nextInt();
        int r = scanner.nextInt();

        int total =1, total1=1, total2=1;


        for(int i=1; i<=n; i++){
            total = total*i;
        }

        for(int j=1; j<=r; j++){
            total1 *=j;
        }

        for (int k = 1; k <= (n-r); k++){
            total2 *= k;

        }

        System.out.print("Sonuc: " + ( total / (total1*total2) ));



    }
}
