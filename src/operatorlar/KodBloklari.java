package operatorlar;

public class KodBloklari {
    static void main() {
        int seviye1Blok1 = 1;
        {
            System.out.println(seviye1Blok1);
            int seviye2Blok1 = 21;
            {
                System.out.println(seviye1Blok1);
                System.out.println(seviye2Blok1);

                //System.out.println(seviye3Blok1); Tanımından önce yazmak hata verir.
                int seviye3Blok1 = 31;
                {
                    System.out.println(seviye1Blok1);
                    System.out.println(seviye2Blok1);
                    System.out.println(seviye3Blok1);
                }
            }
        }
        int seviye1Blok2 = 12;
        {
            System.out.println(seviye1Blok1);
            System.out.println(seviye1Blok2);
        }
    }
}
