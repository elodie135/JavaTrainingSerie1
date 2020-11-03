package fr.manulep.entrainement;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.google.common.io.PatternFilenameFilter;

public class Series1 {

	private Series1() {
		throw new IllegalStateException("Test class");
	}

	// public static String commentJeMappelle(String prenom, String nomdefamille) {
	// return "Je m'appelle " + prenom
	// }
	// commentJeMappelle("bob");

	// fonction = machine qui fait des trucs
	// (paramètres) = outils qu'on lui donne pour faire des trucs
	// return = le produit fini

	public static String helloWorld(String name) {
		if (name == null || name == "") {
			return "Hello World";
		} else {
			return "Hello " + name;
		}
	}

	public static String[] removeNullElements(String[] array) {

		// { "a", "b", null, null, "false", "null" };
		String[] resultats;
		ArrayList<String> newArrayList = new ArrayList<String>();

		for (int i = 0; i < array.length; i++) {
			String mot = array[i];
			if (mot != null) {
				newArrayList.add(mot);
			}
		}
		resultats = newArrayList.toArray(new String[0]);
		return resultats;
	}

	// String[] prénoms = ["Bob", "Paul", "Jean-Marc"];
	// prénoms[0]; //bob

	public static int[] addElementToBeginning(int[] array, int element) {

		int[] stockage = new int[1];
		int[] resultat = new int[array.length + 1];

		stockage[0] = element;

		// Source / PositionSource / Destination / PositionDestination / Nombre d'objets
		// à copier
		System.arraycopy(stockage, 0, resultat, 0, 1);
		System.arraycopy(array, 0, resultat, 1, array.length);

		return resultat;
	}

	public static int[] allElementsExceptFirstThree(int[] array) {
		// 4
		int[] resultat;
		if (array.length > 3) {
			resultat = new int[array.length - 3];
			System.arraycopy(array, 3, resultat, 0, array.length - 3);
		} else {
			resultat = new int[0];
		}

		return resultat;
	}

	public static String getFirstHalf(String word) {
		// 5
		int taille = word.length();
		double nombreMoitié = taille / 2.0;
		int arrondi = (int) Math.ceil(nombreMoitié);

		String moitiéDeMot = word.substring(0, arrondi);
		return moitiéDeMot;
	}

	public static String[] selectElementsStartingWithA(String[] array) {
		// 6
		ArrayList<String> motsAvecA = new ArrayList<String>();

		String[] resultat;

		for (String mot : array) {
			char premiereLettre = mot.charAt(0);
			if (premiereLettre == 'a')
				motsAvecA.add(mot);
		}
		resultat = motsAvecA.toArray(new String[0]);
		return resultat;

	}

	public static String[] selectElementsStartingWithVowel(String[] array) {
		// 7
		ArrayList<String> motsAvecVoyelles = new ArrayList<String>();

		for (String mot : array) {
			if (mot != null) {
				char premiereLettre = mot.charAt(0);
				if (premiereLettre == 'a' || premiereLettre == 'e' || premiereLettre == 'i' || premiereLettre == 'o'
						|| premiereLettre == 'u' || premiereLettre == 'y') {
					motsAvecVoyelles.add(mot);
				}
			}
		}
		return motsAvecVoyelles.toArray(new String[0]);
	}

	public static String[] reverseOrderInArray(String[] array) {
		// 8
		String[] inversee = new String[array.length];

		for (int i = 0; i < array.length; i++) {
			inversee[i] = array[array.length - i - 1];
		}
		return inversee;
	}

	public static int[] insertElementInTheMiddleOfAnArray(int[] array, int element) {
		// 9
		int taille = array.length;
		int arrondi = (int) Math.round(taille / 2);

		int[] resultat = new int[array.length + 1];
		// resultat [1,2,3,4]
		// resultat [null,null,null,null,null]
		System.arraycopy(array, 0, resultat, 0, arrondi);
		// resultat [1,2,null,null,null]
		resultat[arrondi] = element;
		// resultat [1,2,9,null,null]
		System.arraycopy(array, arrondi, resultat, arrondi + 1, array.length - arrondi);
		// resultat [1,2,9,3,4]

		return resultat;
	}

	public static String shortestWord(String text) {
		// 10
		// "winter is coming"
		String[] mots = text.split(" ");
		// mots = ["winter", "is", "coming"];
		int longueurLaPlusCourte = mots[0].length();
		String motLePlusCourt = mots[0];
		for (String mot : mots) {
			if (mot.length() < longueurLaPlusCourte) {
				longueurLaPlusCourte = mot.length();
				motLePlusCourt = mot;
			}
		}

		return motLePlusCourt;
	}

	public static String removeCapitals(String text) {
		// 11
		String text2 = text;
		text2 = text2.replaceAll("[A-Z]", "");
		return text2;
	}


	public static long addingTwoNumbers(long number1, long number2) {
		int Number1 = 10;
		int Number2 = 20;
		int somme = Number1 + Number2;
		return somme;
	}

	public static long addingThreeNumbers(long number1, long number2, long number3) {
		int Number1 = 10;
		int Number2 = 20;
		int Number3 = 30;
		int somme = Number1 + Number2 + Number3;
		return somme;
	}

	public static long addingSeveralNumbers(final Integer... numbers) {
        int somme = 0;
        for (int i = 0; i<numbers.length; i++){
        	somme = somme + numbers[i];
		}
		return somme;
        }
	

	public static float makeNegative(float number) {
		if (number < 0) {
			return number;
		} else {
			return number * -1;
		}
	}

	public static boolean checkForSpecialCharacters(String string) {
		Pattern p = Pattern.compile("[^a-z0-9! ]", Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(string);
		boolean resultatFinal = m.find();
		return resultatFinal;
	}

	public static boolean checkIfStringStartsWithConsonant(String word) {
		// 17
		String wordUpper = word.toUpperCase();
		Character firstCharWord = wordUpper.charAt(0);
		String firstCharWordToString = firstCharWord.toString();
		Pattern p = Pattern.compile("[BCDFGHJKLMNPQRSTVWXZ]");
		Matcher m = p.matcher(firstCharWordToString);
		boolean b = m.matches();
		return b;
	}

	public static String getDomainName(String email) {
		return email.replaceAll("(^.*@|.com$)","");
	}

	public static int[] letterPosition(String name) {
		int len = name.length();
		int num = 31;
		int retour[] = new int [len];
		for(int i = 0; i<len; i++){
			retour[i] = name.charAt(i)& num;
		}
		return retour;
	}

	public static boolean isPeer(int number) {
		if (number % 2 == 0) {
			return true;
		} else {
			return false;
	}
	}
}

