public class main{
    public static void main(String[] args){
       int n=4;
       for(int i=1;i<=n;i++){
         String bag="";
         for(int j=2;j<=n;j++){
           if(i%3==0){
          bag+="-"+"*";
           }else if(i%2==0){
            bag+="*"+"-";
          }
          }
          System.out.println(bag);
          }
          }
          }
