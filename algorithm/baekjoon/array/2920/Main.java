import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[8];
        int type;
        String[] line = sc.nextLine().split(" ");

        for (int i = 0; i < 8; i++) {
            num[i] = Integer.parseInt(line[i]);
        }

        if (num[0] < num[1]) {
            type = 1;
        } else {
            type = 2;
        }

        for (int i = 1; i < 8; i++) {
            if (num[i - 1] < num[i] && type != 1) {
                type = 3;
                break;
            } else if (num[i - 1] > num[i] && type != 2) {
                type = 3;
                break;
            }
        }

        switch (type) {
            case 1:
                System.out.println("ascending");
                break;
            case 2:
                System.out.println("descending");
                break;
            case 3:
                System.out.println("mixed");
                break;
        }
    }
}