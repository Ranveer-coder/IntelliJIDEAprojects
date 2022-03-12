import java.util.function.Function;

public class FunctionalInterfacePipeline {

    public static String addHeader(String text){
        return "From Ranveer\n"+text;
    }

    public static String addFooter(String text){
        return text+"\nWith regards";
    }

    public static String checkSpell(String text){
        return text.replace("Ranveer","CODER718");
    }



    public static void main(String[] args) {

    String content = "I'm Ranveer.Practice,the distance between dream and achievement.";

    //Create pipeline
        Function<String,String> addHeader = FunctionalInterfacePipeline::addHeader;
        Function<String,String> transformPipeline = addHeader.andThen(FunctionalInterfacePipeline::checkSpell).andThen(FunctionalInterfacePipeline::addFooter);

        System.out.println("The letter is :\n");

        System.out.println(transformPipeline.apply(content));


    }

}
