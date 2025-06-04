package xyz;

import java.util.Scanner;

public class even {
public static void main(String as[]) {
	
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	if(n%2 == 0) {
		System.out.println("even");
	}else {
		System.out.println("odd");
	}

sc.close();
}
}
