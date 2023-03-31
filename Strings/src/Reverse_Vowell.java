import java.util.*;

public class Reverse_Vowell {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sentence to reverse the Vovel : ");
        String str = sc.nextLine();
        reversevoels(str);



    }
    static void reversevoels(String str) {
        char[] ch = str.toCharArray();
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {

            while (ch[i] != 'a' & ch[i] != 'e' && ch[i] != 'i' && ch[i] != 'o' && ch[i] != 'u') {
                i++;
            }

            while (ch[j] != 'a' && ch[j] != 'e' && ch[j] != 'i' && ch[j] != 'o' && ch[j] != 'u') {
                j--;
            }
            if (i >= j) {
                break;
            }
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
        for (char temp : ch) {
            System.out.print(temp);

        }

    }

    }

