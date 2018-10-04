import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * bottom-up
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int length;
        int[][] a;
        int[][] d;
        String[] array;

        while(num-- > 0) {
            length = Integer.parseInt(br.readLine());
            a = new int[length + 1][2];
            d = new int[length + 1][3];

            array = br.readLine().split(" ");
            for (int i = 0; i < array.length; i++) {
                a[i + 1][0] = Integer.parseInt(array[i]);
            }

            array = br.readLine().split(" ");
            for (int i = 0; i < array.length; i++) {
                a[i + 1][1] = Integer.parseInt(array[i]);
            }

            for (int i = 1; i <= array.length; i++) {
                d[i][0] = Math.max(d[i - 1][0], Math.max(d[i - 1][1], d[i - 1][2]));
                d[i][1] = Math.max(d[i - 1][0], d[i - 1][2]) + a[i][0];
                d[i][2] = Math.max(d[i - 1][0], d[i - 1][1]) + a[i][1];
            }

            System.out.println(Math.max(d[length][0], Math.max(d[length][1], d[length][2])));
        }
    }
}