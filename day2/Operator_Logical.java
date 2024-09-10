package week1.day2;

public class Operator_Logical {

	public static void main(String[] args) {
       
	byte cycle = 8;
	byte bike = 10;
	byte car = 8;
	
	if (car == bike && car < bike) {
		System.out.println("false"); //1st condition is false, Both conditions should be statisfied 
	}
	else if (car == bike || car < bike) {
		System.out.println("true"); //either one condition is satisfied it will give true
	}
	else {
		System.out.println("above the conditions haven't matched");
	}
	
	

	}

}
