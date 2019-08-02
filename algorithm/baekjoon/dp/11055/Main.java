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

        for (int i = 0; i < num; i++) {
            d[i] = a[i];

            for (int j = 0; j < i; j++) {
                if (a[j] < a[i] && d[i] < d[j] + a[i]) {
                    d[i] = d[j] + a[i];
                }
            }

            if (max < d[i]) {
                max = d[i];
            }
        }

        System.out.println(max);
    }
}