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
        int[] a = new int[num];
        int[] d1 = new int[num];
        int[] d2 = new int[num];
        int max;

        String[] array = br.readLine().split(" ");

        for (int i = 0; i < num; i++) {
            a[i] = Integer.parseInt(array[i]);
        }

        for (int i = 0; i < num; i++) {
            d1[i] = 1;

            for (int j = 0; j < i; j++) {
                if (a[j] < a[i] && d1[i] < d1[j] + 1) {
                    d1[i] = d1[j] + 1;
                }
            }
        }

        for (int i = num - 1; i >= 0; i--) {
            d2[i] = 1;

            for (int j = i + 1; j < num; j++) {
                if (a[i] > a[j] && d2[i] < d2[j] + 1) {
                    d2[i] = d2[j] + 1;
                }
            }
        }

        max = d1[0] + d2[0] - 1;
        for (int i = 0; i < num; i++) {
            if (max < d1[i] + d2[i] - 1) {
                max = d1[i] + d2[i] - 1;
            }
        }

        System.out.println(max);
    }
}