package week1.day2;

public class ReverseEvenwords {
	
    public void reverseWordInMyString(String str) {
	String[] words = str.split(" ");
	String reversedString = "";
	for (int i = 0; i < words.length; i++)
        {
           String word = words[i]; 
           String reverseWord = "";
           for (int j = word.length()-1; j >= 0; j--) 
	   {
		reverseWord = reverseWord + word.charAt(j);
	   }
	   reversedString = reversedString + reverseWord + " ";
	}
	System.out.println(str);
	System.out.println(reversedString);
   }
   public static void main(String[] args) 
   {
	ReverseEvenwords obj = new ReverseEvenwords();
	obj.reverseWordInMyString("I am a software tester");
	obj.reverseWordInMyString("This is an easy Java Program");
   }
   }
 


