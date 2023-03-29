package Arrays;

import java.util.*;
public class N_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fact = sc.nextInt();
        int factorial = 1;
        for(int i = fact;i>0;i--){
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }

}
