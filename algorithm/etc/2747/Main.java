import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    private static int[] memo;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        memo = new int[num + 1];
        System.out.println(getPibonacci(num));
    }

    private static int getPibonacci(int num) {
        if (num < 2) {
            return num;
        } else {
            if (memo[num] > 0) {
                return memo[num];
            }

            return memo[num] = getPibonacci(num -1) + getPibonacci(num -2);
        }
    }
}