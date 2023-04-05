public class Factorial_Using_Recursion {
    public static void main(String[] args) {

        System.out.println( Factorial(5));
    }

    static int Factorial(int n){
        if(n == 0){
            return 1;
        }

        Factorial(n-1);
            return n * (n-1);


    }
}
