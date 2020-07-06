package Casopractico1;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;

// !* = No importo todos los modulos (*) para tener m�s control de qu� estoy utilizando

public class RelojDigital extends JFrame {

	private static final long serialVersionUID = 1L;

	// Los componentes
	JTextField horaT;
	JPanel panel;


	public RelojDigital() {


		super("Caso Pr�ctico 1. Reloj Digital");

		setSize(450,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(true);
		setLocationRelativeTo(null);


		// Inicializamos el cuadro donde va la hora (horaT)
		horaT = new JTextField(5);
		horaT.setEditable(false);

		// Par�metros fuente(Nombre de fuente, formato, tama�o)
		horaT.setFont(new Font("Arial", Font.PLAIN, 62));

		horaT.setBackground(Color.black);
		horaT.setForeground(Color.green);
		// Inicializamos el Panel
		panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.add(horaT);
		
		
		add(panel);
		//Par�metros del temporizador(Tiempo(en milisegundos) y el Listener(Lo que lo accionar�))
		Timer t = new Timer(1000, new Listener());

		t.start();
	}



	class Listener implements ActionListener{
		// El ActionListener s�lo tiene un m�todo, el siguiente
		public void actionPerformed(ActionEvent e) {

			Calendar c=Calendar.getInstance();
			int hora =c.get(Calendar.HOUR_OF_DAY);
			int minuto =c.get(Calendar.MINUTE);
			int segundo =c.get(Calendar.SECOND);

			horaT.setText(hora+":"+minuto+":"+segundo);
	


		}
	}


}
