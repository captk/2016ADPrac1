/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical1;

/**
 *
 * @author k
 */
import java.util.ArrayList;
import java.text.Collator;

public class WordList {

    private ArrayList<String> theWordList = new ArrayList<String>();

    public void addWord(String s) {
        theWordList.add(s);
    }

    /* Check point 5: complete the method below */
    public String getFirst() {

        /* Replace the return statement below with a statement
* that returns
* the first word of theWordList (the word at index 0).
* Hint: use the ArrayList method "get".
* If there is no first word (theWordList has no words in it),
* "-" should be returned.
         */
        if (theWordList.isEmpty()){
            return "-";
        }
        else{
            return theWordList.get(0);
        }
    }

    /* Check point 
6: complete the method below */
    public String getLast() {
        /* Replace the string "junk" with the
* last word of theWordList (the word
* at index size()
-
1). Hint: use the ArrayList method "get".
* If there is no last word (theWordList has no words in it),
* "
-
" should be returned.
         */
        if (theWordList.isEmpty()){
            return "-";
        }
        else{
            return theWordList.get(theWordList.size() - 1);
        }
        
    }
    
    //Task 7, lets do it!
    public void jesusSort(){
        
        //need something that implements the Comparator interface
        Collator jesus = Collator.getInstance();
        
        //let jesus do our sorting
        theWordList.sort(jesus);
    }
    
    //Task 8, jesus can't help me now...
    public double averageLength(){
        double sum = 0;
        int count = 0;      
        
        for (String str: theWordList){
            sum = sum + str.length();
            count++;
        }
        
        if (sum == 0){
            return 0;
        }
        else return sum/count;
    }
    
    public String toString() {
        return theWordList.toString();
    }
}
