package xyz;
class animal{
	void sound() {
		System.out.println("animal makes a sound");
	}
}
class dog extends animal{
	void sound() {
		System.out.println("bow bow");
	}
}
class cat extends animal{
	void sound() {
		System.out.println("meow meow");
	}
}
public class overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		animal a1=new animal();
		animal a2=new dog();
		animal a3=new cat();
		a1.sound();
		a2.sound();
		a3.sound();
	}

}