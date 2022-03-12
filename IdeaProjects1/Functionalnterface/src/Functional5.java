import java.util.function.Function;

public class Functional5 {

    public static String checkSpell(String text){
        return text.replace("Method Reference Extracted Thread Created Here...", "Method Reference Applied");
    }

    public static void main(String[] args) {
        //create anonymous inner class
        new Thread(new Runnable() {
            private void run2(){
                System.out.println("Method Reference Extracted Thread Created Here...");
            }

            @Override
            //overriding runnable
            public void run() {
                System.out.println("New Thread Created!!!");

                this.run2();

                new Thread(this::run2).start(); //Method reference


            }


        }).start();//To implement run method start(); is necessary...

        Function<String,String> checkSpell = Functional5::checkSpell;
        Function<String,String> transformPipeline = checkSpell.andThen(Functional5::checkSpell);
        System.out.println(transformPipeline);
    }

}
