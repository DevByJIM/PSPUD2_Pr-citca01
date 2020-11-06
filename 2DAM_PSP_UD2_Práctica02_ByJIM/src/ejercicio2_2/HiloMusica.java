package ejercicio2_2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class HiloMusica extends Thread {
	Player apl;
		
	public void run() {
		try {
			apl = new Player(new FileInputStream("./vidaderico.mp3"));
			
			apl.play();
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (JavaLayerException e) {
			e.printStackTrace();
		}
			
	}
}
	
