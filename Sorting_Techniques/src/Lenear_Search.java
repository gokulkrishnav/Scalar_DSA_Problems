import java.util.*;
public class Lenear_Search {
    public static void main(String[] args) {
        int[] arr = { -2,8,6,4,7,9};
        Linearsearch(arr);
    }
    static void Linearsearch(int[] arr){
       for(int i =0;i < arr.length - 1;i++){
           int minval = arr[i];
           int minindex = i;

           for(int j = i + 1;j < arr.length - 1;j++){
               if(arr[j] < minval){
                   minval = arr[j];
                   minindex = j;
               }

           }
           int temp = arr[i];
           arr[i] = arr[minindex];
           arr[minindex] = temp;
       }
       for(int c : arr){
           System.out.print(c + " ");
       }

//       Above for each loop can be written in the below form also
//       for(int i = 0 ; i < arr.length -1;i++){
//           int val = arr[i];
//       }
    }
}
