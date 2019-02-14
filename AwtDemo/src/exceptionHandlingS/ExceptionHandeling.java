package exceptionHandlingS;

public class ExceptionHandeling {
	
		int add(int n1, int n2){
			try{
				myAdd(n1, n2);
				return 0;
				}
			catch(Exception e) {
			
					return 6;
					}
//			finally
//			{
//				return 7;
//				}
			
			}
		int myAdd(int n1, int n2)
		{
			int res =  n1 /  n2;
			return res;
			}
		String joinNames(String s1, String s2)
		{
			return s1 + s2;    
			}
	}
	          

