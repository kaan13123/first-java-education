package degisken_Kavrami;

public class OdevCozumleri {
    static void main() {
        //ÖDEV 1 ÇÖZÜMÜ
        String stringDegiskeni = "150"; //Metinsel ifade yazarsak program hata vericektir.
        int integerDegiskeni = Integer.parseInt(stringDegiskeni);
        int integerDegiskeni2 = Integer.valueOf(stringDegiskeni);
        System.out.println("İnteger değişkeni 1: " + integerDegiskeni);
        System.out.println("İnteger değişkeni 2: " + integerDegiskeni2);

        stringDegiskeni = String.valueOf(integerDegiskeni);
        System.out.println("String değişkeninin son değeri: " + stringDegiskeni);

        System.out.println("*************************************************************************************");
        //ÖDEV 2 ÇÖZÜMÜ
        int sayi1 = 5 / 3;
        float sayi2 = 5f / 3f; //float virgülden sonra 7 karaktere kadar sakladı.
        double sayi3 = 5d / 3d;
        System.out.println("Sayi1: " + sayi1);
        System.out.println("Sayi2: " + sayi2);
        System.out.println("Sayi3: " + sayi3);

        System.out.println("*************************************************************************************");
        //ÖDEV 3 ÇÖZÜMÜ
        System.out.println(1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1); //0.5 değerini görmeyi bekleriz.
        System.out.println(1.0 - 0.9); //0.1 değerini görmeyi bekleriz. 0.100000000000000

        System.out.println("*************************************************************************************");
        //ÖDEV 4 ÇÖZÜMÜ
        int s1 = 1;
        int s2 = 2;

        double ortalama = (double) (s1 + s2) /2;
        System.out.println("Ortalama1: " + ortalama);

        double ortalama2 = (s1 + s2) /2.0;
        System.out.println("Ortalama2: " + ortalama2);
    }
}
