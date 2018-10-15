import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();

        long result = Math.min(two(n) - two(m) - two(n - m), five(n) - five(m) - five(n - m));
        System.out.println(result);
    }

    private static long five(long num) {
        long result = 0;
        for(long i = 5; i <= num; i *= 5) {
            result += num / i;
        }
        return result;
    }

    private static long two(long num) {
        long result = 0;
        for(long i = 2; i <= num; i *= 2) {
            result += num / i;
        }
        return result;
    }
}
