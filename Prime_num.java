import java.util.*;
  
  public class Main{
  
  public static void main(String[] args){
      
      Scanner scn = new Scanner(System.in);
      int t = scn.nextInt();
        for(int i = 1 ; i <= t; i++){
            int n = scn.nextInt();
            int fact = 0;
            
            for(int j = 2; j*j <= n ; j++){
                if(n % j == 0){
                    fact++;
                    break;
                }
            }
            
            if(fact == 0){
                System.out.println("prime");
            }else{
                System.out.println("not prime");
            }
        }
        
      
      
    //   for(int i = 1; i <=t ; i++){
    //       int n = scn.nextInt();
    //       boolean isPrime = false;
    //     //   if(n == 1){
    //     //      isPrime = true;
    //     //      System.out.println(isPrime);
    //     //   }
    //       for(int div = 2; div*div <= n ; div++){
    //           if(n % div == 0){
    //             isPrime = true;  
    //           }
    //       }
          
    //       if(isPrime == true){
    //           System.out.println("prime");
    //       }else{
    //           System.out.println("not prime");
    //       }
    //   }
      
     
   }
 }