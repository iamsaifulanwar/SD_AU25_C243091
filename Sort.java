
import java.util.*;

public class Sort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arry = new int[n];
        int target = 0;
        for (int i = 0; i < n; i++) {
            arry[i] = sc.nextInt();
        }
        Arrays.sort(arry);

        System.out.println("Ascending Order : ");

        for (int i = 0; i < n; i++) {

            System.out.println(arry[i]);

        }

    }
}
