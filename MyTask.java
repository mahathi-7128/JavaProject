package xyz;
class MyTask1 extends Thread{
	private String taskName;
	public MyTask1(String taskName) {
		this.taskName=taskName;
	}
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(taskName+"Steps"+i);
			try {
				Thread.sleep(5000);
			}catch(InterruptedException e) {
				System.out.println(taskName+"was interrupted");
			}
		}
	}
}
public class MyTask {
	public static void main(String[] args) {
		MyTask1 t1=new MyTask1("cooking");
		MyTask1 t2=new MyTask1("washing");
		t1.start();
		t2.start();
	}
}