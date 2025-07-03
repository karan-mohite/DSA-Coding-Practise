import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner((System.in));

        System.out.println("Enter a String:");
        String str=sc.nextLine();

        System.out.println("Enter Start Index:");
        int start=sc.nextInt();

        System.out.println("Enter End index:");
        int end=sc.nextInt();

        if(start>=0 && end<=str.length() && start<end)
        {
            System.out.println("Substring:"+str.substring(start,end));
        }
        else
        {
            System.out.println("Invalid Index..!!");
        }
    }
}
