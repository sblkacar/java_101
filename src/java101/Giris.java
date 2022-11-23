
package java101;

import java.util.Scanner;

public class Giris {
    public static void main(String[] args) {
        int Mat;
        int Kim;
        int Turk;
        int Tar;
        int Muz;
        int sum;
        Scanner yeni = new Scanner(System.in); //veriyi kullanıcıdan al
       // matematik
        System.out.print("Matematik notunu giriniz: ");

        Mat= yeni.nextInt();

        // kimya
        System.out.print("Kimya Notunu Giriniz: ");

        Kim=yeni.nextInt();

        //Türkçe
        System.out.print("Türkçe notunu giriniz: ");

        Turk=yeni.nextInt();
        //Tarih
        System.out.print("Tarin notunu girininz: ");

                Tar=yeni.nextInt();
        //Müzik
        System.out.print("Müzik Notunu Giriniz: ");

        Muz=yeni.nextInt();
        sum=(Mat+Kim+Turk+Tar+Muz)/5;
        System.out.print("ortalamanız: "+ sum);
        // İf-Else olmadan
        String sonuc = sum> 60 ? "Geçtiniz!" : "Kaldınız ! ";
        System.out.println(sonuc);

    }
}
