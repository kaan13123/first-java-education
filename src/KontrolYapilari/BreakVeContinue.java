package KontrolYapilari;

public class BreakVeContinue {
    static void main() {
        for (int i =0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println("İ'nin değeri: " + i);
        }
        for (int a=0; a < 5; a++) {
            for (int b = 0; b < 3; b++) {
                System.out.println("A: " + a + " B: " + b);
                if (a==1 && b==2) {
                    break;
                }
            }
        }
    }
}