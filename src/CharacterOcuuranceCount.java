import java.util.Scanner;

public class CharacterOcuuranceCount {
    public static void main(String args[]) {
        String str;
        int i, counter[] = new int[256];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        str = sc.nextLine();



        for (i = 0; i < str.length(); i++) {
            counter[(int) str.charAt(i)]++;
        }
        // Print Frequency of characters
        for (i = 0; i < 256; i++) {
            if (counter[i] != 0) {
                System.out.println((char) i + "  " + counter[i]);
            }
        }
    }
}
