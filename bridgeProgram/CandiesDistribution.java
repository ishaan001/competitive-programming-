package bridgeProgram;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class CandiesDistribution {
	
	public static int DistributeCandies(int N, int[]a ) {
		int[] A = Arrays.stream(a)
					.boxed()
					.sorted(Comparator.reverseOrder())
					.mapToInt(Integer :: intValue)
					.toArray();
		
		
		/*Integer[] A = new Integer[a.length];

		for(int ctr = 0; ctr < a.length; ctr++) {
		    A[ctr] = Integer.valueOf(a[ctr]); // returns Integer value
		}
		Arrays.sort(A, Collections.reverseOrder());*/
		int ss = 0;
		int n = N -1;
		while(true) {
			int candiesGiven = 0;
			
			
			a = Arrays.stream(A)
					.boxed()
					.sorted(Comparator.reverseOrder())
					.mapToInt(Integer :: intValue)
					.toArray();
			for(int i=0; i<N; i++) {
				
				if(i == N-1 && n-candiesGiven > 1) {
					return ss;
				}
				
				if(A[i] == 0) {
					continue;
				}
					
				A[i] = A[i] - 1;
				candiesGiven++;
				
				if(candiesGiven == n) {
					ss++;
					break;
				}
				
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {3,7,3,12};
		int n = a.length;
		int result = DistributeCandies(n, a);
		System.out.println(result);
		

	}

}
