import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    private static int s, u, r;
    private static ArrayList<Node>[] adj;
    private static int[] dist;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        adj = new ArrayList[10001];
        dist = new int[10001];

        for (int i = 1; i <= 10000; i++) {
            adj[i] = new ArrayList<>();
        }

        int n = sc.nextInt();

        IntStream.range(0, n - 1).map(i -> sc.nextInt()).forEach(parent -> {
            int child = sc.nextInt();
            int weight = sc.nextInt();
            adj[parent].add(new Node(child, weight));
            adj[child].add(new Node(parent, weight));
        });


        s = 9;
        dfs(s, 0);

        r = 0;
        dist = new int[10001];

        s = u;
        dfs(s, 0);
        System.out.println(r);
    }

    private static void dfs(int v, int d) {
        dist[v] = d;

        if (dist[v] > r) {
            r = dist[v];
            u = v;
        }

        adj[v].forEach(node -> {
            int next = node.v;
            int weight = node.w;
            if (dist[next] == 0 && next != s) {
                dfs(next, d + weight);
            }
        });
    }
}

class Node {
    int v;
    int w;

    Node(int v, int w) {
        this.v = v;
        this.w = w;
    }
}