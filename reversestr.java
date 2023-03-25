class HelloWorld {
    
    public static String str="muneera is a good dancer";
    //convert str into arr;
    
    public static char[] arr = str.toCharArray();
    
    public static void main(String[] args)
    {
         System.out.println(arr);
        System.out.println(wordcount( 11 , arr ) );
        System.out.println(arr);
        ReverseSubString(0, arr.length-1,arr);
        System.out.println(arr);
     
    int wordstart=0;
    int wordend=0;
    
        while((wordend = wordcount ( wordstart , arr)) != -1)
        {
          ReverseSubString(wordstart , wordend-1 ,arr);
          wordstart = wordend + 1;
          
      }
      System.out.println(arr);
     }
     
     
    //word count
    public static int wordcount(int start ,char[] arr)
    {
        if(start >= arr.length){
            return -1;
        }
        int wordEnd = start;
        while( wordEnd <arr.length && arr[wordEnd] != ' ')
        {
          wordEnd++;
          
        }
    return wordEnd;
    }
    
    
    
    public static void ReverseSubString(int start , int end ,char[] arr)
    {
        if(arr == null)
        {
            return;
        }
        while (start <= end)
        {
            char temp = arr [start];
            arr [start] = arr [end];
            arr [end] = temp;
            start ++;
            end --;
        }
    }
    
}







// class HelloWorld {
    
//     public static String str="muneera is a good dancer";
//     //convert str into arr;
    
//     public static char[] arr = str.toCharArray();
    
//     public static void main(String[] args)
//     {
//          System.out.println(arr);
//         System.out.println(wordcount( 11 , arr ) );
//         System.out.println(arr);
//         ReverseSubString(0, arr.length-1,arr);
//         System.out.println(arr);
//         ReverseSubString(0,5,arr);
//          System.out.println(arr);
//         ReverseSubString(7 ,12 ,arr);
//         System.out.println(arr);
//         ReverseSubString(12,11 ,arr);
//         System.out.println(arr);
     
//     int wordstart=0;
//     int wordend=0;
    
//         while((wordend = wordcount ( wordstart , arr)) != -1)
//         {
//           ReverseSubString(wordstart , wordend-1 ,arr);
//           wordstart = wordend + 1;
          
//       }
//       //System.out.println(arr);
//      }
     
     
//     //word count
//     public static int wordcount(int start ,char[] arr)
//     {
//         if(start >= arr.length){
//             return -1;
//         }
//         int wordEnd = start;
//         while( wordEnd <arr.length && arr[wordEnd] != ' ')
//         {
//           wordEnd++;
          
//         }
//     return wordEnd;
//     }
    
    
    
//     public static void ReverseSubString(int start , int end ,char[] arr)
//     {
//         if(arr == null)
//         {
//             return;
//         }
//         while (start <= end)
//         {
//             char temp = arr [start];
//             arr [start] = arr [end];
//             arr [end] = temp;
//             start ++;
//             end --;
//         }
//     }
    
// }
