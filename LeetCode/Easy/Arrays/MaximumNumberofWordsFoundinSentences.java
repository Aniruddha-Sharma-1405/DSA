import java.util.*;

class MaximumNumberofWordsFoundinSentences{
    public static void main(String args[])
    {
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mn(sentences));
    }
    static int mn(String[] sentences)
    {
        int words=0;
        for(int i=0;i<sentences.length;i++)
        {
            String[] arr = sentences[i].split(" ");
            if(arr.length>words)
            {
                words=arr.length;
            }
        }
        return words;
    }
}