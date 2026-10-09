package operatorlar;

public class AritmatikOperatorlar {
    static void main() {
        int sayi1 = 60;
        int sayi2 = 40;
        System.out.println("Sayı1: " + sayi1 + " Sayi2: " + sayi2 + " Toplamları: " + (sayi1 + sayi2));
        System.out.println("Sayı1: " + sayi1 + " Sayi2: " + sayi2 + " Çarpımları: " + (sayi1 * sayi2));
        System.out.println("Sayı1: " + sayi1 + " Sayi2: " + sayi2 + " Farkları: " + (sayi2 - sayi1));
        System.out.println("Sayı1: " + sayi1 + " Sayi2: " + sayi2 + " Bölümleri: " + ((double)sayi1 / sayi2));
        System.out.println("Sayı1: " + sayi1 + " Sayi2: " + sayi2 + " Modu: " + ((double)sayi1 % sayi2));
    }
}
