import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int start = Integer.parseInt(line[0]);
        int end = Integer.parseInt(line[1]);
        boolean[] checkedArr = new boolean[end + 1];
        checkedArr[0] = checkedArr[1] = true;

        for (int i = 2; i * i <= end; i++) {
            if (checkedArr[i]) {
                continue;
            }

            for (int j = i + i; j <= end; j+=i) {
                checkedArr[j] = true;
            }
        }

        for (int i = start; i <= end; i++) {
            if (!checkedArr[i]) {
                System.out.println(i);
            }
        }
    }
}