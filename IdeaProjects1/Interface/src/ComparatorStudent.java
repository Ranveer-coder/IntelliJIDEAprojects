import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class ComparatorStudent {

    int rollNo;
    String name, address;

    //Constructor

    public ComparatorStudent(int rollNo, String name, String address) {

        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
    }

    public String toString(){
        return this.rollNo + "" + this.name + " " + this.address;

    }
}

class SortByRoll implements Comparator<ComparatorStudent> {


    @Override
    public int compare(ComparatorStudent o1, ComparatorStudent o2) {
        return o1.name.compareTo(o2.name);
    }
}

class SortbyRoll implements Comparator<ComparatorStudent> {
    @Override
    public int compare(ComparatorStudent a, ComparatorStudent b) {
        return a.rollNo - (b.rollNo);

    }

    //Main
    public static void main(String[] args) {
        List<String> ab =
                Arrays.asList("Geek", "GeeksQuiz", "g1", "QA", "Geek2");
        List<Integer> ab1 =
                Arrays.asList(101,102,103,104,105);

        Predicate<String> p = (s) -> s.startsWith("G");
        System.out.println(p);
        Predicate<Integer> p1 = (s1) -> String.valueOf(s1).startsWith("1"); // -TODO converet it into Interger boolean type and print values in accordance with it....
        System.out.println(p1);

        for (String s : ab) {

            if (p.test(s)) {
                System.out.println(s);
            }

            for (Integer s1 : ab1) {

                if (p1.test(s1)) {

                    System.out.println(s1);

                }

            }

        }
    }
}