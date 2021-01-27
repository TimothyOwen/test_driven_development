<h1>Test Driven Development</h1>

<h3>Contains two exercises:</h3>	
Standalone Test driven development exercise utilising JUnit provided by trainer.(#Standalone)
Test driven development exercise found on QA community.(#Community)

*<h2 id="Standalone">Questions Exercise</h2>*

1. *multiChar*

 	Given a string, return a string where for every char in the original string, there are three chars.	
	
 	For Example:	
 	* multChar("The") → "TTThhheee"	
 	* multChar("AAbb") → "AAAAAAbbbbbb"	
	* multChar("Hi-There") → "HHHiii---TTThhheeerrreee"	
   
   

2. *sandwichFilling*


	Return the string (backwards) that is between the first and last appearance  
	of "bread" in the given string, or return the empty string "" if there is not  
	2 occurances of "bread". Ignore Case.	
	
	For Example:	
	* sandwichFilling("breadclivebread") → "evilc"
	* sandwichFilling("xxbreadfridgebreadyy") → "egdirf"
	* sandwichFilling("xxBreadfridgeBReAdyy") → "egdirf"
	* sandwichFilling("xxbreadyy") → "" sandwichFilling("xxbreADyy") → ""	
	HINT: "a" == "a" if false HINT: "a".equals("a") is true  

   

3. *evenlySpaced*


	 Given three ints, a b c, one of them is small, one is medium and one is  
	 large. Return true if the three values are evenly spaced, so the difference  
	 between small and medium is the same as the difference between medium and  
	 large. Do not assume the ints will come to you in a reasonable order.	

	 For Example:	
	 * evenlySpaced(2, 4, 6) → true<br>
	 * evenlySpaced(4, 6, 2) → true<br>
	 * evenlySpaced(4, 6, 3) → false<br>
	 * evenlySpaced(4, 60, 9) → false
   

4. *nMid*	

	
	 Given a string and an int n, return a string that removes n letters from	
	 the'middle' of the string. The string length will be at least n. The input	
	 string will have an odd number of letters. n will always be an odd	
	 number.	
	 
	 For Example:	
	 * nMid("Hello", 3) → "Ho"
	 * nMid("Chocolate", 3) → "Choate"
	 * nMid("Chocolate", 1) → "Choclate"
   
5. *endsJava*  

	 Given a string, return the boolean True if it ends in "java" and False if
	 does not end in "java". Ignore Case.	
	 
	 For Example:	
	 * endsJava("ilovejava") → true
	 * endsJava("iloveJaVa") → true
	 * endsJava("welovejava") → true
	 * endsJava("welovejavamoreeveryday") → false
	 * endsJava("javaiscool") → false
	 * endsJava("pythoniscool") → false

6. *superBlock*  

	 Given a string, return the length of the largest "block" in the string. A	
	 block is a run of adjacent chars that are the same, do not ignore case.	
	 
	 For Example:	
	 * superBlock("hooopplla") → 3	
	 * superBlock("abbCCCddDDDDeeEEE") → 4	
	 * superBlock("abbCCCCC")) → 5	
	 * superBlock("") → 0	
	 
	 HINT: "a" == "a" if false HINT: "a".equals("a") is true
	

7. *amISearch* 
	
	Given a string - return the number of times "am" appears in the String	
	ignoring case - BUT ONLY WHEN the word "am" appears without being followed or	
	preceded by other letters.		
	
	For Example:	
	* amISearch("Am I in Amsterdam") → 1	
	* amISearch("I am in Amsterdam am I?") → 2	
	* amISearch("I have been in Amsterdam") → 0		
	HINT: String.toLowerCase

8. *fizzBuzz*  

	 Given a number if this number is divisible by 3 return "fizz" if this number	
	 is divisible by 5 return "buzz" if this number is divisible by both 3 and 5	
	 return "fizzbuzz" if this number is not divisible by 3 or 5 return null.	
	 
	 For Example:	
	 
	 fizzBuzz(3) → "fizz"	
	 
	 fizzBuzz(10) → "buzz"	
	 
	 fizzBuzz(15) → "fizzbuzz"	
	 
	 fizzBuzz(8) → null	
	
9. *largest*

	 Given a string, split the string into the individual numbers present then add
	 each digit of each number to get a final value for each number.	

	 String example = "55 72 86"	
	 "55" will = the integer 10	
	 "72" will = the integer 9	
	 "86" will = the integer 14	
	 You then need to return the highest vale	
	 
	 For Example:		
	 * largest("55 72 86") → 14
	 * largest("15 72 80 164") → 11	
	 * largest("555 72 86 45 10") → 15	
	 HINT: Integer.parseInt
	 
	 

10. *compares*  

	 Given a string, int and a char, return a boolean value if the 'nth'	
	 (represented by the int provided) char of the String supplied is the same as		
	 the char supplied. The int provided will NOT always be less than than the		
	 length of the String. Ignore case and Whitespace.	
	 
	 For Example:		
	 * compares("The",2,'h') → true
	 * compares("AAbb",1,'b') → false
	 * compares("Hi-There",10,'e') → false	

	 HINT: String.charAt  
	 
	 
	 
*<h2 id="Community">QA Community Test Driven Development Exercise</h2>*	

Using the following test class, write the code needed to fulfill each test class so that it passes.
The method should check that the String value passed to it is a valid email address.	

```java
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EmailTest {

    private Email email;

    @Before
    public void setUp() {
        email = new Email();
    }

    @Test
    public void testIsValidEmailGreenPath() {
        boolean actual = email.isValidEmail("firstName.surname@qa.com");
        assertTrue(actual);
    }

    @Test
    public void testIsValidEmailGreenPathDifferentDomainName() {
        boolean actual = email.isValidEmail("firstNameSurname@gmail.com");
        assertTrue(actual);
    }

    @Test
    public void testIsValidEmailRedPathDomainTooLong() {
        boolean actual = email.isValidEmail("firstName.surname@qa.helloWorld");
        assertFalse(actual);
    }

    @Test
    public void testIsValidEmailRedPathNoAddress() {
        boolean actual = email.isValidEmail("@qa.com");
        assertFalse(actual);
    }

    @Test
    public void testIsValidEmailRedPathNoDomainName() {
        boolean actual = email.isValidEmail("firstName.surname@com");
        assertFalse(actual);
    }

    @Test
    public void testIsValidEmailRedPathSpecialCharacterAtBeginning() {
        boolean actual = email.isValidEmail("_firstName.surname@qa.com");
        assertFalse(actual);
    }

    @Test
    public void testIsValidEmailRedPathSpecialCharacterAtEnd() {
        boolean actual = email.isValidEmail("firstName.surname@qa.com)");
        assertFalse(actual);
    }
}
```


