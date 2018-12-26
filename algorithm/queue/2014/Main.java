import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        long[] prime = new long[k];
        long head = 0;

        PriorityQueue<Long> q = new PriorityQueue<>();

        for (int i = 0; i < k; i++) {
            prime[i] = sc.nextInt();
            q.add(prime[i]);
        }

        for (int i = 0; i < n; i++) {
            head = q.poll();

            for (int j = 0; j < k; j++) {
                q.add(head * prime[j]);

                if (q.contains(head * prime[j])) {
                    break;
                }
            }
        }

        System.out.println(head);
    }
}