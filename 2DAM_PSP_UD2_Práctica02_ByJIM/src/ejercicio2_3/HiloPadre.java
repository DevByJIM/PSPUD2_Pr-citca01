package ejercicio2_3;


public class HiloPadre extends Thread {

	public HiloPadre(String nombre, int veces, int nivel){
		this.nombre = nombre;
		this.veces = veces;
		this.nivel = nivel;
	}
	public void run() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("HILO " + nombre + " iniciado.");

		if(nivel < 1) {
			for(int i = 0 ; i< veces; i++) {
				HiloPadre hilo = new HiloPadre("hijode" + i + "_" + nombre, veces, nivel+1);
				hilo.start();
				try {
					hilo.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("HILO " + nombre + " finalizado.");
		}else {
			System.out.println(nombre + " TIENE NIVEL MAXIMO ALCANZADO.");
		}
	}

	

private String nombre;
private int veces;
private int nivel;
}