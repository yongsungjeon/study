import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    private static boolean[] visit;
    private static int [][] val;
    private static int start, count, size;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String[] line;

        while (num-- > 0) {
            size = Integer.parseInt(br.readLine());
            line = br.readLine().split(" ");

            visit = new boolean[size + 1];
            val = new int[size + 1][size + 1];
            count = 0;

            for (int i = 1; i <= size; i++) {
                val[i][Integer.parseInt(line[i - 1])] = 1;
            }

            for (int i = 1; i <= size; i++) {
                start = i;

                for (int j = 1; j <= size; j++) {
                    if (isValid(i, j)) {
                        dfs(j);
                    }
                }
            }

            System.out.println(count);
        }
    }

    private static void dfs(int num) {
        visit[num] = true;

        if (num == start) {
            count++;
            return;
        }

        for (int i = 1; i <= size; i++) {
            if (isValid(num, i)) {
                visit[i] = true;
                dfs(i);
            }
        }
    }

    private static boolean isValid(int a, int b) {
        return !visit[b] && val[a][b] == 1;
    }
}