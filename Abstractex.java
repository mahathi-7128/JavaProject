package xyz;
abstract class car{
	abstract void start();
	abstract void driving();
	abstract void need();
}

public class Abstractex {

	void start() {
		System.out.println("starting the car");
	}
	void driving() {
		System.out.println("need driving license");
	}
	void need() {
		System.out.println("stop ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Abstractex ob=new Abstractex();
ob.start();
ob.driving();
ob.need();
	}

}
