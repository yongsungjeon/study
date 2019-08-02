import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * top-down
 */
public class Main {

}

/**
 * bottom-up
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] a = new int[num];
        int[] d = new int[num];
        int max = 0;
        String[] array = br.readLine().split(" ");

        for (int i = 0; i < num; i++) {
            a[i] = Integer.parseInt(array[i]);
        }

        d[0] = a[0];
        max = d[0];
        for (int i = 1; i < num; i++) {
            d[i] = Math.max(d[i - 1] + a[i], a[i]);

            if (max < d[i]) {
                max = d[i];
            }
        }

        System.out.println(max);
    }
}