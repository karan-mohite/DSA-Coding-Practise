import java.util.Scanner;

public class palindromeno {
    public static void main(String[] args) {

        int n, rem, rev = 0, temp = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        n = sc.nextInt();
        temp = n;
        while (n != 0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        if (temp == rev) {
            System.out.println("Palindrome Number:");
        } else {
            System.out.println("Not palindrome Number");
        }

    }
}
