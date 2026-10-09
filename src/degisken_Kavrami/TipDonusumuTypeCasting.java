package degisken_Kavrami;

public class TipDonusumuTypeCasting {
    static void main() {
        int sayi = 10;
        float noktaliSayi = 130.25f;

        /*
        noktaliSayi = sayi;
        System.out.println("noktalı sayının değeri: " + noktaliSayi); */

        sayi = (int) noktaliSayi;
        System.out.println("Sayi değeri: " + sayi);

        byte byteSayi = 5;
        byteSayi = (byte) noktaliSayi;
        System.out.println("Byte sayının değeri: " + byteSayi);
    }
}
