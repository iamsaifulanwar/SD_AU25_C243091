import java.util. *;

public  class Count{

    static public void main (String[] args){
         Scanner sc = new Scanner(System.in);
         int n = sc . nextInt();
         int [] arry= new int[n];
         int Even = 0;
         int odd=0;
         for (int i=0; i<n; i++){
            arry[i]= sc.nextInt();
            }

         for (int i=0; i<n; i++){
            if (arry[i ]% 2==0){
                Even++;

            }else{
                odd++;

            }

         }
         System.out.println("Even number is : " + Even);
          System.out.println("ODD number is : " + odd);
         

    }
}