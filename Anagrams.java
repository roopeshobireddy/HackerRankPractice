package java1.strings1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Two strings A and B are called anagrams if they consist same characters but
 * may be in different orders. So the list of anagrams of CAT is
 * CAT,ACT,TAC,TCA,ATC,CTA.
 * 
 * Given two strings, print Anagrams if they are anagrams, print Not Anagrams if
 * they are not. The strings may consist at most English characters; the
 * comparison should NOT be case sensitive.
 * 
 * This exercise will verify that you can sort the characters of a string, or
 * compare frequencies of characters.
 * 
 * Sample Input 0
 * 
 * anagram margana Sample Output 0
 * 
 * Anagrams Sample Input 1
 * 
 * anagramm marganaa Sample Output 1:
 * 
 * Not Anagrams
 * 
 */
public class Anagrams {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
		
		String arr[][] = new String[3][3]; 
	}

	private static boolean isAnagram(String s1, String s2) {

		Map<String, Integer> cntMap1 = getCharCounts(s1);
		Map<String, Integer> cntMap2 = getCharCounts(s2);
		for (String k : cntMap1.keySet()) {
			if (cntMap1.get(k) == null || cntMap2.get(k) == null || cntMap1.get(k) != cntMap2.get(k)) {
				return false;
			}
		}
		return true;
	}

	private static Map<String, Integer> getCharCounts(String s1) {
		Map<String, Integer> cntMap = new HashMap<String, Integer>();
		for (int i = 0; i < s1.length(); i++) {
			String ch = "" + s1.charAt(i);
			if (cntMap.get(ch) == null) {
				cntMap.put(ch, 1);
			} else {
				cntMap.put(ch, cntMap.get(ch) + 1);
			}
		}
		return cntMap;
	}

}
