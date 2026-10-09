package operatorlar;

public class ArttirmaAzaltma {
    static void main() {
        int sayi1 = 10;
        int sayi2 = ++sayi1;
        int sayi3 = sayi1--;
        System.out.println("Sonuç: " + ((sayi1) + (--sayi2) + (sayi3++)));

        System.out.println("Kaan " + "Ayaz");
        System.out.println((sayi1 + sayi2));
        System.out.println("Kaan" + (sayi1 + sayi2));
        //sayi1++ ==> sayi1 = sayi1 + 1;
        //sayi2-- ==> sayi2 = sayi2 - 1;
    }
}
