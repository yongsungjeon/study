import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] A = {2, 3, 5, 1};
        Arrays.sort(A);
        int length = A.length;

        for (int i = 0; i < length; i++) {
            if (i + 1 != A[i]) {
                System.out.println(i + 1);
                return;
            }
        }

        System.out.println(length + 1);
    }
}