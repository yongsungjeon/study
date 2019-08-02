import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        System.out.println(getPibonacci(num));
    }

    private static int getPibonacci(int num) {
        if (num < 2) {
            return num;
        } else {
            return getPibonacci(num -1) + getPibonacci(num -2);
        }
    }
}