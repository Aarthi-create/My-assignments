package week1.day2;

public class Operators_Arithmatic {

	public static void main(String[] args) {
		int num1 = 45;
		int num2 = 20;
		System.out.println("Addition of num1 and num2 value is"+" "+ (num1+num2));
		System.out.println("subtraction  of num1 and num2 value is"+" "+ (num1-num2));
		System.out.println("Multiplication  of num1 and num2 value is"+" "+ (num1*num2));
		System.out.println("division of num1 and num2 value is"+" "+ (num1/num2));
		System.out.println("Modulo of num1 and num2 value is"+" "+ (num1%num2));
		// postIncrement
		int val1 = 43;
		System.out.println("PostIncrement value added+1 but this iteration it will not update so the value is"+" "+val1++); // here it won't update
		System.out.println("Here it will update"+ " "+ val1);
		
		// preIncrement
		System.out.println("The value is add +1 and also update this iteration "+ " "+ ++val1);
		
		
		// postDecrement
		
		System.out.println("PostDecrement value subtracted-1 but this iteration it will not update so the value is"+" "+val1--); // here it won't update
		System.out.println("Here it will update"+ " "+ val1);
		
		// preDecrement
		System.out.println("The value is add +1 and also update this iteration "+ " "+ --val1);
		
		}

}
