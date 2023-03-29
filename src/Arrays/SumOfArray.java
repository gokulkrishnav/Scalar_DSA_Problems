package Arrays;

import java.util.*;
public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value = ");
        int n = sc.nextInt();
        int sum = 0;
        int[] arr1= new int[n];
        for(int i =0;i < n ;i++){
            arr1[i] = sc.nextInt();
        }


        for(int i = 0 ;i < n; i++){         // n is size of an array taken input from user
            sum = sum + arr1[i];
        }
        System.out.println("sum of all integes in an aarray is =" + sum);
    }
}
