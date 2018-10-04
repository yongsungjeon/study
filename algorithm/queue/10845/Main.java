import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> queue = new LinkedList<>();
        int num = Integer.parseInt(br.readLine());

        while (num-- > 0) {
            String line = br.readLine();
            if (line.contains("push")) {
                String[] split = line.split(" ");
                queue.add(Integer.valueOf(split[1]));
            } else if (line.equals("pop")) {
                System.out.println(queue.isEmpty() ? -1 : queue.poll());
            } else if (line.equals("size")) {
                System.out.println(queue.size());
            } else if (line.equals("empty")) {
                System.out.println(queue.isEmpty() ? 1 : 0);
            } else if (line.equals("front")) {
                System.out.println(queue.isEmpty() ? -1 : queue.peek());
            } else if (line.equals("back")) {
                System.out.println(queue.isEmpty() ? -1 : (Integer)((LinkedList<Integer>) queue).getLast());
            }
        }
    }
}