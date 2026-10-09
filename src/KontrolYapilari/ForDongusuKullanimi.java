package KontrolYapilari;

import java.lang.classfile.attribute.SourceDebugExtensionAttribute;

public class ForDongusuKullanimi {
    static void main() {
        //for(ilk atama; dongu calismasinin sarti; her calisma sonrasi ne olacak)
        /*
        for (int i = 0; i < 10; i++) {
            System.out.println("Kaan");
            System.out.println("Java öğreniyorum");
            System.out.println("i'nin Değeri: " + i);
           }*/
        for (int i = 0, j = 0; (i+j < 10); i++, j++) {
            //Çalıştırılacak ifade
        }
        /*
        for (;;) { //İfadesi ile sonsuz döngü oluşturulabilir.
            System.out.println("Kaan");
        } */

        //for döngsünün sonuna noktalı virgül koymayın mantıksal hata verir, program çalışır.
        for (int i = 0, j = 0; (i+j < 10); i++, j++); {
            for (int i = 0, j = 0; (i+j < 10); i++, j++);{
                System.out.println("Kaan");
            }
            System.out.println("Kaan");
        }
    }
}

