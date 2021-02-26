//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Words
{
	private ArrayList<Word> words;

	public Words(String[] wordList)
	{
    words = new ArrayList<Word>();
    for(String x: wordList){
      Word one = new Word(x);
      words.add(one);
    }
	}

	public int countWordsWithXChars(int size)
	{
		
		//create int count set to 0
    int count=0;

    //for each loop with string x
    for(Word x: words){

      //if getLength of x is equal to parameter value
      if(x.getLength() == size){
        //add one to count
        count++;
      }
      
    //end for loop
    }

    //return count
    return count;

	}
	
	//this method will remove all words with a specified size / length
	//this method will also return the sum of the vowels in all words removed
	public int removeWordsWithXChars(int size)
	{
    //create int vowels set to 0
    int vowels = 0;

    //create array list store 
    ArrayList<Word> storeChar = new ArrayList();

    //for int x = 0, x < array.size, x++
    for(int x = 0; x < words.size(); x++){

      //if length of array string at x is equal to parameter
      if(words.get(x).getLength() == size){
        //add getNumVowels to vowels
        vowels = vowels + words.get(x).getNumVowels();
        //remove string at array list
        storeChar.add(words.get(x));
        
      }

      //end for loop
    }

    //for int x = 0, x < storeChar.size(), x++
    for(int x = 0; x < storeChar.size(); x++){

      //remove storeChar values from words
      words.remove(storeChar.get(x));
    }
     
    //return vowels
		return vowels;
	}

	public int countWordsWithXVowels(int numVowels)
	{
    //create int count set at 0
    int count=0;

    //for each loop with string x
    for(Word x: words){

      //if getNumVowels of x is equal to parameter value
      if(x.getNumVowels() == numVowels){
        //add 1 to count
        count++;
        
      }
      //end for each loop
    }
    
    //return output
		return count;
	}
	
	//add in a toString
  public String toString(){
    return "Array List: " + words;
  }
}