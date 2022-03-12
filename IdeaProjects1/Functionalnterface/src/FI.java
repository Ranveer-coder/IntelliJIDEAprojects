public interface FI {

    int calculate(int x);


    class Test {
        public static void main(String[] args) {

            int a = 5;
            //lambda expression
            FI f = (int x) -> x * x;

            int ans = f.calculate(a);
            System.out.println(ans);
        }

    }
}
