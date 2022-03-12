// A simple program to demonstrate the use
// of predicate interface
import java.util.*;
import java.util.function.Predicate;

class Test
{
    public static void main(String[] args)
    {

        // create a list of strings
        List<String> names =
                Arrays.asList("Geek","GeeksQuiz","g1","QA","Geek2");

        // declare the predicate type as string and use
        // lambda expression to create object
        Predicate<String> p = (s)->s.startsWith("G");

        // Iterate through the list
        for (String s :names)
        {
            // call the test method
            if (p.test(s))
                System.out.println(s);
        }
    }
}