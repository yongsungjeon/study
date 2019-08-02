import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        Stack stack = new Stack();
        String str;

        for (int i = 0; i < num; i++) {
            str = br.readLine();
            if (str.contains("push")) {
                stack.push(Integer.valueOf(str.split(" ")[1]));
            } else if (str.contains("pop")) {
                System.out.println(stack.isEmpty() ? -1 : stack.pop());
            } else if (str.contains("size")) {
                System.out.println(stack.size());
            } else if (str.contains("empty")) {
                System.out.println(stack.isEmpty() ? 1 : 0);
            } else if (str.contains("top")) {
                System.out.println(stack.isEmpty() ? -1 : stack.lastElement());
            }
        }
    }
}