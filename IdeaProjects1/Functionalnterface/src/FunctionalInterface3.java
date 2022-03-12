import java.util.function.Function;

public class FunctionalInterface3 {
    public static void main(String[] args) {

        //function which takes in a no and return half of it

        Function<Integer,Double>half = a-> a/2.0;

        //pass object reference to null to throw exception

        try{
            half = half.andThen(null);
        }
        catch(Exception e){
            System.out.println("Exception thrown " + "While passing null: " +e);
        }

    }
}
