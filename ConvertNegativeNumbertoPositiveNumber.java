package week1.day2;

public class ConvertNegativeNumbertoPositiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input=-42;
		
		int positiveno=0;
		
		if(input<0)
		{
			positiveno = input * -1;
			System.out.println("Given negative Value "+input+" converted to Positive Number" +positiveno);
		}
		else if (input > 0)
		{
			System.out.println("Given Value is positive Number");
		}
		
		
	}

}
