import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        while (num > 0) {
            String line = br.readLine();
            System.out.println(isValid(line) ? "YES" :"NO");
            num--;
        }
    }

    private static boolean isValid(String line) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < line.length(); i ++) {
            if (line.charAt(i) == '(') {
                stack.push(line.charAt(i));
            } else {
                if (stack.empty()) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }

        return stack.empty();
    }
}