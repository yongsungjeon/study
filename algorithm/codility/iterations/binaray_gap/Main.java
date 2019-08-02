public class Main {
    public static void main(String[] args) throws Exception {
        int N = 1041;
        char[] arr = Integer.toBinaryString(N).toCharArray();
        int length = 0, maxLength = 0;

        for (char c : arr) {
            if (c == '1') {
                if (length > maxLength) {
                    maxLength = length;
                    length = 0;
                }
            } else {
                length++;
            }
        }

        System.out.println("maxLength: " + maxLength);
    }
}
