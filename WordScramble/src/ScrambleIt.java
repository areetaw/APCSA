//Scrambles a given word
//@param word the word to be scrambled
//@return the scrambled word possibly equal to word)
//Postcondition: the string returned was created from word as follows
//				- the word was scrambled, beginning with the first letter and continuing *   from left to right
//              - two consecutive letters consisting of “A” followed by a letter that was not “A” were swapped
//				- letters were swapped at most once

import java.io.FileNotFoundException;
public class ScrambleIt {

	public static void main(String[] args) throws FileNotFoundException{
		System.out.println(scrambleIt("TAN"));
		System.out.println(scrambleIt("ABRACADABRA"));
		System.out.println(scrambleIt("WHOA"));
		System.out.println(scrambleIt("AARDVARK"));
		System.out.println(scrambleIt("EGGS"));
		System.out.println(scrambleIt("A"));
		System.out.println(scrambleIt(""));
	}
	
	public static String scrambleIt(String word) 
	{
		int wordLength = word.length();
		for (int letter = 1; letter < wordLength; letter++) {
			if (word.substring(letter-1, letter).equals("A") && !(word.substring(letter, letter+1).equals("A"))) 
			{
				word = word.substring(0, letter-1) + word.substring(letter, letter+1) + word.substring(letter-1, letter)  + word.substring(letter+1) ;
				letter++;
			}
		}
	return word;
	}
}
