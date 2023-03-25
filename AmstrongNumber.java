class AmstrongNumber {
    public static void main(String[] args)
    {
        
        int num = 153;
        String num1 = Integer.toString(num);
        int len = num1.length();
        int sum = 0;
        while(num > 0){
        	int rem = num %10;
        	sum += Math.pow(rem,len);
        	num /= 10;
        }
        if(num == sum){
        	System.out.println("Amstrong Number");
        
        }else {
        	System.out.println("Amstrong Number");
        }
    }
    
  }
