import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * top-down Runtime Error
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] a = new int[num + 1];
        int[] d = new int[num + 1];

        for (int i = 0; i < num; i++) {
            a[i + 1] = Integer.parseInt(br.readLine());
        }

        d[1] = a[1];
        d[2] = a[1] + a[2];

        for (int i = 3; i <= num; i++) {
            d[i] = d[i - 1];
            if (d[i] < d[i - 2] + a[i]) {
                d[i] = d[i - 2] + a[i];
            }

            if (d[i] < d[i - 3] + a[i] + a[i - 1]) {
                d[i] = d[i - 3] + a[i] + a[i - 1];
            }
        }

        System.out.println(d[num]);
    }
}

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