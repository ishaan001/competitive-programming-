package bridgeProgram;

public class AndConjuction {
	
	public static int getAnd(int N) {
		
		int count =0;
		if(N <= 9) return 1;
		while(N >= 10) {
			int i = N;
			int j = i%10;
			while( i>0) {
				int k = i%10;
				j = j&k;
				i = i/10;
			}
			if(j == 0) {
				count++;
			}
			N--;
		}
		count++;
		return count;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getAnd(12));

	}

}
