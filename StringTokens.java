package java1.strings1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * Given a string, , matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens. We define a token to be one or more consecutive English alphabetic letters. Then, print the number of tokens, followed by each token on a new line.

Input Format

A single string, s.
Constraints

 is composed of any of the following: English alphabetic letters, blank spaces, exclamation points (!), commas (,), question marks (?), periods (.), underscores (_), apostrophes ('), and at symbols (@).
Output Format

On the first line, print an integer,n, denoting the number of tokens in string s (they do not need to be unique). Next, print each of the n tokens on a new line in the same order as they appear in input string s.

Sample Input

He is a very very good boy, isn't he?
Sample Output

10
He
is
a
very
very
good
boy
isn
t
he
Explanation

We consider a token to be a contiguous segment of alphabetic characters. There are a total of 10 such tokens in string s, and each token is printed in the same order in which it appears in string s.
 */
public class StringTokens {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		// Write your code here.
		printTokens(s);
		scan.close();
		//printTokens1("");
	}

	private static void printTokens(String s) {
		List<String> tokens = new ArrayList<String>();
		StringTokenizer st= new StringTokenizer(s, " ");
		while(st.hasMoreTokens()){
			String tkn = st.nextToken();
			if(tkn.contains("'")){
				StringTokenizer sst= new StringTokenizer(tkn, "'");
				while(sst.hasMoreTokens()){
					tokens.add(sst.nextToken());
				}
			}else if(tkn.contains("!")){
				StringTokenizer sst= new StringTokenizer(tkn, "!");
				while(sst.hasMoreTokens()){
					tokens.add(sst.nextToken());
				}
			}else if(tkn.contains(",")){
				StringTokenizer sst= new StringTokenizer(tkn, ",");
				while(sst.hasMoreTokens()){
					tokens.add(sst.nextToken());
				}
			}else if(tkn.contains("?")){
				StringTokenizer sst= new StringTokenizer(tkn, "?");
				while(sst.hasMoreTokens()){
					tokens.add(sst.nextToken());
				}
			}else if(tkn.contains(".")){
				StringTokenizer sst= new StringTokenizer(tkn, ".");
				while(sst.hasMoreTokens()){
					tokens.add(sst.nextToken());
				}
			}else if(tkn.contains("_")){
				StringTokenizer sst= new StringTokenizer(tkn, "_");
				while(sst.hasMoreTokens()){
					tokens.add(sst.nextToken());
				}
			}else if(tkn.contains("@")){
				StringTokenizer sst= new StringTokenizer(tkn, "@");
				while(sst.hasMoreTokens()){
					tokens.add(sst.nextToken());
				}
			}else{
				tokens.add(tkn);	
			}
		}
		System.out.println(tokens.size());
		for(String str:tokens){
			System.out.println(str);
		}
	}
}
