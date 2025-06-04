package xyz;
import java.util.Scanner;
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int reverse=0;
int org=n;
int rem;
while(n!=0) {
	rem=n%10;
	reverse=reverse*10+rem;
	n=n/10;
	
}
if(org==reverse) {
	System.out.println("palindrome");
}else {
	System.out.println("not a palindrome");
}
sc.close();
	}

}
