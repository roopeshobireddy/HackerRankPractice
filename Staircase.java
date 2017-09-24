package algorithms.warmup;

import java.util.Scanner;

/*
 *     *
 *    **
 *   ***
 *  ****
 */
public class Staircase {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		printStaircase(n,"#");
		printStaircase(4,"#");
	}

	private static void printStaircase(int size,String str) {
		for(int i=1;i<=size;i++){
		
			for(int j=size;j>0;j--){
				if(j>i){
					System.out.print(" ");	
				}else{
					System.out.print(str);
				}
			}
			System.out.println();
		}
	}

}
