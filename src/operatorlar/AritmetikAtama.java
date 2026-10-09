package operatorlar;

public class AritmetikAtama {
    static void main() {
        int sayi1 = 10;
        int sayi2 = 20;
        int sonuc = 0;

        sonuc += sayi1; //sonuc = sonuc + sayi1; sonuc = 10 olacak
        System.out.println("Sonuç: " + sonuc);

        sonuc -= sayi2; //sonuc = sonuc - sayi2; sonuc = -10 olacak
        System.out.println("Sonuç: " + sonuc);

        sonuc *= sayi1; //sonuc = sonuc * sayi1; sonuc = -100 olacak
        System.out.println("Sonuç: " + sonuc);

        sonuc /= sayi2; //sonuc = sonuc / sayi2; sonuc = -5 olacak
        System.out.println("Sonuç: " + sonuc);

        sonuc %= sayi1; //sonuc = sonuc % sayi1; sonuc = -5 olacak
        System.out.println("Sonuç: " + sonuc);

        //ÖDEV ÇÖZÜMÜ
        double ondalikliSayi = 6.50;
        double odevSonucu = 0;

        odevSonucu++;
        ondalikliSayi *= odevSonucu;
        System.out.println("Ödev Sonucu: " + ondalikliSayi);

        //ÖDEV 2 ÇÖZÜMÜ
        int s1 = 10;
        int s2 = 6;
        s1++;
        --s2;
        s1 *= --s2;
        System.out.println("S1in son değeri: " + s1);
        System.out.println("S2in son değeri: " + s2);
    }
}
