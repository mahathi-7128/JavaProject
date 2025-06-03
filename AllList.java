package xyz;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.HashSet;
 class ArrayListex{
	  ArrayListex(){
		 ArrayList<String> st=new ArrayList<>();
		 st.add("swetha");
		 System.out.println(st);
		 }
	 
 }
 class LinkedListex extends ArrayListex{
	  LinkedListex(){
		 LinkedList<String> st1=new LinkedList<>();	
		 st1.add("sneha");
		 System.out.println(st1);
	 }
 }
 class HashMapex extends LinkedListex{
	 HashMapex(){
		 HashMap<String , Integer> st2=new HashMap<>();	
		 st2.put("siri", 1);
		 System.out.println(st2);
	 }
 }
 class HashSetex extends HashMapex{
	  HashSetex(){
		 HashSet<String> st3=new HashSet<>();	
		 st3.add("ravi");
		 System.out.println(st3);
	 }
 }
public class AllList {

	public static void main(String[] args) {
		HashSetex obj=new HashSetex();
	}

}
