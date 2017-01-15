package concord.string.interviewsamples;

import java.text.SimpleDateFormat;
import java.util.Date;

public class IntegerToString {
	static Integer i=123;
	static int j =145;
	
public static void main(String args[]){
	String s1=String.valueOf(i);
	String s3=String.valueOf(j);
	String s4=String.valueOf(i)+String.valueOf(j);
	String s5=new StringBuilder().append("").append(10).toString();
	String Price= String.format("%d", 555);
	System.out.println("String s1 value :"+ s1);
	System.out.println("String s3 value :"+ s3);
	System.out.println("String s4 value :"+ s4);
	System.out.println("String s4 value :"+ s5);
	System.out.println("String Price value :"+ Price);
	Date date =new Date();
	SimpleDateFormat dateformatddMMyyyy=new SimpleDateFormat("dd/MM/yyyy");
	String date_to_String =dateformatddMMyyyy.format(date);
	System.out.println("String Date value :"+ date_to_String);
	System.out.println("Added this to Git successfully");
}
}
