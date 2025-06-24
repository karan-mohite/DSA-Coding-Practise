public class FindCharacter {
    public static void main(String[] args) {

        String str = "ashwini";

        int key = 'w';

        for (int i = 0; i < str.length() - 1; i++) {
            if (key == str.charAt(i)) {
                System.out.println("Index=" + i);
            }
        }
    }
}
