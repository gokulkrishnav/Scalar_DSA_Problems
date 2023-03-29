package Arrays;

import java.util.*;
public class SubSets_Of_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i =0;i < arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int ei = 0;
        for(int si = 0; si < n ; si++){   // n is size of an array taken input from user

            for(ei = si; ei < n; ei++){

                for(int k=si; k <= ei;k++){   // to traverce between selected two integers rom before loops above EX: btwn 0 and 4
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
