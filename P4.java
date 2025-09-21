
import java.util.Scanner;

public class P4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int max = Integer.MIN_VALUE;
        for (int i=0; i< n ; i++){
            int num = sc.nextInt();
            if (num > max ){
                max = num;
            }

        }
        System.out.println(max);
       
        }

    }

