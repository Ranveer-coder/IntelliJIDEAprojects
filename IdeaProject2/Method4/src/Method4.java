public class Method4 {
    public static void main(String[] args) {
        int a = 19;
        int b = 5;

        //method calling
        int c = add(a, b); // a and b are actual parameter
        System.out.println("The Sum of A and B is " + c);
    }

    //user definer method
    public static int add(int n1, int n2) { // n1 and n2 are formal parameters defined inside method to be invoked
        int s;
        s = n1 + n2;
        return s; // returning sum
    }
}