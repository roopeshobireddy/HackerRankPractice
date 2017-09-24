package java1.strings1;

import java.util.Scanner;

/**
A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.(Wikipedia)
Given a string A, print Yes if it is a palindrome, print No otherwise.

Constraints

A will consist at most 50 lower case english letters.
Sample Input

madam
Sample Output

Yes    
 *
 */
public class StringReverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
        StringBuffer sb=new StringBuffer(A);
        sb=sb.reverse();
        if(A.equalsIgnoreCase(sb.toString())){
        	System.out.println("Yes");
        }else{
        	System.out.println("No");
        }
	}

}
