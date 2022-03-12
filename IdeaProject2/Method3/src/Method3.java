import java.util.Scanner;

public class Method3 { // Method3 -> EvenOdd....
        public static void main(String[] args){
            //Creating a Scanner Object
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter no.");

            //reading values by user

            int num = scan.nextInt();

            //method calling
            findEvenOdd(num);
        }
        //User Definer Method
    public static int findEvenOdd(int num){
            if(num%2 == 0)
                System.out.println(num+ " is even" );

            else
                System.out.println(num+ " is odd");

        return num;

        }

}
