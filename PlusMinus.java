package algorithms.warmup;
import java.text.DecimalFormat;
import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
		int negCnt=0;
		int posCnt=0;
		int zeroCnt=0;
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		for(int arr_i=0; arr_i < n; arr_i++){
			int iVal =in.nextInt();
			arr[arr_i] = iVal;
			if(iVal>0){
				posCnt++;
			}else if(iVal<0){
				negCnt++;
			}else{
				zeroCnt++;
			}
		}
		DecimalFormat df = new DecimalFormat("0.000000"); 
		
		System.out.println(df.format(posCnt*1.0/n));
		System.out.println(df.format(negCnt*1.0/n));
		System.out.println(df.format(zeroCnt*1.0/n));
		
		
	}

}
