public class Main {
    public static void main(String[] args) {
        int x = 3, y = 999111321, d = 7;
        int distance = y - x;
        int count = distance % d == 0 ? distance / d : distance / d +1;
        System.out.println(count);
    }
}