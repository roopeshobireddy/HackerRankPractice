package algorithms.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author robiredd
 * 
 * HackerLand University has the following grading policy:

Every student receives a  in the inclusive range from  0 to 100 .
Any  less than  40 is a failing grade.
Sam is a professor at the university and likes to round each student's  according to these rules:

If the difference between the grade and the next multiple of  5 is less than 3, round  up to the next multiple of 5.
If the value of grade is less than 38, no rounding occurs as the result will still be a failing grade.
For example,  grade=84 will be rounded to  85 but grade=29 will not be rounded because the rounding would result in a number that is less than 40.

Given the initial value of  for each of Sam's  students, write code to automate the rounding process. For each , round it according to the rules above and print the result on a new line.

Input Format

The first line contains a single integer denoting  (the number of students). 
Each line  of the  subsequent lines contains a single integer, , denoting student 's grade.

Constraints
1<=n<=60
0<=grade<=100
Output Format

For each  of the n grades, print the rounded grade on a new line.

Sample Input 0

4
73
67
38
33
Sample Output 0

75
67
40
33
Explanation 0

image

Student 1 received a 73, and the next multiple of 5 from 73 is 75 . Since 75-73<3, the student's grade is rounded to 75 .
Student 2 received a 67, and the next multiple of 5 from 67 is 70. Since 70-67=3, the grade will not be modified and the student's final grade is 67 .
Student 3 received a 38, and the next multiple of 5 from 38 is 40. Since 40-38<3, the student's grade will be rounded to 40.
Student 4 received a grade below 38 , so the grade will not be modified and the student's final grade is 33 .
 *
 */
public class GradingStudents {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		List<Integer> list=new ArrayList<Integer>();
		for(int a0 = 0; a0 < n; a0++){
			int grade = in.nextInt();
			list.add(grade);
		}
		for(int val:list){
			System.out.println(getGrade(val));
		}
		
	}
	
	static int getGrade(int grade){
		if(grade<38 || grade%5==0){
			return grade;	
		}else {
			int nxt5Muliple = ((grade/5)+1)*5;
			if(nxt5Muliple-grade<3){
				return nxt5Muliple;
			}else{
				return grade;	
			}
		}
	}

}
