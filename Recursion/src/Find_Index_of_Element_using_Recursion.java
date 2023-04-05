public class Find_Index_of_Element_using_Recursion {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 6, 4, 8, 9, 1};
        int n = 88;
        System.out.println(Printarray(arr ,  n , 0));


    }

   public static int Printarray(int[] arr ,int n,int i){
        if(i == arr.length){
            return -1;
        }
        if( arr[i] == n){
            return i;
        }
        else{
           int idx =  Printarray(arr,n,i + 1);
           return idx ;
        }
    }

}
