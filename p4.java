public class main{
   public static void main(String[] args){
     int n=3;
     for(int i=0;i<=n;i++){
       String bag="";
        for(int j=0;j<=n;j++){
        if(i==0 || i==n){
        bag+="*"+"-"+"*"+"-"+"*"+"-"+"*";
        break;
        }else if(i==1){
        bag+="*"+"-"+"*"+"-"+"-"+"*";
        break;	
        }else if(i==2){
        bag+="*"+"-"+"-"+"*"+"-"+"*";
         break;
        }
        }
        System.out.println(bag);
        }
        }
        }
