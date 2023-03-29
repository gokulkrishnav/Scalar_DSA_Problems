package Arrays;

import java.util.*;
public class Fibonacci_Sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of integers ot be printed = ");
        int end = sc.nextInt();
        int arr[] = new int[end];
        System.out.print("Enter the Integer to be divided with = ");
        int divby = sc.nextInt();
      int sum = 0;
         arr[0] = 0;
         arr[1] = 1;

        for(int i=2;i<end;i++){
            arr[i] = arr[i-1]+ arr[i-2];
            if(arr[i] % divby == 0){
                sum = sum + arr[i];

            }

            System.out.print(arr[i] + " ");


        }
        System.out.println("");
        System.out.println(sum);

    }
}
