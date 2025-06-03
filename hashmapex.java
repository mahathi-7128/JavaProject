package xyz;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class hashmapex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> stu=new HashMap<>();
		stu.put(1, "bargavi");
		stu.put(2, "harshi");
		stu.put(3, "mahathi");
		stu.put(4, "deepa");
		stu.put(5, "bhagya");
		System.out.println(stu);
		stu.remove(1);
		System.out.println(stu);
		stu.replace(3, "mahi");
		System.out.println(stu);
			if(stu.containsKey(4)){
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
			for(int i=1;i<stu.size()+1;i++) {
				System.out.println(stu.get(i));
			}
		//stu.keySet();
		System.out.println(stu.keySet());
	}

}