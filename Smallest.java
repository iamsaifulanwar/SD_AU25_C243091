import java.util. *;
public class Smallest{

    static public void main (String [] args){
        int arry []= { 10,30,100,5,60};
        int sz = 5;
        int smallest=arry[0];
        for (int i=1; i<sz; i++){
            if (arry[i]< smallest){
                smallest= arry[i];
            }
            
    }
     System.out.println("Smallest number is : " + smallest);
        }
}
        