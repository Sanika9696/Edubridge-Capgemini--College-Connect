package achieveMent;

import java.util.Scanner;

public class ASCIIchar {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter a character=");
//	1.char a=scanner.next().charAt(0);
//	int b=a;
//	System.out.println("Ascii value of "+a+" is "+b);
	
	//Type Casting
	
	char character=scanner.next().charAt(0);
	int asciiValue=character;
	System.out.println("Ascii value of "+character+" is "+asciiValue);
}
}
