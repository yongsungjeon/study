import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import static java.util.Comparator.comparing;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        List<Score> list = new ArrayList<>();

        while (num-- > 0) {
            Score score = new Score();
            score.setName(sc.next());
            score.setKorean(sc.nextInt());
            score.setEnglish(sc.nextInt());
            score.setMath(sc.nextInt());
            list.add(score);
        }

        list.stream().sorted(Comparator.comparingInt(Score::getKorean).reversed()
                        .thenComparingInt(Score::getEnglish)
                        .thenComparing(comparing(Score::getMath).reversed())
                        .thenComparing(Score::getName))
                    .forEach(s -> System.out.println(s.getName()));
    }
}

class Score {
    private String name;
    private int korean;
    private int english;
    private int math;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKorean() {
        return korean;
    }

    public void setKorean(int korean) {
        this.korean = korean;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }
}
