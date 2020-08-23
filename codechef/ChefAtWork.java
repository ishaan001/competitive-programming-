package codechef;

import java.util.LinkedList;
import java.util.Scanner;

/*
 * August cookoff challenge
 * CHEFNWRK
 * Chef and Work */
public class ChefAtWork {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
	
		while(t>0){
		    int n,k;
		    int w =0, trip =1;
		    n= sc.nextInt();
		    k = sc.nextInt();
		    int arr[] = new int[n];
		    for(int i=0;i<n;i++)
		        arr[i]=sc.nextInt();
		    for(int i=0;i<n;i++){
		        if(arr[i] > k){
		            trip = -1;
		            break;
		        }else if(w+arr[i] <= k){
		            w=w+arr[i];
		        }else{
		            trip++;
		            w = arr[i];
		        }
		        
		    }
		    System.out.println(trip); 
		    t--;
		}
	}

}
