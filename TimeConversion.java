package algorithms.warmup;

import java.util.Scanner;
import java.util.StringTokenizer;

/*Given a time in -hour AM/PM format, convert it to military (-hour) time.

Note: Midnight is  on a -hour clock, and  on a -hour clock. Noon is  on a -hour clock, and  on a -hour clock.

Input Format

A single string containing a time in -hour clock format (i.e.:  or ), where  and .

Output Format

Convert and print the given time in -hour format, where .

Sample Input

07:05:45PM
Sample Output

19:05:45

*/
public class TimeConversion {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String time = in.next();

		System.out.println(convertTime(time));
	}

	private static String convertTime(String time) {
		StringTokenizer st = new StringTokenizer(time, ":");

		if(time.contains("PM")){
			String hrs = st.nextToken();
			if(hrs.equalsIgnoreCase("12")){
				return time.replaceAll("PM", "");
			}
			String hrs24= (Integer.parseInt(hrs)+12)+"";
			if(hrs24.equalsIgnoreCase("24")){
				hrs24="23";
			}
			time =time.replaceAll(hrs, hrs24);
			return time.replaceAll("PM", "");
		}else if(time.contains("AM")){
			String hrs = st.nextToken();
			if(hrs.equalsIgnoreCase("12")){
				String hrs24= (Integer.parseInt(hrs)-12)+"0";
				time =time.replaceAll(hrs, hrs24);
			}
			return time.replaceAll("AM", "");
		}
		return null;
	}

}
