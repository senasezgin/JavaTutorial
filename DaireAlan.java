package JavaTutorial;

import java.util.Scanner;

public class DaireAlan {
    public static void main(String[] args){
        int a , r;
        double pi=3.14, alan;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dereceyi girin");
        a = scanner.nextInt();

        System.out.println("Yarıçapı Girin");
        r = scanner.nextInt();

        alan = (pi*r*r*a)/360;
        System.out.println("Alan: " + alan);



    }
}
