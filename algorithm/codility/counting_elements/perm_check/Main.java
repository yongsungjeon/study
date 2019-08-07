import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] A = {4,1,3,3};
        int length = A.length;
        Set<Integer> set = new HashSet<>();
        Arrays.sort(A);

        int status = 1;

        for (int i = 0; i < length; i++) {
            if (i + 1 != A[i]) {
                status = 0;
                break;
            }

            if (!set.add(A[i])) {
                status = 0;
                break;
            }
        }

        System.out.println(status);
    }
}