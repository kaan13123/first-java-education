package operatorlar;

public class IslemOnceligi {
    static void main() {
        /*
        1. () Önce parantez içi hesaplanır.
        2. ++ ve -- (eğer değişkenden önce ise).
        3. çarpma ve bölme.
        4. toplama ve çıkarma.
        5. = atama işlemi.
        6. ++ ve -- (eğer değişkenden sonra ise).
        */

        int sayi1 = 15;
        int sayi2 = 5;
        int sonuc = 0;
        sonuc = (sayi1 + sayi2 * 2 - sayi2) + sayi2 - sayi1 * 4 + sayi1;
        System.out.println("Sonuç1: " + sonuc);
        sonuc = (sayi1 * sayi2 + 4 / 2) + sayi1++ * sayi2 + sayi1;
        System.out.println("Sonuç2: " + sonuc);
    }
}
