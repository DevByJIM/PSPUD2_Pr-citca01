package ejercicio2_2;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class ejercicio2 {

	public static void main(String[] args) {
		
		new Ventana();
		new HiloMusica().start();

	}

	
}

class Ventana extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Ventana(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100,100,450,300);
		this.setTitle("Ventana de ejercicio 2");
		
		Panel miPanel = new Panel();
		this.add(miPanel);
		this.setVisible(true);;
	}
}

class Panel extends JPanel{
	
	private static final long serialVersionUID = 1L;

	public Panel() {
		setLayout(new BorderLayout());
		
		lbReloj = new JLabel("00:00:00",SwingConstants.CENTER);
		
		lbReloj.setFont(fuenteLogo);
		
		new HiloHora().start();
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new botonSalir());
		
		this.add(lbReloj, BorderLayout.CENTER);
		this.add(btnSalir, BorderLayout.SOUTH);
		
	}
	
	public class HiloHora extends Thread {
		DateTimeFormatter miFormato = DateTimeFormatter.ofPattern("HH:mm:ss");
		public void run() {
			while(true) {
				
				lbReloj.setText(LocalTime.now().format(miFormato).toString());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public class botonSalir implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			System.exit(0);

		}

	}

	Font fuenteLogo = new Font("Segoe UI",3,65);
	public JLabel lbReloj;

}


