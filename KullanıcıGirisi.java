package JavaTutorial;

import java.util.Scanner;

public class KullanıcıGirisi {
    public static void main(String[] args){
        String userName, password, newPassword;

        Scanner inp = new Scanner(System.in);

        System.out.print("Ad giriniz ");
        userName = inp.nextLine();

        System.out.print("Şifre giriniz ");
        password = inp.nextLine();

        if(userName.equals("patika") && password.equals("java123")){
            System.out.print("Giriş yaptınız");
        }else if (userName.equals("patika") && !password.equals("Java123")){
            System.out.print("sifre yanlış");

            boolean flag = true;
            while(flag) {


                System.out.print("İşlem Seçiniz\n" + "1-Şifrenizi Değiştirme\n" + "2-Çıkış\n");
                int islem = inp.nextInt();
                switch(islem) {
                    case 1:
                        System.out.print("Yeni şifrenizi giriniz: ");
                        newPassword = inp.next();
                        if(newPassword.equals(password)) {
                            System.out.print("Şifreniz eski şifrenizle aynı olamaz\n");
                            break;
                        }
                        System.out.print("Şifreniz değiştirildi,hayırlı uğurlu olsun");
                        password = password;
                        flag = false;
                        break;
                    case 2:
                        System.out.print("Çıkış yapılıyor");
                        flag = false;
                        break;
                    default:
                        System.out.print("Geçersiz işlem");
                        break;
                }

            }

        }





    }

        }
