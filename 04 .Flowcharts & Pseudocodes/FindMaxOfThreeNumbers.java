import java.util.*;
public class FindMaxOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter First Number:");
        int a=sc.nextInt();

        System.out.println("Enter Second Number:");
        int b=sc.nextInt();

        System.out.println("Enter Third Numbers:");
        int c=sc.nextInt();

        if(a>b)
        {
            if(a>c)
            {
                System.out.println(a+"is greater");
            }
            else
            {
                System.out.println(c+"is greater..!!!");
            }
        }
        else
        {
            if(b>c)
            {
               System.out.println(b+"is greater..!!!");
            }
            else
            {
                System.out.println(c+"is Greater..!!!");
            }
        }
}
}