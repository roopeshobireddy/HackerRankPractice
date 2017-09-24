package algorithms.greedy;

import java.util.Scanner;

public class MinAbsDiffInArray {

	static int minimumAbsoluteDifference(int n, int[] arr) {
        // Complete this function
		int minAbsDiff=Math.abs(arr[0]-arr[1]);
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
				int diff = Math.abs(Math.abs(arr[i])-Math.abs(arr[j]));
				if(diff<minAbsDiff){
					minAbsDiff =diff;
				}
				
			}
		}
		return minAbsDiff;
    }
	
	static int fact(int n){
		int fact;
		if(n==1){
			return 1;
		}
		fact= n*fact(n-1);
		return fact;
	}

	public static void main(String[] args) {
		//System.out.println(fact(10));
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for(int arr_i = 0; arr_i < n; arr_i++){
			arr[arr_i] = in.nextInt();
		}
		int result = minimumAbsoluteDifference(n, arr);
		System.out.println(result);
		in.close();
	}

}
