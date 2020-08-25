package hackerEarth;

import java.util.Scanner;
/*
 * Hacker Earth - stacks\ basics of stacks
 * 	problem - Financial problem in dholakpur
 * */
public class FinancialProblemOfDholakpur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            int sol[] = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
                sol[i] = 1;
            }
            
            //System.out.print("1"+" ");
            for(int i=1; i<n; i++){
                if(arr[i-1] <= arr[i]){
                    for(int j=i-1; j>=0; j--){
                        if(arr[j] > arr[i]){
                           break;
                        }
                        sol[i]++;
                    }
                }
            }
            
            for(int i=0;i<n;i++){
                System.out.print(sol[i]+" ");
            }
            System.out.println();
            t--;
        }


	}

}
