package xyz;

import java.util.Scanner;

public class stringpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		String original=sc.nextLine();
		String m=original;
String rev=new StringBuffer(original).reverse().toString();
System.out.println(rev);
if( rev.equals(m)) {
	System.out.println("palindrome");
}else {
	System.out.println("not palindrome");
}

	sc.close();
}
}