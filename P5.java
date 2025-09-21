
import java.util.Scanner;

public class P5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        char symbol = sc.next().charAt(0);

        switch (symbol) {
            case '+':
                System.out.println(10 + 20);

                break;
            case '-':
                System.out.println(10 - 20);

                break;
            case '*':
                System.out.println(10 * 20);

                break;
            case '/':
                System.out.println(20 / 10);

                break;
            default:
                System.out.println("Invalid !");
        }

    }
}
