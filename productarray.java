class sumOfBoder

{
  	public static void main(String[] args)
  	
	{
	
	//declaration of array
	
	int [][] Array = {{1,2,3},{4,5,6},{7,8,9},{7,8,9}};
	
	//defined rows columns
	
	int Rows=4;
	
	int Columns=3;
	
	//printing statements
	
	System.out.println(functionboderSum(Rows , Columns , Array));
	
	}
	public static int functionboderSum(int Rows , int Columns , int[][] Array )
		
	{
		int product=1;
			
		//loop declaration
			
	        for ( int i = 0; i < Rows; i++ )
	        	
	        {
	        	for ( int j = 0; j< Columns; j++ ) 
	        		
	        	{
	        		//product of all the rows columns elements;
	        			
	        		product *= Array[i][j];
	        			
	                 }
	                 	
	         }
	                 
	         //return the values
	                 
	         return product;   
	} 
	            
}	
	
