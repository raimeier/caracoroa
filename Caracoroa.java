 import java.util.Random;

 public class CaraCoroa 
 {

     public static void main  (String[] args)
     {
        
        Random rand = new Random();
         
        int n = rand.nextInt(2);// 0 até 1

        if (n == 1)
        {

            System.out.print("\n\tCARA\n\n");
        
        }else{

            System.out.print("\n\tCOROA\n\n");
        
        }
     }  
 }