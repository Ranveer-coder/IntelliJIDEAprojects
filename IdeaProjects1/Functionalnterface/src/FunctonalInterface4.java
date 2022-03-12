import java.util.function.Function;

public class FunctonalInterface4 {
    public static void main(String[] args) {

        Function<Integer,Integer> f = x -> x +1;

        Function<Integer,Integer> g = x -> x*2;

        Function<Integer,Integer>h1 = f.andThen(g);
        Function<Integer,Integer>h2 = f.compose(g);

        System.out.println("h1 = "+h1.apply(1));
        System.out.println("h2 = "+h2.apply(1));
    }
}
