package week1.day2;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) 
	{
	   String str="Mountain move Mountain movers if move";
	   int count=0;
	   String[] strarr=str.split(" ");
	  System.out.println(Arrays.toString(strarr));
	   for(int i=0;i<strarr.length;i++)
	   {
		   for(int j=i+1;j<strarr.length;j++)
		   {
			   if(strarr[i].equals(strarr[j]))
			   {
	               count+=1;
	               if(count>=1)
	               {
	            	   strarr[j]=" ";
	               }
			   }
		   }
		   
	   }
	   System.out.println(Arrays.toString(strarr));
	}
}
