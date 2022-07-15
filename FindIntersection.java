package week1.day2;

import java.util.Arrays;

public class FindIntersection {
	public static void main(String[] args) {
		String[] arr1= {"Are","Bye","Cat","Fish","Goat"};
		String[] arr2= {"Are","Cat","Goat"};
		System.out.println("Array1:" +Arrays.toString(arr1));
		System.out.println("Array2:"  + Arrays.toString(arr2));
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
				  System.out.println("common elements are:"+ (arr1[i]));	
				}
			}
		}
		
	}
}
