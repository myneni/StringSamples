package concord.string.interviewsample;

public class SwapString {
	static String s1="Hello";
	static String s2="World";
	public static void main(String a[]){
		
		System.out.println("S1 Value: "+s1 + "   " + " s2 Value : "+ s2);
		s1=s1.concat(s2);
		s2=s1.substring(0, (s1.length()-s2.length()));
		
		System.out.println("S1 length: "+s1.length() + "   " + " s2 length : "+ s2.length());
		//s1=s1.substring(11);
		s1=s1.substring(s2.length());
		System.out.println("String Values after Swapping");
		System.out.println("S1 Value: "+s1 + "   " + " s2 Value : "+ s2);
		
		
		
		
		
	}

}
