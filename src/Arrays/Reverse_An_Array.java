package Arrays;

import java.util.*;
public class Reverse_An_Array {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//
//        for(int i =0;i < n;i++){        // n is size of an array taken input from user
//            arr[i] = sc.nextInt();
//        }
//        int i = 0;
//        int j = n - 1;
//
//        while(i < j){
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//
//            i++;
//            j--;
//        }
//        for(int k = 0; k < n; k++){
//            System.out.print(arr[k]+ " ");
//        }
//

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i =0;i < arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int[] arr1 = new int[n];
        int c = 0;

            for (int j = arr.length - 1; j >= 0; j--) {
                arr1[c] = arr[j];

                System.out.print(arr1[c]);
                c++;
            }

    }


}
