package com.qa.testdrivendevelopment;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class Questions {
//
	public String greetingExample(String name) {
		String answer = "Hi " + name;
		return answer;
	}

//
	public String multiChar(String input) {
		int stringLength = input.length();
		String answer = "";
		for (int i = 0; i < stringLength; i++) {
			answer += input.substring(i, i + 1) + input.substring(i, i + 1) + input.substring(i, i + 1);
		}
		return answer;
	}

//
	public String sandwichFilling(String sandwich) {
		sandwich = sandwich.toLowerCase();
		String answer = "";
		int start = sandwich.indexOf("b");
		int finish = sandwich.lastIndexOf("b");
		for (int i = finish - 1; i >= start + 5; i--) {
			answer += sandwich.substring(i, i + 1);
		}
		return answer;
	}

//
	public boolean evenlySpaced(int a, int b, int c) {
		boolean answer = false;
		List<Integer> lList = new ArrayList<Integer>();
		lList.add(a);
		lList.add(b);
		lList.add(c);
		Collections.sort(lList);
		int diff1 = Math.abs(lList.get(0) - lList.get(1));
		int diff2 = Math.abs(lList.get(1) - lList.get(2));
		if (diff1 == diff2) {
			answer = true;
		}
		return answer;
	}

//
	public String nMid(String input, int n) {
		int strlength = input.length();
		int middle = (strlength + 1) / 2;
		int variance = (n - 1) / 2;
		String answer = input.substring(0, middle - variance - 1) + input.substring(middle + variance);
		return answer;
	}

//
	public boolean endsJava(String input) {
		int strlength = input.length();
		boolean answer = false;
		if (input.substring(strlength - 1).toLowerCase().equals("a")
				& input.substring(strlength - 2, strlength - 1).toLowerCase().equals("v")
				& input.substring(strlength - 3, strlength - 2).toLowerCase().equals("a")
				& input.substring(strlength - 4, strlength - 3).toLowerCase().equals("j")) {
			answer = true;
		}
		return answer;
	}

//
	public int superBlock(String input) {
		int strlength = input.length();
		int answer = 0;
		int counter = 1;
		int j;
		input += " ";
		for (int i = 0; i < strlength - 1; i++) {
			if (input.substring(i, i + 1).equals(input.substring(i + 1, i + 2))) {
				j = i;
				while (input.substring(j, j + 1).equals(input.substring(j + 1, j + 2))) {
					counter += 1;
					j += 1;
				}
				if (counter > answer) {
					answer = counter;
				}
			}
			counter = 1;
		}
		return answer;
	}

//
	public int amISearch(String sentence) {
		int answer = 0;
		int strLength = sentence.length();
		sentence = " " + sentence.toLowerCase() + " ";
		for (int i = 1; i < strLength; i++) {
			try {
				if (sentence.substring(i - 1, i).equals(" ") & sentence.substring(i, i + 1).equals("a")
						& sentence.substring(i + 1, i + 2).equals("m") & sentence.substring(i + 2, i + 3).equals(" ")) {
					answer += 1;
				}
			} catch (Exception e) {
			}
		}
		return answer;
	}

//
	public String fizzBuzz(int number) {
		String answer = null;
		if (number % 3 == 0) {
			answer = "fizz";
			if (number % 5 == 0) {
				answer += "buzz";
			}
		} else {
			if (number % 5 == 0) {
				answer = "buzz";
			}
		}
		return answer;
	}

//
	public int largest(String input) {
		int answer = 0;
		int indexStart = 0;
		int parsedNumber = 0;
		int strLength = input.length();
		input += "  ";
		for (int i = 0; i < strLength + 1; i++) {
			if (input.substring(i, i + 1).equals(" ")) {
				String unit = input.substring(indexStart, i);
				for (int j = 0; j < unit.length(); j++) {
					parsedNumber += Integer.parseInt(unit.substring(j, j + 1));
				}
				if (parsedNumber > answer) {
					answer = parsedNumber;
				}
				parsedNumber = 0;
				indexStart = i + 1;
			}
		}
		return answer;
	}

//
	public boolean compares(String word, int index, char letter) {
		boolean answer = false;
		index -= 1;
		try {
			if (letter == word.charAt(index)) {
				answer = true;
			}
		} catch (Exception e) {

		}
		return answer;
	}
}
