package KontrolYapilari;

public class SwitchCaseKullanimi {
    static void main() {
        int haftaninKacinciGun = 4;
        if (haftaninKacinciGun == 1){
            System.out.println("Pazartesi");
        }else if (haftaninKacinciGun == 2){
            System.out.println("Salı");
        }else if (haftaninKacinciGun == 3){
            System.out.println("Çarşamba");
        }else if (haftaninKacinciGun == 4){
            System.out.println("Perşembe");
        }else if (haftaninKacinciGun == 5){
            System.out.println("Cuma");
        }
        //switch case yapısı
        switch (haftaninKacinciGun) {
            case 1: System.out.println("Switch Pazartesi"); break; //break programda işlem bittikten sonra programı kapatır.
            case 2: System.out.println("Switch Salı"); break;
            case 3: System.out.println("Switch Çarşamba"); break;
            case 4: System.out.println("Switch Perşembe"); break;
            case 5: System.out.println("Switch Cuma"); break;
            default: System.out.println("Yanlış gün değeri veya sayı girdiniz!"); //default varsa program en son buna bakar ve programı kapatır.
        }
        System.out.println("Program sonlandırıldı");
    }
}