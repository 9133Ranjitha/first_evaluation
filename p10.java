public class main{
  public static void main(String[] args){
  String input="ranju";
   String uppercase="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
   String lowercase="abcdefghijklmnopqrstuvwxyz";
   for(int i=0;i<input.length ()-1; i++){
      if(input.charAt(i)==lowercase.charAt(i)){
      lowercase=uppercase;
      input=uppercase;
      }else  if(input.charAt(i)==uppercase.charAt(i)){
       uppercase=lowercase;
      input=lowercase;
      }
      }
      System.out.println(input);
      }
      }
      
      
