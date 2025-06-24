import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any String:"); 
        String str=sc.nextLine();

        String str1="";
        for(int i=str.length()-1;i>=0;i--)
        {
            str1 +=str.charAt(i);
        }
        if(str.equals(str1))
        {
            System.out.println("Palindrome String");
        }
        else
        {
            System.out.println("Not Palindrome String");
        }
    }
}
