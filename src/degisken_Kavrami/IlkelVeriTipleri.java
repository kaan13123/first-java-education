package degisken_Kavrami;

public class IlkelVeriTipleri {
    static void main() {
        int integerDegiskeniminDegeri = 10;
        double doubleDegiskeniminDegeri = 10.50;
        short veriTipi = 32767; //32678 yaparsak program hata verecektir.

        //Aşağıdaki ifadeler tamsayi veri türlerinin özelliklerini yazdırır.
        System.out.println("BYTE en küçük değeri: " + Byte.MIN_VALUE + " BYTE en büyük değeri: " + Byte.MAX_VALUE + " it değeri: " + Byte.SIZE);
        System.out.println("SHORT en küçük değeri: " + Short.MIN_VALUE + " SHORT en büyük değeri: " + Short.MAX_VALUE + " Bit değeri: " + Short.SIZE);
        System.out.println("INTEGER en küçük değeri: " + Integer.MIN_VALUE + " INTEGER en büyük değeri: " + Integer.MAX_VALUE + " Bit değeri: " + Integer.SIZE);
        System.out.println("LONG en küçük değeri: " + Long.MIN_VALUE + " LONG en büyük değeri: " + Long.MAX_VALUE + " Bit değeri: " + Long.SIZE);

        //Aşağıdaki ifadeler ondalıklı veri türlerinin özelliklerini yazdırır.
        System.out.println("FLOAT en küçük değeri: " + Float.MIN_VALUE + " FLOAT en büyük değeri: " + Float.MAX_VALUE + " Bit değeri: " + Float.SIZE);
        System.out.println("DOUBLE en küçük değeri: " + Double.MIN_VALUE + " DOUBLE en büyük değeri: " + Double.MAX_VALUE + " Bit değeri: " + Double.SIZE);

        //char
        char harf = 'a';
        System.out.println("Harf: " + harf);

        int integerDeger = 'B';
        System.out.println("İnteger değer: " + integerDeger);

        //boolean
        boolean sonuc = true;
        System.out.println("Boolean sonuç değişkeninin değeri: " + sonuc);
        sonuc = false;
        System.out.println("Boolean sonuç değişkeninin değeri: " + sonuc);

        boolean sonuc2 = false;
        System.out.println("Boolean sonuç2 değişkeninin değeri: " + sonuc2);
    }
}
