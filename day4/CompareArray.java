package week1.day4;

public class CompareArray {

	public static void main(String[] args) {
	
int array1[] = {3,2,11,4,6,7};
int array2[] = {1,2,8,4,9,7};
    int lengthOfArr1 = array1.length;
    int lengthOfArr2 = array2.length;
    
    for(int i=0;i<lengthOfArr1;i++) {
    	for(int j=0;j<lengthOfArr2;j++) {
    		if(array1[i]==array2[j]) {
    			System.out.println(array1[i]);
    		}
    	}
    }
    
   
	}

}
