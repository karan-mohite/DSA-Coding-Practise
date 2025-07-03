import java.util.Scanner;

public class LargestLexicographic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number of Strings:");
        int n = sc.nextInt();
        sc.nextLine();  

        String largest = "";  

        System.out.println("Enter " + n + " strings:");

        for (int i = 0; i < n; i++) {
            String word = sc.nextLine();

            if (word.compareTo(largest) > 0) {
                largest = word;
            }
        }

        System.out.println("Largest Lexicographic: " + largest);
        sc.close();
    }
}
