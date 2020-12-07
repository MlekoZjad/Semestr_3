package pk2_lab5;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ramka extends JFrame {

	JPanel panel;

	public Ramka(ArrayList<Dokument> lista) {

		tworzZawartosc(lista);
	}

	public void usun(){
		
		remove(panel);
		setVisible(false);
	}
	
	public void tworzZawartosc(ArrayList<Dokument> lista) {

		Listener l;
		JTextField pole;
		JButton przycisk;
		panel = new JPanel();

		panel.setLayout(new GridLayout(0,3));

		panel.removeAll();

		for (int i = 0; i < lista.size(); i++) {

			pole = new JTextField(lista.get(i).getTytul());
			panel.add(pole);
			pole = new JTextField(lista.get(i).getTresc());
			panel.add(pole);

			l = new Listener(i, lista, this);
			przycisk = new JButton("Usun");
			przycisk.addActionListener(l);
			panel.add(przycisk);

		}

		JButton dodaj= new JButton("Dodaj nowy dokument");
		LOkienko lo = new LOkienko(lista, this);
		dodaj.addActionListener(lo);
		
		panel.add(dodaj);
		
		JButton zapisz= new JButton("Zapisz");
		LZapisz lzap = new LZapisz(lista, this);
		zapisz.addActionListener(lzap);
		panel.add(zapisz);
		
		JButton odczytaj= new JButton("Odczytaj");
		LOdczytaj odczyt = new LOdczytaj(lista, this);
		odczytaj.addActionListener(odczyt);
		panel.add(odczytaj);
		
		
		add(panel);
		pack();
		setVisible(true);
		

	}

}
