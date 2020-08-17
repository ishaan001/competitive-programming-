package codechef;

import java.util.Arrays;
import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) {

        Scanner sObj = new Scanner(System.in);
        int css = sObj.nextInt();
        sObj.nextLine();
        for(int z=0; z<css; z++){
            StringBuilder sbOut = new StringBuilder();
            String input = sObj.nextLine();
            String substr = sObj.nextLine();
            int[] freq = new int[26];
            Arrays.fill(freq,0);
            for(char ch: input.toCharArray()) freq[ch-97] += 1;
            for(char ch2: substr.toCharArray()) freq[ch2-97] -= 1;
            int firstChr = substr.charAt(0) - 97;
            boolean added = false;
            for(int i=0; i<26; i++){
                if(!added && firstChr<i){
                    sbOut.append(substr);
                    added = true;
                }
                if(freq[i] > 0){
                    while(freq[i] != 0){
                        sbOut.append((char)(i+97));
                        freq[i] -= 1;
                    }
                }
            }
            System.out.println(sbOut);
        }

	}

}
