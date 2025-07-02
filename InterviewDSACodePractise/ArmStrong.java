import java.util.*;

public class ArmStrong {
    public static void main(String[] args) {
        int n, rem, arm = 0;
        System.out.println(("Enter Any Number:"));
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        int c = n;

        while (n > 0) {

            rem = n % 10;
            arm = (rem * rem * rem) + arm;
            n = n / 10;
        }
        if (c == arm) {
            System.out.println("Armstrong Number..!!!");
        } else {
            System.out.println("Not Armstrong Number..!!");
        }

    }

}
