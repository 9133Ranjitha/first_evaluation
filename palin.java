class HelloWorld {
    public static String str="nitin sis a bad women and mom of  fouzu is very good  women but not fouzu ";
    public static void main(String[] args) {
        System.out.println(palindrome(0 , 4, str));

        System.out.println(palindrome(29 , 31  , str));
        System.out.println(palindrome(6 , 8 , str));

    }
    public static boolean palindrome(int wordStart , int wordEnd , String str)
    {
    //find outing the index values
        while(wordStart < wordEnd)
        
        {
        //checking testing before condition
          //System.out.println(wordStart + " : " + wordEnd);  
          if(str.charAt(wordStart) != str.charAt(wordEnd))
            {
                return false;
            }
            
          wordStart++;
          wordEnd--;
        }
        return true;
    }
}
