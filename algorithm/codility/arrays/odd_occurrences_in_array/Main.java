import java.util.*;

public class Main {
        public static void main(String[] args) {
                int[] A = { 9, 3, 9, 3, 9, 7, 9 };
                Set<Integer> set = new HashSet<>();

                for (int num : A) {
                        if (set.contains(num)) {
                                set.remove(num);
                        } else {
                                set.add(num);
                        }
                }

                System.out.println(set.iterator().next());
        }
}