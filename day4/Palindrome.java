package week1.day4;

public class Palindrome {
	
public  void isPalindrome(int num) {
		
		System.out.println(num);
		int value;
		value= num;
		int rev=0;
		int sum=0;
	
		
		
		while(num>0){
			rev=num%10;
			sum=(sum*10)+rev;
			num= num/10;
		}
		if(value==sum) {
			System.out.println("It is a palindrome number" );
			
		}
		else
		{
			System.out.println("This is not palindrome number");
		}
	}
	public static void main(String[] args) {
		
		Palindrome number =new Palindrome();
		number.isPalindrome(12121);
	}

}
