public class StringDuplicate {
    public static void main(String[] args) {

        String str[] = { "java", "Ashwini", "vaibhav", "vishal", "Kajal" };

        boolean Flag = false;

        for (int i = 0; i < str.length; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if (str[i] == str[j]) {
                    System.out.println("Duplicate String is Found:" + str[i]);
                    Flag = true;
                }
            }
        }
        if (Flag == false) {
            System.out.println("Duplicate String in not Found..!!");
        }
    }
}
