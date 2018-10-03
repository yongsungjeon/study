import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> oldQueue = new LinkedList<>(), newQueue = new LinkedList<>();
        String line = br.readLine();
        String[] split = line.split(" ");
        int num = Integer.parseInt(split[0]);

        for (int i = 1; i <= num; i++) {
            oldQueue.add(i);
        }

        int splitNum = Integer.parseInt(split[1]);
        int count = 1;
        while (!oldQueue.isEmpty()) {
            if (count % splitNum == 0) {
                newQueue.add(oldQueue.poll());
            } else {
                oldQueue.add(oldQueue.poll());
            }
            count++;
        }

        StringBuilder sb = new StringBuilder();
        while (!newQueue.isEmpty()) {
            sb.append(newQueue.poll());
            if (newQueue.size() != 0) {
                sb.append(", ");
            }
        }

        System.out.println("<" + sb + ">");
    }
}