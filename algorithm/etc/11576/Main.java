import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] arr = line.split(" ");
        int before = Integer.parseInt(arr[0]);
        int after = Integer.parseInt(arr[1]);
        int num = Integer.parseInt(br.readLine());
        int answer = 0;
        arr = br.readLine().split(" ");

        for (int i = 0; i < num; i++) {
            answer = answer * before + Integer.parseInt(arr[i]);
        }

        convert(answer, after);
        System.out.println();
    }

    public static void convert(int num, int base) {
        if (num == 0) {
            return;
        }
        convert(num / base, base);
        System.out.print(num % base + " ");
    }
}