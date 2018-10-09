import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int a[] = new int[arr.length];

        for (int i = 0; i < arr.length; i ++) {
            a[i] = Integer.parseInt(arr[i]);
        }

        System.out.println((a[0] + a[1]) % a[2]);
        System.out.println((a[0] % a[2] + a[1] % a[2]) % a[2]);
        System.out.println(a[0] * a[1] % a[2]);
        System.out.println(a[0] % a[2] * a[1] % a[2] % a[2]);
    }
}