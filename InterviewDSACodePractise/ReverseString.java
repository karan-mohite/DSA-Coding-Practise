import java.util.*;

public class ReverseString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Any String:");
        String str = sc.nextLine();

        String reverseStr = "";
        char ch;

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            reverseStr = ch + reverseStr;
        }

        System.out.println("Reverse String is:" + reverseStr);
    }
}
