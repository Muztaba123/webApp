package prac;
public class Threadmodul extends Thread {
	
	int balance=0;
	
public synchronized void run()
{
	for (int i = 0; i <1000; i++) {
		
		balance=balance+i;
		
	}
	notify();
}


	
	}


	
