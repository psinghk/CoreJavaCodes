package coms.sgs.string.program.test;

import java.util.HashMap;
import java.util.Scanner;

public class PrintFirstNonRepatedChracterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Please enter the input string :");
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		char c = firstNonRepeatedCharacter(s);
		System.out.println("The first non repeated character is :  " + c);
	}

	public static Character firstNonRepeatedCharacter(String str) {
		HashMap<Character, Integer> characterhashtable = new HashMap<Character, Integer>();
		// System.out.println(characterhashtable);
		int i, length;
		Character c;
		length = str.length(); // Scan string and build hash table
		for (i = 0; i < length; i++) {
			c = str.charAt(i);
			if (characterhashtable.containsKey(c)) {
				// increment count corresponding to c
				characterhashtable.put(c, characterhashtable.get(c) + 1);
				// System.out.println(characterhashtable);
			} else {
				characterhashtable.put(c, 1);
				// System.out.println(characterhashtable);
			}
		}
		// Search characterhashtable in in order of string str
		System.out.println(" the hashmap oibjrct is  " + characterhashtable);
		for (i = 0; i < length; i++) {
			c = str.charAt(i);
			if (characterhashtable.get(c) == 1)

				return c;
			// System.out.println(c);
		}
		return null;
		// throw new RuntimeException(" First Non repated chracter Are not
		// present:");
	}
}
