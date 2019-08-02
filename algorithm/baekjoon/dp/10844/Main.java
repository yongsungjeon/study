import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * top-down
 */
public class Main {
    private static long[][] dp;
    private static int mod = 1000000000;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        long sum = 0;
        dp = new long[num + 1][10];

        for (int i = 1; i < 10; i++) {
            sum += pibonacci(num, i);
        }

        System.out.println(sum % mod);
    }

    private static long pibonacci(int num, int digit) {
        if (num == 1) {
            return 1;
        }

        if (dp[num][digit] > 0) {
            return dp[num][digit];
        }

        if (digit == 0) {
            dp[num][digit] = pibonacci(num - 1, digit + 1) % mod;
        } else if (digit == 9) {
            dp[num][digit] = pibonacci(num - 1, digit - 1) % mod;
        } else {
            dp[num][digit] = (pibonacci(num - 1, digit - 1) + pibonacci(num - 1, digit + 1)) % mod;
        }

        return dp[num][digit];
    }
}

/**
 * bottom-up
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int mod = 1000000000;
        long sum = 0;
        long[][] dp = new long[num + 1][10];

        for (int i = 1; i < 10; i++) {
            dp[1][i] = 1;
        }

        for (int i = 2; i <= num; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 0) {
                    dp[i][j] = dp[i - 1][j + 1] % mod;
                } else if (j == 9) {
                    dp[i][j] = dp[i - 1][j - 1] % mod;
                } else {
                    dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j + 1]) % mod;
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            sum += dp[num][i];
        }

        System.out.println(sum % mod);
    }
}