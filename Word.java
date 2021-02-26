//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ethan Song

import static java.lang.System.*;

public class Word
{
   private static String vowels = "AEIOUaeiou";   	//change to string later
   														                  		//why is it static?
   
    //add an instance variable
    private String s;

	  //create 2 constructors
    public Word(){
      s = "";
    }

    public Word(String word){
      s = word;
    }

    //setter method
    public void setWord(String word){
      s = word;
    }

    //getter method
    public String getWord(){
      return s;
    }

    //getNumVowels
    public Integer getNumVowels(){
      //create an integer called vowelNum set to 0
      int vowelNum = 0;

      //for int x is 0, x should be less than word length, and added one
      for(int x = 0; x < s.length(); x++){

        //for int y is 0, y should be less than vowels length, and added one
        for(int y = 0; y < vowels.length(); y++){

          //create string called wordChar set to char at x
          char wordChar = s.charAt(x);
          //create string called vowelChar set to char at y
          char vowelChar = vowels.charAt(y);

          //if s character at x is equal to vowel character at y
          if(wordChar == vowelChar){
            //add one to vowel nums 
            vowelNum++;
          }
        }
      }

      return vowelNum;

    }


    //getLength
    public Integer getLength(){
      //return word length
      return s.length();
    }


	  //create a toString method
    public String toString(){
      String output = "String: " + s;
      return output;
    }

    
}