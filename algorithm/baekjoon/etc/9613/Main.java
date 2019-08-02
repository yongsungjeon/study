import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String[] line;
        int[] arr;
        int length;
        long g;

        while (num-- > 0) {
            line = br.readLine().split(" ");
            length = Integer.parseInt(line[0]);
            arr = new int[length];

            for (int i = 0; i < length; i++) {
                arr[i] = Integer.parseInt(line[i + 1]);
            }

            g = 0;

            for (int i = 0; i < length - 1; i++) {
                for (int j = i + 1; j < length; j++) {
                    g += gcd(arr[i], arr[j]);
                }
            }

            System.out.println(g);
        }
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}