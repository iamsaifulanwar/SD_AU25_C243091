
import java.util.Scanner;

public class problem1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {
            StringBuilder sb = new StringBuilder(words[i]);
            System.out.print(sb.reverse());
            if (i < words.length - 1) {
                System.out.print(" ");
            }
        }

        sc.close();
    }
}
