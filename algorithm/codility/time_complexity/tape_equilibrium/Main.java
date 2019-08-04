public class Main {
    public static void main(String[] args) {
        int[] A = {3,1,2,4,3};
        int length = A.length;
        int min = Integer.MAX_VALUE;
        int firstSum = 0, lastSum = 0;

        for (int i = 0; i < length; i++) {
            lastSum += A[i];
        }

        for (int i = 1; i < length; i++) {
            firstSum += A[i - 1];
            lastSum -= A[i - 1];

            int diff = Math.abs(firstSum - lastSum);

            if (min > diff) {
                min = diff;
            }
        }

        System.out.println(min);
    }
}