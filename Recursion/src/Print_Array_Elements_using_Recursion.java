public class Print_Array_Elements_using_Recursion {
    public static void main(String[] args) {
        int[] arr = {20,60,40,70,90,10};
//        int i = 5;
printArrayElements(arr,0);

    }

    static void printArrayElements(int[] arr , int i){
        if(i == arr.length){
            return;
        }
        System.out.println(arr[i]);
        printArrayElements(arr,i+1);

    }

}
