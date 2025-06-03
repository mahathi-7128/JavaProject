package xyz;
import java.util.TreeMap;
public class Treemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      TreeMap<Integer, String> stud=new TreeMap<>();
      stud.put(100, "raghu");
      stud.put(98, "swetha");
      System.out.println(stud.keySet());
if(stud.containsValue("swetha")) {
	System.out.println("found");
}
TreeMap<Long, String> phonebook=new TreeMap<Long, String>();
phonebook.put(123456789L, "swetha");
phonebook.put(123588678L, "swetha");
phonebook.put(23456878L, "swetha");
phonebook.put(1234675567L, "swetha");
System.out.println(phonebook);
}
}
