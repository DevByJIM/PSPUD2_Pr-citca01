package ejercicio2_1;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		new HiloA().start();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		new HiloB().start();

	}

}
