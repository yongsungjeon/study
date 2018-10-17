import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        int[] count = new int[10001];
        while(num-- > 0) {
            count[Integer.parseInt(br.readLine())]++;
        }

        for(int i = 1; i < 10001; i++) {
            if (count[i] > 0) {
                for (int j = 0; j < count[i]; j++) {
                    bw.write(i + "\n");
                }
            }
        }

        br.close();
        bw.close();
    }
}
