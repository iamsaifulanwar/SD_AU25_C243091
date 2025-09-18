
import java . util. *;

public class AvgArry{


    static public void main (String[] args){
        
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int [] arry = new int [n];
        int sum =arry[0];
        
       
        

        for (int i=0; i<n; i++){
            arry[i]=sc.nextInt();
        }
         for (int i=0; i<n; i++){
            
            sum+=arry[i];
        }
        System.out.println("Sum of Arry : " + sum);
        
    }
}