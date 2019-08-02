import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * top-down
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    private static int[] dp;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        dp = new int [num +1];

        System.out.println(pibonacci(num));
    }

    private static int pibonacci(int num) {
        if (num == 1) {
            return 0;
        }

        if (dp[num] > 0) {
            return dp[num];
        }

        dp[num] = pibonacci(num - 1) + 1;

        if (num % 3 == 0) {
            dp[num] = Math.min(dp[num], pibonacci(num / 3) + 1);
        }

        if (num % 2 == 0) {
            dp[num] = Math.min(dp[num], pibonacci(num / 2) + 1);
        }

        return dp[num];
    }
}

/**
 * bottom-up
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int dp[] = new int[num + 1];

        for(int i = 2; i <= num; i++) {
            dp[i] = dp[i - 1] + 1;

            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i / 3] + 1, dp[i]);
            }

            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i / 2] + 1, dp[i]);
            }
        }

        System.out.println(dp[num]);
    }
}