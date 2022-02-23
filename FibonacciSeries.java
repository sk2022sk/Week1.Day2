package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int number1 = 0;
		int number2 = 1;
		int count = 8;
		int fibonacci;
				
		System.out.println(number1+number2);
		
		for (int i = 2; i < count; i++) {
		
			fibonacci=number1+number2;
			System.out.println(fibonacci);
			
			number1=number2;
			number2=fibonacci;
			
		}
		
	}

}
