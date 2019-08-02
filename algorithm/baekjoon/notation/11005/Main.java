import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int num = Integer.parseInt(arr[0]);
        int notation = Integer.parseInt(arr[1]);
        StringBuilder answer = new StringBuilder();

        while (num > 0) {
            int remaining = (num % notation);
            if (remaining < 10) {
                answer.append(remaining);
            } else {
                answer.append((char)(remaining  + 'A' - 10));
            }

            num /= notation;
        }

        System.out.println(answer.reverse());
    }
}