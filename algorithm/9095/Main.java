import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * top-down
 */
public class Main {
    private static int[] dp = new int [11];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        StringBuilder sb = new StringBuilder();
        while(count-- > 0) {
            int num = Integer.parseInt(br.readLine());
            sb.append(pibonacci(num) + "\n");
        }

        System.out.println(sb);
    }

    private static int pibonacci(int num) {
        if (dp[num] > 0) {
            return dp[num];
        }
        return dp[num] = pibonacci(num - 1) + pibonacci(num - 2) + pibonacci(num - 3);
    }
}

/**
 * bottom-up
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int[] dp = new int [11];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        StringBuilder sb = new StringBuilder();
        while(count-- > 0) {

            int num = Integer.parseInt(br.readLine());
            for (int i = 4; i <= num; i++) {
                if (dp[i] > 0) {
                    continue;
                }
                dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
            }

            sb.append(dp[num] + "\n");
        }

        System.out.println(sb);
    }
}