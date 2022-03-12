import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor;

abstract class abstractClass{
    public abstractClass(){
        System.out.println("You can create a constructor in abstract class");
    }
    //abstract method
    abstract int add(int a, int b);

    //non-abstract method
    int sub(int a,int b){
        return a-b;
    }

    //static method
    static int multiply(int a,int b){
        return a*b;
    }

    //Another Constructor

    public class AntoherOne {
        int add;
        String modelName;


    }

}


public class AbstractTest extends abstractClass {
    public int add(int a, int b){
        System.out.println(a+b);
    return a+b;
    }

    public static void main(String[] args) {
        AbstractTest a = new AbstractTest();
        //calling methods
        int result1 = a.add(20,10);
        int result2 = a.sub(20,10);
        int result3 = abstractClass.multiply(20,10);
        System.out.println("Addition : "+ result1 + " ,Substraction :" + result2 + " ,Multiplication :" + result3);

    }

}
