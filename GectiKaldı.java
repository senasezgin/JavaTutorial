import java.util.Scanner;

public class GectiKaldı {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih;
        int ders=0, toplam=0 ;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Matematik notunu gir: ");
        mat = scanner.nextInt();
        if(mat >= 0 && mat <= 100){
            toplam += mat;
            ders++;
        }



        System.out.println("Fizik notunu gir: ");
        fizik = scanner.nextInt();
        if(fizik >= 0 && fizik <= 100){
            toplam += fizik;
            ders++;
        }


        System.out.println("kimya notunu gir: ");
        kimya = scanner.nextInt();
        if(kimya >= 0 && kimya <= 100){
            toplam += kimya;
            ders++;
        }


        System.out.println("tukce notunu gir: ");
        turkce = scanner.nextInt();
        if(turkce >= 0 && turkce <= 100){
            toplam += turkce;
            ders++;
        }


        System.out.println("tarih notunun gir: ");
        tarih = scanner.nextInt();
        if(tarih >= 0 && tarih <= 100){
            toplam += tarih;
            ders++;
        }


        double sonuc = toplam / ders;
        System.out.println("Ortalama: " + sonuc);

        if (sonuc <= 55) {
            System.out.print("Sınıfta kaldınız");
        } else {
            System.out.print("Geçtiniz");
        }

    }
}
