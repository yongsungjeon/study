import java.util.Arrays;
import java.util.Scanner;

/**
 * Arrays 함수 사용
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] array = new int[count];

        for (int i = 0; i < count; i++) {
            array[i] = sc.nextInt();
        }

        Arrays.sort(array);

        int qCount = sc.nextInt();

        int result;
        for (int i = 0; i < qCount; i++) {
            result = Arrays.binarySearch(array, sc.nextInt());

            if (result < 0) {
                System.out.println(0);
            } else {
                System.out.println(1);
            }
        }
    }
}

/**
 * binarySearch 구현
 */
public class Main {

    private static int[] array;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        array = new int[count];

        for (int i = 0; i < count; i++) {
            array[i] = sc.nextInt();
        }

        Arrays.sort(array);

        int qCount = sc.nextInt();
        for (int i = 0; i < qCount; i++) {
            System.out.println(binarySearch(sc.nextInt()));
        }
    }

    private static int binarySearch(int key) {
        int pl = 0, pr = array.length - 1, pm;
        int result = 0;

        while (pl <= pr) {
            pm = (pl + pr) / 2;

            if (array[pm] == key) {
                result = 1;
                break;
            }

            if (array[pm] > key) {
                pr = pm - 1;
            } else if (array[pm] < key) {
                pl = pm + 1;
            }
        }

        return result;
    }
}