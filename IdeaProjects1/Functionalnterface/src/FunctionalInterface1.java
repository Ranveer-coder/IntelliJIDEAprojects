import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionalInterface1 {
    public static void main(String[] args) {
        BiFunction<String, Integer, Integer> biFunction = (desigination, age) -> {
            if (desigination != null && age != null) {
                if (desigination.equalsIgnoreCase("Manager") && age > 30) {
                    return 120000;
                } else if (desigination.equalsIgnoreCase("Developer") && age > 25) {
                    return 90000;
                } else {
                    return 0;
                }
            }
            return age;
        };

        int salary = biFunction.apply("Manager", 31);
        System.out.println(salary);

        salary = biFunction.apply("Developer", 28);
        System.out.println(salary);

        Function<Integer,String> function2 = sal ->{
            if (sal > 100000){
                return "Band 5";
            }else if(sal > 80000){
                return "Band 4";
            }else{
                return "Band 3";
            }

        };
        //andThen method

        String salaryband = biFunction.andThen(function2).apply("Manager",31);
        System.out.println(salaryband);

        String salaryband2 = biFunction.andThen(function2).apply("Developer",28);
        System.out.println(salaryband2);

    }
}



