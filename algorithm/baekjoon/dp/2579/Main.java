import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * top-down - error
 */
public class Main {
    private static int[] a;
    private static int[] d;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        a = new int[num + 1];
        d = new int[num + 1];

        for (int i = 0; i < num; i++) {
            a[i + 1] = Integer.parseInt(br.readLine());
        }

        d[1] = a[1];
        d[2] = Math.max(d[1] + a[2], a[2]);
        d[3] = Math.max(d[1] + a[2], d[2] + a[2]);

        System.out.println(pibonacci(num));
    }

    private static int pibonacci(int num) {
        if (num > 3) {
            d[num] = Math.max(pibonacci(num - 3) + a[num] + a[num - 1], pibonacci(num - 2) + a[num]);
        }

        return d[num];
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
        int[] d = new int[num + 1];

        for (int i = 0; i < num; i++) {
            a[i + 1] = Integer.parseInt(br.readLine());
        }

        d[1] = a[1];
        d[2] = Math.max(d[1] + a[2], a[2]);
        d[3] = Math.max(d[1] + a[2], d[2] + a[2]);

        for (int i = 3; i <= num; i++) {
            d[i] = Math.max(d[i - 3] + a[i] + a[i - 1], d[i - 2] + a[i]);
        }

        System.out.println(d[num]);
    }
}

/**
 * bottom-up 이차원 배열
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

        d[1][1] = a[1];
        d[2][1] = a[2];
        d[2][2] = d[1][1] + a[2];


        for (int i = 2; i <= num; i++) {
            d[i][1] = Math.max(d[i - 2][1], d[i - 2][2]) + a[i];
            d[i][2] = d[i - 1][1] + a[i];
        }

        System.out.println(Math.max(d[num][1], d[num][2]));
    }
}