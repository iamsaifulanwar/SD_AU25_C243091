import java.util. *;

 public class Array{
    
    static public void main (String[ ] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int [] arry=new int[n];

        for (int i=0; i<n; i++){
             arry[i]= sc.nextInt();
        }
         for (int i=0; i<n; i++){
            System.out.println(arry[i]);
        }


    }
 }