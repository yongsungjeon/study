import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {};
        int shiftCount = 2;
        int length = arr.length;

        if (length == 0) {
            return;
        }

        while (shiftCount-- > 0) {
            int tempNum = arr[length - 1];
            for (int i = length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }

            arr[0] = tempNum;
        }

        System.out.println(Arrays.toString(arr));
    }
}