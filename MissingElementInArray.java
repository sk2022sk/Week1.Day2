package week1.day2;


public class MissingElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int array[]= {1,2,3,4,7,6,8};
		int arraysum=0;
		int sum=(array.length+1)*(array.length+2)/2;
		for(int i=0;i<array.length;i++)
		{
		arraysum=	arraysum+array[i];	
		}
		int missingnumber= sum-arraysum;
		System.out.println(missingnumber);
	}

}
