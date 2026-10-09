package KontrolYapilari;

public class IfElseKullanimi {
    static void main() {
        int benimYasim = 30;
        int onunYasi = 30;

        if (benimYasim > onunYasi) {
            System.out.println("Ben senden büyüğüm.");
        } else if (benimYasim < onunYasi) {
            System.out.println("Ben senden küçüğüm.");
        }else {
            System.out.println("İkimizin yaşı eşit.");
        }
        System.out.println("Program Sonlandı.");

        int sayi = 8;
        if (sayi > 5) {
            System.out.println("Sayi 5 ten büyük");
        }
        if (sayi < 10) {
            System.out.println("Sayi 10dan küçük");
            System.out.println("Program Sonlandı");
        }
        int sayi1 = 10, sayi2 = 15;
        if(sayi1 > sayi2)
            if(sayi1 > 0)
                System.out.println("Burası çalıştı");
            else //Süslü parantezlerin olmadığı durumlarda else en yakın if bloğuna aittir.
                System.out.println("Else kısmı çalıştı");

            /*
            boolean sonuc = true;
            if (sonuc == true) {

            }
             */
        int a = 10, b = 6, c = 0;
        if (a > b) {
            c = a - b;
        }else {
            c = a + b;
        }
        System.out.println("C'nin değeri: " + c);
        c = (a > b) ? (a - b) : (a + b);
        System.out.println("C'nin değeri: " + c);
    }
}
