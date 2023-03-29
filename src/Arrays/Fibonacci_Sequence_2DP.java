package Arrays;

import java.util.Scanner;
import java.util.*;
public class Fibonacci_Sequence_2DP {



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of integers ot be printed = ");

        int end = sc.nextInt();

        int arr[] = new int[end];

        int a = 0;
        int b= 1;
        int c = 0;

        while(c <= end){
            System.out.print(c + " ");
            a = b;
            b = c;
            c = a + b;
        }
    }
}
