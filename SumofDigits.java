package week1.day2;

public class SumofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int number;
		int sum = 0;
		
		for (number=245;number>0;number=number/10)
		{
			int value = number%10;
			
			sum = sum + value;
		}
		
		System.out.println(sum);
		
	}

}
