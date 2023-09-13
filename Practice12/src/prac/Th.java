package prac;

public class Th  implements Runnable {
	
public static void main(String[] args) {
	
	Th a1=new Th();
	Thread t1=new Thread(a1);
	t1.start();
	
	for (int i = 0; i < 10000; i++) {
		
		System.out.println("main");
		
	}
	
}

@Override
public void run() {
	for (int i = 0; i <10000; i++) {
		
		System.out.println("run");
		
	}
	
}

}