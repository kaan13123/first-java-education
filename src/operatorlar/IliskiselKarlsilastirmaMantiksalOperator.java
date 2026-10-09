package operatorlar;

import java.util.logging.SocketHandler;

public class IliskiselKarlsilastirmaMantiksalOperator {
    static void main() {
        int sayi1 = 12;
        int sayi2 = 11;
        System.out.println("Sayı1 eşit mi sayı2: " + (sayi1 == sayi2));
        System.out.println("Sayı1 küçük mü sayı2: " + (sayi1 < sayi2));
        System.out.println("Sayı1 büyük mü sayı2: " + (sayi1 > sayi2));
        System.out.println("Sayı1 küçük eşit mi sayı2: " + (sayi1 <= sayi2));
        System.out.println("Sayı1 büyük eşit mi sayı2: " + (sayi1 >= sayi2));
        System.out.println("Sayı1 eşit değil mi sayı2: " + (sayi1 != sayi2));

        if (sayi1 < sayi2) {
            System.out.println("Sayi1 sayi2 den küçüktür");
        }else {
            System.out.println("Sayi1 sayi2 den büyüktür");
        }
        boolean deger1 = true;
        boolean deger2 = false;
        System.out.println("Değer 1 ve değer2 and (ve) durumu: " + (deger1 && deger2));
        System.out.println("Değer 1 ve değer2 or (veya) durumu: " + (deger1 || deger2));

        int benimYasim = 30;
        int onunYasi = 25;
        if (benimYasim < 40 && onunYasi > 20) {
            System.out.println("Birinci ifade çalıştı.");
        }
            if (benimYasim < 25 || onunYasi > 25) {  //iki taraftada false sonuç verdiği için çalışmayacaktır.
                System.out.println("İkinci ifade çalıştı.");
        }else {
                System.out.println("İkinci ifadenin else kısmı çalıştı.");
            }
    }
}
