public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 0;
        while (a < 4000000 && b < 4000000 && c < 4000000) {


            a = c + b;
            b = a + c;
            c = a + b;
            if (a % 2 == 0) {
                d = d + a;
            }
            if (b % 2 == 0) {
                d = d + b;
            }
            if (c % 2 == 0) {
                d = d + c;
            }
        }
        System.out.println(d);
    }
}
