import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int a, b;
        for (int i = 1; i <= t; i++) {
            a = scan.nextInt();
            b = scan.nextInt();
            System.out.printf("Case #%d: %d + %d = %d\n", i, a, b, a + b);
        }
    }
}