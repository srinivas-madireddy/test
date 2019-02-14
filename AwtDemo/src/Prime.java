

import java.util.Scanner;  
public class Prime {  
   public static void main(String[] args) {  
       @SuppressWarnings("resource")
	Scanner s = new Scanner(System.in);  
       System.out.print("Enter the second number : ");  
       int end = s.nextInt();  
       System.out.println("List of prime numbers between 2" +" and " + end);  
       for (int i = 2; i <= end; i++) {  
           if (isPrime(i)) {  
               System.out.println(i);  
           }  
       
       }  
   }  
   public static boolean isPrime(int n) {  
          for (int i = 2; i <= Math.sqrt(n); i++) {  
           if (n % i == 0) {  
               return false;  
           }   
       }  
       return true;  
   }  
}  
   