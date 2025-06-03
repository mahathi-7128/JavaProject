package xyz;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		TreeSet<Integer> num=new TreeSet<Integer>();
		TreeSet<String> name=new TreeSet<>();
		num.add(34);
		num.add(45);
		num.add(1);
		num.add(3);
		name.add("mahi");
		name.add("sadha");
		name.add("giri");
		name.add("lara");
		System.out.println(num);
		System.out.println(name);
		if(num.contains(34)) {
			System.out.println("found");
		}else {
			System.out.println("not found");
		}
		// TODO Auto-generated method stub

	}

}
