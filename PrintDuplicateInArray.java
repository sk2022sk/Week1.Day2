package week1.day2;

public class PrintDuplicateInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// get the length of the array
		
		int array1[]= {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		// declare an int variable named count
		int count=0;
		// iterate from i to the length of the array by adding 1 to it (inner loop starts here)
		for(int i=0;i<array1.length;i++)
		{
			
		for(int j=i+1;j<array1.length;j++)
		{
			if(array1[i]==array1[j])
			{
				// increase the count if both the arrays are equal
				count++;
				System.out.println(array1[i]);
				
			}	
		}
		
		
		}

	}

}
