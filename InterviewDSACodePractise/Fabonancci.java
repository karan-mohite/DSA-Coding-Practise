import java.util.*;
 
public class Fabonancci {
     public static void main(String[] args) {
 
        int fno = 0, sno = 1, tno, n;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        n = sc.nextInt();

        System.out.println(fno + " " + sno + " ");
        for (int i = 3; i <= n; i++) {
            tno = fno + sno;
            System.out.print(tno + " ");
            fno = sno;
            sno = tno;
        }
    }
} 