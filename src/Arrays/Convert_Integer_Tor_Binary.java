package Arrays;

import java.util.Scanner;

public class Convert_Integer_Tor_Binary {
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[8];
     for(int i = 0; n > 0; i++){
         arr[7 - i] = n % 2;
         n = n / 2;
     }

     for(int j = 0;j < arr.length;j++){
         System.out.print(arr[j] + " ");
     }
}
}
