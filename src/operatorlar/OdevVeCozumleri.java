package operatorlar;

public class OdevVeCozumleri {
    static void main() {
        //ÖDEV 1 ÇÖZÜMÜ
        int saniye = 4283;
        int dakika = saniye / 60;
        int kalanSaniye = saniye % 60;
        System.out.println("Girdiğiniz: " + saniye + " saniye = " + dakika + " dakika ve " + kalanSaniye + " saniyeye eşittir.");

        //ÖDEV 2 ÇÖZÜMÜ
        // celcius = 5/9 * (fahrenheit -32)
        double fahrenheit = 100;
        double celcius = ((5/9d) * (fahrenheit -32));
        System.out.println("Girilen " + fahrenheit + " Fahrenheit = " + celcius + "Celciustur.");

        //ÖDEV 3 ÇÖZÜMÜ
        int yil = 4100;
        boolean artikYilMi = (yil % 400 == 0) || (yil % 4 == 0 && yil % 100 != 0) ;
        System.out.println("Girilen " + yil + " Yılı artık yıldır: " + artikYilMi);
    }
}
