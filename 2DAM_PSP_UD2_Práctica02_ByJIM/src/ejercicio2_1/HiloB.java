package ejercicio2_1;

public class HiloB extends Thread{

	
	public void run() {
		while(true) {
			System.out.println("TAC");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
