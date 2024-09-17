package week1.day4;

import java.util.Arrays;


public class FindDuplicate {

	public static void main(String[] args) {
	
    int[] values = {2, 5, 7, 7, 5, 9, 2, 3};
    int lengthOfArray = values.length;
    Arrays.sort(values);
    
   for (int i = 0; i < lengthOfArray-1; i++) {
	   if(values[i]==values[i+1]) {
		   System.out.println(values[i]);
	   }
}
   
   
	}

}
