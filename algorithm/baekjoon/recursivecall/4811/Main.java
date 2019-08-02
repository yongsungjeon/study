import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static long[][] mem;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number;

        while ((number = Integer.parseInt(br.readLine())) != 0) {
            mem = new long[number + 1][number + 1];
            int w = number - 1;
            int h = 1;
            System.out.println(df(w, h));
        }
    }

    private static long df(int w, int h) {
        if (mem[w][h] != 0) {
            return mem[w][h];
        }

        if (w == 0) {
            mem[w][h] = 1;
            return 1;
        }

        long sum = 0;
        sum += df(w - 1, h + 1);

        if (h != 0) {
            sum += df(w, h - 1);
        }

        mem[w][h] = sum;

        return sum;
    }
}