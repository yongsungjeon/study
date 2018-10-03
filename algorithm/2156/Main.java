import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * bottom-up
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] a = new int[num + 1];
        int[][] d = new int[num + 1][3];

        for (int i = 0; i < num; i++) {
            a[i + 1] = Integer.parseInt(br.readLine());
        }

        for (int i = 1; i <= num; i++) {
            d[i][0] = Math.max(d[i - 1][0], Math.max(d[i - 1][1], d[i - 1][2]));
            d[i][1] = d[i - 1][0] + a[i];
            d[i][2] = d[i - 1][1] + a[i];
        }

        System.out.println(Math.max(d[num][0], Math.max(d[num][1], d[num][2])));
    }
}