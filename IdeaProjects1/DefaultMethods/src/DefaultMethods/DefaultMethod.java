package DefaultMethods;
//An example of default method in a interface and it shows u can also define abstract method in it...

    interface Sayable{

      default void say(){ //default method
            System.out.println("SAYING...");
        }

        void sayMore(String msg); //abstract method

    }
public class DefaultMethod implements Sayable{ //implementing abstract method; extending Sayable by the main class
    @Override
    public void sayMore(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        DefaultMethod dm = new DefaultMethod();
        dm.say(); //calling default method
        dm.sayMore("Work is Worship!!!"); //calling abstract method
    }

}
