package task3;
import java.util.Arrays;
import java.util.Scanner;

public class task7_34 {
    public static void main(String[] args) {
        String str = "";
        Scanner input = new Scanner(System.in);
        System.out.print("ÇëÊäÈëÒ»¸ö×Ö·û´®£º");
        str = input.nextLine();
        str = sort(str);
        System.out.print(str);
    }
    public static String sort(String s){
        int length = s.length();
        char[] ch = new char[length];
        for ( int i = 0 ; i < length ; i++){
            ch[i] = s.charAt(i);
        }
        Arrays.sort(ch);
        String str = "";
        for (int i = 0 ; i < length ; i++){
            str += ch[i];
        }
        return str;
    }
}
