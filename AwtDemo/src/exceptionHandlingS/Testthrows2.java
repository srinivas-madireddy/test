package exceptionHandlingS;

public class Testthrows2 {
	
		   public static void main(String args[]){  
		    try{  
		     M m=new M();  
		     m.method();  
		    }catch(Exception e){System.out.println("exception handled");}     
		  
		    System.out.println("normal flow...");  
		  }  
	} 

