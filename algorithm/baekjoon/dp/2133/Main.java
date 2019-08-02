import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * top-down
 */


/**
 * bottom-up
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int mod = 10007;
        long sum = 0;
        long[][] dp = new long[num + 1][10];

        for (int i = 0; i < 10; i++) {
            dp[1][i] = 1;
        }

        for (int i = 2; i <= num; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k <= j; k++) {
                    dp[i][j] += dp[i - 1][k];
                }

                dp[i][j] %= mod;
            }
        }

        for (int i = 0; i < 10; i++) {
            sum += dp[num][i];
        }

        System.out.println(sum % mod);
    }
}