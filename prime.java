//Write a java program to check whether a number is prime or not.
class primeornot
{  
	public static int num = 3;
	
	public static void main (String[] args ) 
	{
    		
        boolean temp=prime(num);
        
        System.out.println(temp);
        	
       	
        }
      
        public static boolean prime(int num ) {
      
      	boolean flag = false;
        
		if ( (num % 3 != 0) && (num % 5 != 0) && (num % 7 != 0))
		{	
			flag = true;
		} 
		if (flag == true ) {
		
			System.out.println("Prime number");
		}
		else
		{
			System.out.println("Not Prime  number");
       
        	}
       		return flag;
      }
      
      
 }
 
    
       
