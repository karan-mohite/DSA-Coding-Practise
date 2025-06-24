import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {

        int n = 3,flag = 0;
        for (int i = 2; i <=n-1; i++) 
        {                  
            if (n % i == 0) 
            {    
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("Prime no");
        } else {
            System.out.println("Not prime number");
        }
    }
}
