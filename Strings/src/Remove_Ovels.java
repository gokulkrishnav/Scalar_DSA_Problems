import java.util.*;
public class Remove_Ovels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sentence to remove the ovels from it : ");
        String str = sc.nextLine();
        remove_ovels(str);

    }
    static void remove_ovels(String str){

        for(int i = 0;i < str.length();i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
                continue;
            }
            else {

                System.out.print(ch);
            }
        }
    }
}
