import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        String num = arr[0];
        int notation = Integer.parseInt(arr[1]);
        int answer = 0;

        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);

            if ('0' <= c && c <= '9') {
                answer = answer * notation + (c - '0');
            } else {
                answer = answer * notation + (c - 'A' + 10);
            }
        }

        System.out.println(answer);
    }
}