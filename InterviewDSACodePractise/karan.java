public class karan {
    public static void main(String[] args) {

        int len = 0;
        String str = "karan";
        try {
            while (true) {
                str.charAt(len);
                len++;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Length of String is=" + len);
    }
}
