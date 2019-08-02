import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        int id = 0;
        List<Member> list = new ArrayList<>();

        while (num-- > 0) {
            Member member = new Member();
            member.setId(id++);
            member.setAge(sc.nextInt());
            member.setName(sc.next());
            list.add(member);
        }

        list.stream().sorted(Comparator.comparing(Member::getAge)
                        .thenComparing(Member::getId))
                    .forEach(m -> System.out.println(m.getAge() + " " + m.getName()));
    }

}

class Member {
    private int id;
    private int age;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
