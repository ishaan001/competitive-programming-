package hackerank;

import java.util.Scanner;

public class Prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a[] = new int[6];
		for(int i=1; i<=5;i++) {
			a[i] = sc.nextInt() + a[i-1];
		}
		
	}

}
