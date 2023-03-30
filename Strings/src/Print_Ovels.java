import java.util.*;
public class Print_Ovels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the senetnce to get ovels : ");
        String str = sc.nextLine();
getovels(str);
    }

    static void getovels(String str){

        for(int i = 0;i < str.length();i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                System.out.print(ch);
            }
            else{
                continue;
            }
        }
    }
}
