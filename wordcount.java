//Write a java program to count the number of sentences, with more than 6 words in a sentence in a paragraph.

class HelloWorld {
    public static void main(String[] args) {
        String paragraph = "This Is a Sentence. This is my second sentence. This is my third sentence and is very long. Bhavana gets too scared of long code in Bangalore.";
        //System.out.println(paragraph.length());
        
        int sentencesGt6words = 0;
        
        int sentenceStart = 0;
        int sentenceEnd = 0;
        while(true)
        {
            sentenceEnd = endOfSentance(sentenceStart, paragraph);
            
            if(sentenceEnd == -1)
            {
                break;
            }
            
            System.out.println(sentenceStart + " "  + sentenceEnd);

            int wordCount = returnWordCount(sentenceStart,sentenceEnd, paragraph);
            System.out.println(wordCount);
            sentenceStart = sentenceEnd;
            if(wordCount > 6)
            {
                sentencesGt6words++;
            }
        }
       
        System.out.println("Sentences greater than 6 words " + sentencesGt6words);
    }

    
    public static int returnWordCount(int sentenceStart, int sentenceEnd, String str)
    {
        int wordCount=0; 
        for(int i=sentenceStart;i<sentenceEnd;i++)
        {
            if(str.charAt(i)==' ')
            {
                wordCount++;
            }
        }
        
        if(sentenceStart == 0)
        {
            return wordCount+1;
        }
        
        return wordCount;
    }
    
    public static int endOfSentance(int sentenceStart, String paragraph)
    {
        int sentenceEnd = sentenceStart;
        
        if(sentenceEnd >= paragraph.length())
        {
            return -1;
        }
        
        while(paragraph.charAt(sentenceEnd) != '.')
        {
            sentenceEnd++;
        }
        
        return sentenceEnd + 1;
    }
}




