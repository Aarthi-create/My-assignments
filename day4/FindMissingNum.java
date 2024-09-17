package week1.day4;

import java.util.Arrays;

public class FindMissingNum {

	public static void main(String[] args) {

	int input[] = {1,4,3,2,8,6,7};
	Arrays.sort(input);
	int lengthOfInput = input.length;
	
	for (int i = 0; i <lengthOfInput; i++) {
		if(input[i]!=i+1) {
			System.out.println("The missing value is" +" " +": "+ (i+1));
			break;
		}
	}
		
	}

}
