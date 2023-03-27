import java.util.*;
public class Fibonacci_Sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int end = sc.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;
        while(c <= end){
            System.out.print(c + " ");
            a = b;
            b = c;
            c = a + b;

        }
    }
}
