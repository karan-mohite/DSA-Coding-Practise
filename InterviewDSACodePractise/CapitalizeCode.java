import java.util.Scanner;

public class CapitalizeCode {
    
    public static void  main(String args[])
    {
        Scanner sc=new Scanner((System.in));

        System.out.println("Enter Any Sentence:");

        String input=sc.nextLine();

        String[] words=input.split(" ");

        String result=" ";

        for(String word:words)
        {
            if(!word.isEmpty())
            {
                result+=word.substring(0,1).toUpperCase()+word.substring(1).toLowerCase()+" ";
            }
        }
        System.out.println("Output:"+result.trim());
    }
}
