import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] A = {3, 4, 4, 6, 1, 4, 4};
        int N = 5;
        int length = A.length;
        int[] result = new int[N];
        int max = 0, realMax = 0;
        int index;

        for (int i = 0; i < length; i++) {
            if (A[i] > N) {
                realMax = max;
                continue;
            }

            index = A[i] - 1;
            if (result[index] < realMax) {
                result[index] = realMax;
            }

            if (max < ++result[index]) {
                max = result[index];
            }
        }

        for (int i = 0; i < N; i++) {
            if (result[i] < realMax) {
                result[i] = realMax;
            }
        }

        System.out.println(Arrays.toString(result));
    }
}