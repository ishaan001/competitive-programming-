package bridgeProgram;

import java.util.Scanner;

public class WordSize {
	
	public static int formWord(int totalSymbols, int removedSizes, int[] removed) {
		int count =0;
		int j =0;
		int remain =0;
		for(int i=1; i<=totalSymbols; i++) {
			boolean flag = true;
			while(j<removedSizes){
				if(removed[j] == i) {
					flag = false;
					remain =0;
					j++;
					break;
				}
				else if(removed[j] < i) {
					j++;
				}
				else
					break;
			}
			if(flag) {
				count = (count+((remain+(2*i+1))/2))%1000000007;
				remain = (remain+(2*i+1))%2;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		/*Scanner sc =new Scanner(System.in);
		System.out.println("total symbols");
		int totalSymbols = sc.nextInt();
		System.out.println("no. of elements to be removed : removedSizes ");
		int removedSizes = sc.nextInt();
		int[] removed = new int[removedSizes];
		for(int i=0; i<removedSizes; i++) {
			removed[i] = sc.nextInt();
		}*/
		
		int totalSymbols = 4;
		int removedSizes = 2;
		int[] removed = {1,3};
		
		int result = formWord(totalSymbols, removedSizes, removed);
		System.out.println(result);
		
		
		
	}

}
