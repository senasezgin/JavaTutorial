package JavaTutorial;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args){
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right =3;
        int balance = 5000;
        int select, islem;

        while (right > 0){
            System.out.print("Kullanıcı adınız: ");
            userName = input.nextLine();
            System.out.print("Parolayı adınız: ");
            password = input.nextLine();
            if (userName.equals("patika")&& password.equals("dev123")){
                do {System.out.print("Merhaba kodluyoruz bankasına hoşgeldinz. Sisteme giriş yapınız. ");
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz. ");
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");

                    switch (islem) {
                        case 1:
                            System.out.print("Yatırılacak Para miktarı: ");
                            int price = input.nextInt();
                            balance += price;
                            System.out.println(price + "tl hesabınıza yatılmıştır");
                            break;
                        case 2:
                            System.out.print("Para miktarı : ");
                            int price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                    }

                } while (islem != 4);
                System.out.println("Para bankasını kullandığınız için teşekkürler.");
                break;
            } else {
                right--;
                System.out.print("Hatalı kullanıcı adı veya sifre. Tekrar deneyiniz");
                if (right==0){
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz  ");

                } else {
                    System.out.println("Kalan hakkınız: "+ right);
                }


            }
        }

    }

}
