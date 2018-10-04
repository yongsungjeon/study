import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String initStr = br.readLine();
        Stack<Character> left = new Stack<>(), right  = new Stack<>();

        for (int i = 0; i < initStr.length(); i++) {
            left.push(initStr.charAt(i));
        }

        int num = Integer.parseInt(br.readLine());
        while (num-- > 0) {
            String line = br.readLine();

            if (line.equals("L")) {
                if (!left.empty()) {
                    right.push(left.pop());
                }
            } else if (line.equals("D")) {
                if (!right.empty()) {
                    left.push(right.pop());
                }
            } else if (line.equals("B")) {
                if (!left.empty()) {
                    left.pop();
                }
            } else {
                left.push(line.split(" ")[1].charAt(0));
            }
        }

        while(!left.empty()) {
            right.push(left.pop());
        }

        StringBuilder sb = new StringBuilder();
        while(!right.empty()) {
            sb.append(right.pop());
        }

        System.out.println(sb);
    }
}