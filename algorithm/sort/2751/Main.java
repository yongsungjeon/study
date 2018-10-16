import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        List<Long> list = new ArrayList<>();

        while(num-- > 0) {
            list.add(sc.nextLong());
        }

        list.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
    }
}
