import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * top-down
 */
public class Main {
    private static int[] dp;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        dp = new int [num +1];
        System.out.println(pibonacci(num));
    }

    private static int pibonacci(int num) {
        if (num <= 1) {
            return 1;
        }

        if (dp[num] > 0) {
            return dp[num];
        }

        return dp[num] = (pibonacci(num -1) + pibonacci(num - 2)) % 10007;
    }
}

/**
 * bottom-up
 *
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] dp = new int [num +1];
        dp[0] = dp[1] = 1;

        for (int i = 2; i <= num; i ++) {
            dp[i] = (dp[i -1] + dp[i - 2]) % 10007;
        }

        System.out.println(dp[num]);
    }
}
*/
