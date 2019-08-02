import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int length = line.length();
        int remaining = length % 3;

        if (remaining == 1) {
            System.out.print(line.charAt(0));
        } else if (remaining == 2) {
            System.out.print((line.charAt(0) - '0') * 2 + (line.charAt(1) - '0'));
        }

        for (int i = remaining; i < length; i += 3) {
            System.out.print((line.charAt(i) - '0') * 4 + (line.charAt(i + 1) - '0') * 2 + (line.charAt(i + 2) - '0'));
        }
    }
}