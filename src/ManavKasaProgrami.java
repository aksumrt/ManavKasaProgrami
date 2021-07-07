import java.util.Scanner;

public class ManavKasaProgrami {

    public static void main(String[] args) {
        double armut = 2.14 , elma = 3.67 , domates = 1.11 , muz = 0.95 , patlican = 5.0 , toplamTutar;
        int armutkg , elmakg , domateskg , muzkg , patlicankg;


        Scanner inp = new Scanner(System.in);

        System.out.println("Armut Kilo :");
        armutkg = inp.nextInt();

        System.out.println("Elma Kilo :");
        elmakg = inp.nextInt();

        System.out.println("Domates Kilo :");
        domateskg = inp.nextInt();

        System.out.println("Muz Kilo :");
        muzkg = inp.nextInt();

        System.out.println("Patlıcan Kilo :");
        patlicankg = inp.nextInt();

        toplamTutar = armut * armutkg + elma * elmakg +domates * domateskg + muz *muzkg + patlican * patlicankg;

        System.out.println("Toplam Tutar : " + toplamTutar);
    }
}
