package week1.day2.assignments;

import java.util.Arrays;

public class MissingElementInAnArray 
{

	public static void main(String[] args) 
	{
		int[] arr= {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		System.out.println("Array of Length is "+ arr.length);
		for (int i=arr[0]; i < arr.length; i++) 
		{
			if (arr[i] != (i+1)) 
			{
				System.out.println(i+1);
				break;
			}
				
		}
	}
}
