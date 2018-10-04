import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int d[] = new int[num + 1], p[] = new int[num +1];
        for (int i = 1; i <= num; i++) {
            p[i] = sc.nextInt();
        }

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                d[i] = Math.max(d[i], d[i-j] + p[j]);
            }
        }

        System.out.println(d[num]);
    }
}