package xyz;

import java.util.Scanner;
import java.util.ArrayList;

public class todolist {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> task=new ArrayList<>();
		while(true) {
			System.out.println("1.add a task");
			System.out.println("2.view a task");
			System.out.println("3.delete a task");
			System.out.println("4.exist");
			System.out.println("choose from 1-4");

int choice=sc.nextInt();
sc.nextLine();
if(choice==1) {
	System.out.println("enter your task");
	String task1=sc.nextLine();
	task.add(task1);
	System.out.println("task added successfully");
}else if(choice ==2) {
	if(task.isEmpty()) {
		System.out.println("no task found");
	}else {
		System.out.println("your tasks");
		for (int i=0;i<task.size();i++) {
		System.out.println((i+1)+" "+task.get(i));	
	}
	}		
}else if(choice ==3) {
		if(task.isEmpty()) {
			System.out.println("nothing is delete");
		}else {
			System.out.println("enter task number to delete");
			int tasknum = sc.nextInt();
			if(tasknum>=1 &&tasknum<=task.size()) {
				task.remove(tasknum-1);
				System.out.println("task deleted");
			}else {
				System.out.println("invalid number");
			}
		}
		}else if(choice==4) {
			System.out.println("goodbye");
			break;
			
		}else {
			System.out.println("please choose a valid option");
		}
	}
sc.close();
	}
}
