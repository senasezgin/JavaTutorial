import java.util.Scanner;

public class NotOrtalama {
    public static void main (String[] args){
        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Matematik notunu gir: ");
        mat = scanner.nextInt();


        System.out.println("Fizik notunu gir: ");
        fizik = scanner.nextInt();


        System.out.println("kimya notunu gir: ");
        kimya = scanner.nextInt();


        System.out.println("tukce notunu gir: ");
        turkce  = scanner.nextInt();


        System.out.println("tarih notunun gir: ");
        tarih= scanner.nextInt();


        System.out.println("Muzik notunu gir: ");
        muzik = scanner.nextInt();

        int toplam = (mat + fizik + kimya + tarih + turkce + muzik );
        double sonuc = toplam / 6.0;
        System.out.println("Ortalama: " + sonuc);



        boolean noldu = sonuc >= 60;

        String ders = noldu ? "Geçdti5" : "Kaldı";
        System.out.println(ders);






    }

}
