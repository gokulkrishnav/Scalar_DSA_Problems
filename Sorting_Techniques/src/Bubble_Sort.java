import java.sql.SQLOutput;

public class Bubble_Sort {
    public static void main(String[] args) {
        int[] arr = {4,6,8,5,3,9,1,2};

         bubblesort(arr);
    }

    static void bubblesort(int[] arr){
        for(int i =0;i < arr.length - 1;i++){
            for(int j = i+1;j <= arr.length -1;j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                else {
                    continue;
                }

            }


        }
        for(int bubb : arr )
            System.out.print(bubb);
    }
}

