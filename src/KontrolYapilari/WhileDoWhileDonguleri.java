package KontrolYapilari;

public class WhileDoWhileDonguleri {
    static void main() {
        int sayi = 10;
        while (sayi <= 20) { //sayi < 20 Bu ifade true olduğu sürece çalışır.
            System.out.println("Merhaba sayı: " + sayi);
            sayi++;
        }
        for (int i = 10; i <= 20; i++) {
            System.out.println("Merhaba for döngüsü: " + i);
        }
        int s1 = 0;
        do {
            System.out.println("Hello s1: " + s1);
            s1++;
        }while (s1 < 5);
    }
}
