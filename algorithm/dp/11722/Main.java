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
        int[] d = new int[num];
        int min = 0;

        String[] array = br.readLine().split(" ");

        for (int i = 0; i < num; i++) {
            a[i] = Integer.parseInt(array[i]);
        }

        for (int i = 0; i < num; i++) {
            d[i] = 1;

            for (int j = 0; j < i; j++) {
                if (a[j] > a[i] && d[i] < d[j] + 1) {
                    d[i] = d[j] + 1;
                }
            }

            if (min < d[i]) {
                min = d[i];
            }
        }

        System.out.println(min);
    }
}