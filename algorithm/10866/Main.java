import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> deque = new LinkedList<>();
        int num = Integer.parseInt(br.readLine());

        while (num-- > 0) {
            String line = br.readLine();
            String[] split = line.split(" ");

            switch (split[0]) {
                case "push_front":
                    deque.addFirst(Integer.valueOf(split[1]));
                    break;
                case "push_back":
                    deque.addLast(Integer.valueOf(split[1]));
                    break;
                case "pop_front":
                    System.out.println(deque.isEmpty() ? "-1" : deque.pollFirst());
                    break;
                case "pop_back":
                    System.out.println(deque.isEmpty() ? "-1" : deque.pollLast());
                    break;
                case "size":
                    System.out.println(deque.size());
                    break;
                case "empty":
                    System.out.println(deque.isEmpty() ? "1" : "0");
                    break;
                case "front":
                    System.out.println(deque.isEmpty() ? "-1" : deque.peekFirst());
                    break;
                case "back":
                    System.out.println(deque.isEmpty() ? "-1" : deque.peekLast());
                    break;
            }
        }
    }
}