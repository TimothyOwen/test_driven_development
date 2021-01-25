package com.qa.testdrivendevelopment;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class Questions {

	/**
	 * EXAMPLE: THIS ONE HAS BEEN DONE FOR YOU <br>
	 * 
	 * Given a name, return "Hi" plus the name <br>
	 * <br>
	 * For Example:<br>
	 * greetingExample("John") → "Hi John" <br>
	 * greetingExample("Matt") → "Hi Matt" <br>
	 * greetingExample("Angelica") → "Hi Angelica"
	 * 
	 */
	public String greetingExample(String name) {
		return "Hi " + name;
	}

	/**
	 * Given a string, return a string where for every char in the original string,
	 * there are three chars.<br>
	 * <br>
	 * 
	 * For Example:<br>
	 * multChar("The") → "TTThhheee"<br>
	 * multChar("AAbb") → "AAAAAAbbbbbb"<br>
	 * multChar("Hi-There") → "HHHiii---TTThhheeerrreee"
	 */
	public String multiChar(String input) {
		int stringLength = input.length();
		String answer = "";
		for(int i=0; i<stringLength; i++) {
			answer += input.substring(i,i+1) + input.substring(i,i+1) + input.substring(i,i+1);
		}
		return answer;
	}

	/**
	 * Return the string (backwards) that is between the first and last appearance
	 * of "bread" in the given string, or return the empty string "" if there is not
	 * 2 occurances of "bread". Ignore Case<br>
	 * <br>
	 * For Example: sandwichFilling("breadclivebread") → "evilc"<br>
	 * sandwichFilling("xxbreadfridgebreadyy") → "egdirf"<br>
	 * sandwichFilling("xxBreadfridgeBReAdyy") → "egdirf"<br>
	 * sandwichFilling("xxbreadyy") → "" sandwichFilling("xxbreADyy") → ""<br>
	 * <br>
	 * HINT: "a" == "a" if false HINT: "a".equals("a") is true
	 */

	public String sandwichFilling(String sandwich) {
		sandwich = sandwich.toLowerCase();
		String answer = "";
		int start = sandwich.indexOf("b");
		int finish = sandwich.lastIndexOf("b");
		for(int i=finish-1; i>=start+5; i--) {
			answer += sandwich.substring(i,i+1);
		}
		return answer;
	}

	/**
	 * Given three ints, a b c, one of them is small, one is medium and one is
	 * large. Return true if the three values are evenly spaced, so the difference
	 * between small and medium is the same as the difference between medium and
	 * large. Do not assume the ints will come to you in a reasonable order.<br>
	 * <br>
	 * For Example:<br>
	 * evenlySpaced(2, 4, 6) → true<br>
	 * evenlySpaced(4, 6, 2) → true<br>
	 * evenlySpaced(4, 6, 3) → false<br>
	 * evenlySpaced(4, 60, 9) → false
	 */
	public boolean evenlySpaced(int a, int b, int c) {
		boolean answer = false;
		List<Integer> lList = new ArrayList<Integer>();
		lList.add(a);       
        lList.add(b);
        lList.add(c);
		Collections.sort(lList);
		int diff1 = Math.abs(lList.get(0)-lList.get(1));
		int diff2 = Math.abs(lList.get(1)-lList.get(2));
		if(diff1 == diff2) {answer = true;}
		return answer;
	}

	/**
	 * Given a string and an int n, return a string that removes n letters from
	 * the'middle' of the string. The string length will be at least n. The input
	 * string will have an odd number of letters. n will always be an odd
	 * number.<br>
	 * <br>
	 * For Example:<br>
	 * nMid("Hello", 3) → "Ho"<br>
	 * nMid("Chocolate", 3) → "Choate"<br>
	 * nMid("Chocolate", 1) → "Choclate"<br>
	 */
	public String nMid(String input, int n) {
		int strlength = input.length();
		int middle = (strlength+1)/2;
		int minus = (n-1)/2;
		String answer = input.substring(0,middle-minus-1) + input.substring(middle+minus);
		return answer;
	}

	/**
	 * Given a string, return the boolean True if it ends in "java" and False if
	 * does not end in "java". Ignore Case.<br>
	 * <br>
	 * For Example: <br>
	 * endsJava("ilovejava") → true <br>
	 * endsJava("iloveJaVa") → true <br>
	 * endsJava("welovejava") → true <br>
	 * endsJava("welovejavamoreeveryday") → false <br>
	 * endsJava("javaiscool") → false <br>
	 * endsJava("pythoniscool") → false <br>
	 */
	public boolean endsJava(String input) {
		int strlength = input.length();
		boolean answer = false;
		if(input.substring(strlength-1).toLowerCase().equals("a") &
					input.substring(strlength-2,strlength-1).toLowerCase().equals("v") &
					input.substring(strlength-3,strlength-2).toLowerCase().equals("a") &
					input.substring(strlength-4,strlength-3).toLowerCase().equals("j")
					) {
			answer = true;
		}
		return answer;
	}

	/**
	 * Given a string, return the length of the largest "block" in the string. A
	 * block is a run of adjacent chars that are the same, do not ignore case.<br>
	 * <br>
	 * For Example: superBlock("hooopplla") → 3 <br>
	 * superBlock("abbCCCddDDDDeeEEE") → 4 <br>
	 * superBlock("abbCCCCC")) → 5 <br>
	 * superBlock("") → 0 <br>
	 * <br>
	 * HINT: "a" == "a" if false HINT: "a".equals("a") is true
	 */
	public int superBlock(String input) {
		int strlength = input.length();
		input += " ";
		int answer = 0;
		int counter = 1;
		int j;
		System.out.println(input);
		for(int i=0; i<strlength-1; i++) {
			if(input.substring(i,i+1).equals(input.substring(i+1,i+2))) {
				j = i;
				while(input.substring(j,j+1).equals(input.substring(j+1,j+2))) {
					System.out.println(input.substring(j,j+1));
					counter += 1;
					j +=1;
					System.out.println(counter);
				}
				if(counter>answer) {answer=counter;}
			}
			counter = 1;
		}
		System.out.println(answer);
		return answer;
	}

	/**
	 * Given a string - return the number of times "am" appears in the String
	 * ignoring case - BUT ONLY WHEN the word "am" appears without being followed or
	 * preceded by other letters <br>
	 * <br>
	 * For Example: <br>
	 * amISearch("Am I in Amsterdam") → 1 <br>
	 * amISearch("I am in Amsterdam am I?") → 2 <br>
	 * amISearch("I have been in Amsterdam") → 0 <br>
	 * <br>
	 * HINT: String.toLowerCase
	 */
	public int amISearch(String sentence) {
		int answer = 0;
		int length = sentence.length();
		sentence = " " + sentence.toLowerCase() + " ";
		for(int i=1; i<length; i++) {
			try {
				if(sentence.substring(i,i+1).equals("a")
						& sentence.substring(i+1,i+2).equals("m")
						& sentence.substring(i+2,i+3).equals(" ")
						& sentence.substring(i-1,i).equals(" ")
						) {
					answer += 1;
				}}
			catch(Exception e) {}
		}
		return answer;
	}

	/**
	 * Given a number if this number is divisible by 3 return "fizz" if this number
	 * is divisible by 5 return "buzz" if this number is divisible by both 3 and 5
	 * return "fizzbuzz" if this number is not divisible by 3 or 5 return null<br>
	 * <br>
	 * For Example: <br>
	 * fizzBuzz(3) → "fizz" <br>
	 * fizzBuzz(10) → "buzz" <br>
	 * fizzBuzz(15) → "fizzbuzz" <br>
	 * fizzBuzz(8) → null
	 */
	public String fizzBuzz(int number) {
		String answer = null;
		if(number%3==0) {
			answer = "fizz";
			if(number%5==0) {answer += "buzz";}
		}else {
			if(number%5==0) {answer = "buzz";}
		}
		return answer;
	}

	/**
	 * Given a string, split the string into the individual numbers present then add
	 * each digit of each number to get a final value for each number <br>
	 * <br>
	 * String example = "55 72 86"<br>
	 * <br>
	 * "55" will = the integer 10 <br>
	 * "72" will = the integer 9 <br>
	 * "86" will = the integer 14 <br>
	 * <br>
	 * You then need to return the highest vale <br>
	 * <br>
	 * For Example: <br>
	 * largest("55 72 86") → 14 <br>
	 * largest("15 72 80 164") → 11 <br>
	 * largest("555 72 86 45 10") → 15 <br>
	 * <br>
	 * HINT: Integer.parseInt
	 */

	public int largest(String input) {
		int start=0;
		int answer=0;
		int number=0;
		int length=input.length();
		input += "  ";
		for(int i=0; i<length+1; i++) {
			if(input.substring(i,i+1).equals(" ")){
				String unit = input.substring(start,i);
				for(int j=0; j<unit.length(); j++) {
					number += Integer.parseInt(unit.substring(j,j+1));
				}
				if(number>answer) {answer=number;}
				number = 0;
				start = i+1;	
			}	
		}
		return answer;
	}

	/**
	 * Given a string, int and a char, return a boolean value if the 'nth'
	 * (represented by the int provided) char of the String supplied is the same as
	 * the char supplied. The int provided will NOT always be less than than the
	 * length of the String. Ignore case and Whitespace. <br>
	 * <br>
	 * For Example: <br>
	 * compares("The",2,'h') → true <br>
	 * compares("AAbb",1,'b') → false <br>
	 * compares("Hi-There",10,'e') → false <br>
	 * <br>
	 * HINT: String.charAt
	 */
	public boolean compares(String word, int index, char letter) {
		boolean answer = false;
		index -= 1;
		try {
			if(letter == word.charAt(index)) {
				answer = true;
			}
		}catch(Exception e) {
			
		}
		return answer;
	}
}
