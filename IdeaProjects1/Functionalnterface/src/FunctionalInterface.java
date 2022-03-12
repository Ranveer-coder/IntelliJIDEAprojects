import java.util.function.Function;

public class FunctionalInterface{
    public static void main(String[] args) {
        //function which takes in a number and return a result which is half of it

        Function<Integer, Double>half = a -> a/2.0;

        //apply the function to get the result

        System.out.println(half.apply(10));


    }
}