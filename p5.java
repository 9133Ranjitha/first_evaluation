public class main{
  public static void main(String[] args){
   String input1="ranju";
   String input2="ujnar";
    for(int i=0;i<input1.length ()-1; i++ ){
    String flage="false";
        for(int j=input2.length()-1; j>=0;j--){
         if ( input1.charAt(i)== input2.charAt(j)){
         flage="true";
         }
       }
       System.out.println(flage);
      }
    }
  }
         
