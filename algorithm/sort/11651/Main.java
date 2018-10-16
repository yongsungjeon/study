import java.awt.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        List<Point> list = new ArrayList<>();

        while (num-- > 0) {
            Point point = new Point();
            point.x = sc.nextInt();
            point.y = sc.nextInt();
            list.add(point);
        }

        list.stream().sorted(Comparator.comparing((Point p) -> p.y)
                        .thenComparing(p -> p.x))
                    .forEach(p -> System.out.println(p.x + " " + p.y));
    }
}
