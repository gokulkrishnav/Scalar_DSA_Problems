import java.util.*;
public class Upper_Case_To_Lower {

    public static void main(String[] args) {
        String str = "WeLCoMe To ShaGggab ";
        touppercase(str);
    }
    static void touppercase(String str){

        char[] s = str.toCharArray();
//        char ansch ;
        for(int i =0;i< str.length() -1;i++){
           char ch = s[i];
            if (ch >= 'A' && ch <= 'Z') {
                char ansch = (char) (ch - 'A' + 'a');

            }
        }
        for(char c:s) {
            System.out.print(c);


        }


    }
}
