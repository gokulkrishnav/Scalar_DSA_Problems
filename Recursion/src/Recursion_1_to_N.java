import java.sql.SQLOutput;

public class Recursion_1_to_N {
    public static void main(String[] args) {
        PrintIncreasing(7);
    }
   public static void PrintIncreasing(int N){
        if(N == 0)
        {
        return;
        }
        PrintIncreasing(N - 1);
        System.out.println(N);
    }
}
