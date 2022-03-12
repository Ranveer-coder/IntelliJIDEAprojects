public class InstanceMethod {
        public static void main(String[] args){
            //Creating an object of the main class
            InstanceMethod obj = new InstanceMethod();
            //invoke
            System.out.println("The sum is " +obj.add(12,13));
        }
        int s;
        //user-defined method because we have not used static keyword
        public int add(int a,int b){
            s= a+b;
            //returning sum
            return s;
        }
}
