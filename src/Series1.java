package fr.manulep.entrainement;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.google.common.io.PatternFilenameFilter;

public class Series1 {

	private Series1() {
		throw new IllegalStateException("Test class");
	}

	public static String helloWorld(String name) {
		// String name = name;
		if ((name == null) || (name == "")) {
			return "Hello World";
		} else {
			return "Hello " + name;
		}
	}

	public static String[] removeNullElements(String[] array) {
		int [] list;
		for (int i = 0; i < array.length; i++)
			if (array != null) {
				list[i] = array[i];
				
			} 
	}
	
}
	}


	/*
	 * String[] resultats; ArrayList<String> newArrayList = new ArrayList<String>();
	 * 
	 * for( int i = 0;i<array.length;i++) { String mot = array[i]; if (mot != null)
	 * { newArrayList.add(mot); } }resultats=newArrayList.toArray(new
	 * String[0]);return resultats;
	 */

	public static int[] addElementToBeginning(int[] array, int element) {
	}

	public static int[] allElementsExceptFirstThree(int[] array) {
	}

	public static String getFirstHalf(String word) {
	}

	public static String[] selectElementsStartingWithA(String[] array) {
	}

	public static String[] selectElementsStartingWithVowel(String[] array) {
	}

	public static String[] reverseOrderInArray(String[] array) {
	}

	public static int[] insertElementInTheMiddleOfAnArray(int[] array, int element) {
	}

	public static String removeCapitals(String text) {
	}

	public static long addingTwoNumbers(long number1, long number2) {
	}

	public static long addingThreeNumbers(long number1, long number2, long number3) {
	}

	public static long addingSeveralNumbers(final Integer... numbers) {
	}

	public static float makeNegative(float number) {
	}

	public static boolean checkForSpecialCharacters(String string) {
	}

	public static boolean checkIfStringStartsWithConsonant(String word) {
	}

	public static String getDomainName(String email) {
	}

	public static int[] letterPosition(String name) {
	}

	public static boolean isPeer(int number) {
	}
}
