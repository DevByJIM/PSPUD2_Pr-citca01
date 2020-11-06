package ejercicio2_3;

public class ejercicio03 {

	public static void main(String[] args) {
		System.out.println("HILO PADRE iniciado.");
		HiloPadre hilo = new HiloPadre("Primogenito",5,0);
		hilo.start();
		try {
			hilo.join();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		System.out.println("HILO PADRE finalizado.");
	}

}
