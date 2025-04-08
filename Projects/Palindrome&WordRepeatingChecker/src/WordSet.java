import java.util.ArrayList;

public class WordSet{
    private ArrayList<String>words;
    public WordSet(){
        this.words= new ArrayList<>();
    }
    public boolean contains(String word){
        return this.words.contains(word);
    }
    
    public void add(String word){
        this.words.add(word);
    }
    public int palindromes(){
        int count =0;
        for(String word:this.words){
            if(isPalindrome(word)){
                count++;
            }
        }
        return count++;
    }
    public boolean isPalindrome(String word){
        int end= word.length()-1;
        
        for(int i=0, j=end ;i<word.length()/2;i++, j--){
            if(word.charAt(i) != word.charAt(j)){
                return false;
            }
        }
        return true;
    }
    
}