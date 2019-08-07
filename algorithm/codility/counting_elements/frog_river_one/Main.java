import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] A = {1, 3, 1, 5, 2, 3, 5, 4};
        int X = 4;
        int length = A.length;
        int result = -1;
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < length; i ++) {
            set.add(A[i]);

            if (set.size() >= X && set.contains(X)) {
                result = i;
                break;
            }
        }

        System.out.println(result);
    }
}