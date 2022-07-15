package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
      String str="radar";
      String reverse="";
      int strlen=str.length();
      for(int i=(strlen-1);i>=0;i--)
      {
    	  reverse=reverse+str.charAt(i);
      }
      if(str.equals(reverse))
     {  
    	  System.out.println(reverse   +  ":This is palindrome");
      }
      else
      {
    	  System.out.println(reverse   +  ":This is not palindrome");
      }
	}
}

