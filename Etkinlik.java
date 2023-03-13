package JavaTutorial;

import java.util.Scanner;

public class Etkinlik {
    public static void main(String[] args) {
        int heat;
        String message= "Ne yapılabilir: ";

        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık Giriniz : ");
        heat = input.nextInt();


        if (heat < 5) message += "\nKayak yapabilirsin";
        if (heat >= 5 ) message += "\nSinemaya gidebilirsin";
        if (heat >= 10 && heat < 25) message += "\nPikniğe Gidebilirsin";
        if (heat >= 25) message += "\nYüzmeye Gidebilirsin";

        System.out.print(message);
    }
}

 /*  if( heat<5){
            System.out.print("Kayak yapabilirsin");
        } else if (heat>=5 && heat<15) {
            System.out.print("Sinemaya Gidebilirsin");
        } else if (heat >= 15 && heat>25) {
            System.out.print("Piknige gidebilirsin ");
        }else {
            System.out.print("Yüzmeye gidebilirsin ");
        }

    }  */



