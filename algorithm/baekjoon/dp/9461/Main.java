import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * bottom-up
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int num;
        long d[] = new long[101];

        d[1] = 1;
        d[2] = 1;
        d[3] = 1;
        d[4] = 2;
        d[5] = 2;
        d[6] = 3;
        d[7] = 4;
        d[8] = 5;
        d[9] = 7;
        d[10] = 9;

        for (int i = 11; i < 101; i++) {
            d[i] = d[i - 1] + d[i - 5];
        }

        while(t-- > 0) {
            num = Integer.parseInt(br.readLine());
            System.out.println(d[num]);
        }
    }
}