package xyz;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetTask3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      TreeSet<String> products=new TreeSet<>();
      products.add("keyboard");
      products.add("mouse");
      products.add("monitor");
      products.add("cpu");
      products.add("webcam");
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the product");
      String s=sc.nextLine();
		if(products.contains(s)) {
    		System.out.println("exists");  
    	  }else {
    		  System.out.println("not exits");
    	  }
		sc.close();
	}

}