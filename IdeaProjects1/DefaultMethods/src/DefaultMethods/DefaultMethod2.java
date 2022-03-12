package DefaultMethods;

interface Moveable{
    //default method
    default void move(){
        System.out.println("Im moving"); // would not get printted because we are overridding it in DefaultMethod2 class which is the callers class or main class.
    }
}

public class DefaultMethod2 implements Moveable{

@Override
        public void move(){
            System.out.println("Im running now");
        }

    public static void main(String[] args) {

        DefaultMethod2 dm2 = new DefaultMethod2();
        dm2.move();
    }
}
