public class main{
  public static void main(String[] args){
    String input="Gaumukhi plots are plots that are small in the front and broad in the back, like the face of a cow, according to Vastu Shastra. Shermukhi plots, on either hand, are large in the front and short in the back, like the face of a lion.";
    String flag="false";
    int countsentance=1;
    for(int i=0;i<input.length ()-1; i++ ){
    if(input.charAt(i)==6){
    flag="true";
    }
    countsentance++;
    }
    System.out.println(countsentance);
    System.out.println(flag);
    }
    }
    
    
    
    
    
