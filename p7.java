public class main{
   public static void main(String[] args){
    String input1="@ranju";
   String input2="!@#$%^&*";
   for(int i=0;i<input1.length ()-1; i++ ){
   String flage="false";
     for(int j=0;j<input2.length ()-1; j++ ){
     if(input1.charAt(i)==input2.charAt(j)){
      flage="true";
      }
      }
      System.out.println(flage);
      }
      }
      }
     
