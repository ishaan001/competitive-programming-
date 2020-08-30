package hackerank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class GameOfStacks {


    
	static int twoStacks(int x, int[] a, int[] b) {
		int sum1 = 0;
		int integer_removed = 0;
		Stack<Integer> s1 = new Stack<>();
		Stack<Integer> s2 = new Stack<>();
		for (int i = a.length - 1; i >= 0; i--) {
			// sum1 += a[i];
			s1.push(a[i]);
		}
		for (int i = b.length - 1; i >= 0; i--) {
			// sum2 += b[i];
			s2.push(b[i]);
		}

		while(  !s1.isEmpty() && !s2.isEmpty()){
            
            if(s2.peek() <= s1.peek() && (sum1+s2.peek()) < x ){
                    sum1 += s2.pop();
                     
                }
                else if (s1.peek() < s2.peek() && (sum1+s1.peek()) < x ){
                    sum1 += s1.pop();
                      
                }
                else{
                    break;
                }
            integer_removed ++;
        }
		return integer_removed;
	}

   

    public static void main(String[] args) throws IOException { 
    	Scanner sc = new Scanner(System.in);
    	int s1 = sc.nextInt();
    	int s2 = sc.nextInt();
    	int x = sc.nextInt();
    	
    	int a[] = new int[s1];
    	int b[] = new int[s2];
    	
    	for(int i =0;i<s1;i++)
    		a[i] = sc.nextInt();
    	
    	for(int i =0;i<s2;i++)
    		b[i] = sc.nextInt();
    	
    	int res = twoStacks(x, a, b);
    }	

}
