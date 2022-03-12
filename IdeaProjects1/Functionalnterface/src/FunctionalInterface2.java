import java.util.function.Function;

public class FunctionalInterface2 {
    public static void main(String[] args) {

        Function<Integer,Double> half = a->a/2.0; //half the no and return half of it.

        //now treble the output of half function
        half = half.andThen(a->3*a);

        //apply function
        System.out.println(half.apply(10));
    }
}
