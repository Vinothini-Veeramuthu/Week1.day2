package week1.day2;

import java.util.Arrays;

public class ReverseEvenWords {
	
	public static void main(String[] args) {
		String str="I am more than conqueror";
		String[] strarr=str.split(" ");
		int strlen=strarr.length;
		for(int i=0;i<strlen;i++)
		{
		  if(i%2==1)
		  {
			  char[] charArray=strarr[i].toCharArray();
			  for(int j=charArray.length-1;j>=0;j--)
			  {
				  System.out.print(charArray[j]);
			  }
		  }
		  else
		  {
			  System.out.print(strarr[i]);
		  }
		  System.out.print(" ");
		}	
	}
	
	
}
