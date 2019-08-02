import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        Stack<Integer> stack = new Stack<>();
        int sum = 0;

        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == '(') {
                stack.push(i);
            } else {
                if (i - stack.lastElement() == 1) {
                    stack.pop();
                    sum += stack.size();
                } else {
                    stack.pop();
                    sum += 1;
                }
            }
        }

        System.out.println(sum);
    }
}