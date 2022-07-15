package week1.day2;

public class changeOddIndexToUppercase {

	public static void main(String[] args) {
	    String str="florida";
	    String oddindex="";
	    int strlen=str.length();
	    char ch,ch1;
	    for(int i=0;i<strlen;i++)
	    {
	    	 if(i%2==0)
	    	 {
	    		ch=str.charAt(i);
	    		ch1=Character.toUpperCase(ch);
	    	    oddindex=oddindex+ch1;
	    	 }
	    	 if(i%2==1)
	    	 {
	    		 ch=str.charAt(i);
	    		 ch1=ch;
	    		 oddindex=oddindex+ch1;	 
	    	 }
	    }
	    		 System.out.print(oddindex);
	}
}

	      


