package DefaultMethods;

interface TestInterface{

    void square(int a); //abstract method

    default void show(){ //default method
        System.out.println("Default is Executed");

    }

}

public class DefaultMethods1 implements TestInterface{
    //implementation of abstract metehod
    public void square(int a){
        System.out.println(a*a);
    }

    public static void main(String[] args){
        DefaultMethods1 dm1 = new DefaultMethods1();
        dm1.show();
        dm1.square(4);
    }
}
