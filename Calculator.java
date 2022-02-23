package week1.day2;

public class Calculator {

	public int add(int num1, int num2, int num3) {
		return num1+num2+num3;	

	}
	
	public int sub(int num1, int num2) {
		return num1-num2;

	}
	
	public double multi(double num1, double num2) {
		return num1*num2;

	}
	
	public float divide(float num1, float num2) {
		return num1/num2;

	}
public static void main(String[] args) {
	
	Calculator calc=new Calculator();
	
	int additionValue=calc.add(5,10,15);
	System.out.println("The Addition of three Value is:"+additionValue);
	
	int subtractValueResult=calc.sub(10, 5);
	System.out.println("The subtraction of two value is :"+subtractValueResult);
	
	double MutliplytValueResult=calc.multi(11, 5);
	System.out.println("The Multiply value is :"+MutliplytValueResult);
	
	float divideValueResult=calc.divide(3456.0f,2.0f);
	System.out.println("The division value is :"+divideValueResult);
	
}
}
