package pk2b_lab04;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ramka extends JFrame {

	// konstruktor bioracy z klasy "Dokument"
	public ArrayList<Dokument> dokumenty;
	public ArrayList<JTextField> polaTekstoweTytuly;
	public ArrayList<JTextField> polaTekstoweTresci;
	// przechowuje panel umieszczony w ramce (przyciski na panelu)
	public JPanel mojPanel;
	JTextField pole;

	public Ramka(ArrayList<Dokument> lista) {
		this.dokumenty = lista;
		mojPanel = new JPanel();
		add(mojPanel);
		wypelnijPanel();


	}

	public void wypelnijPanel() {
		mojPanel.removeAll();
		GridLayout siatka = new GridLayout(dokumenty.size(), 2);
		mojPanel.setLayout(siatka);
		polaTekstoweTytuly = new ArrayList<JTextField>();
		polaTekstoweTresci = new ArrayList<JTextField>();
		 

		// petla

		for (Dokument lista : dokumenty) {
		
			pole = new JTextField(lista.getTytul());
			mojPanel.add(pole);
			pole = new JTextField(lista.getTresc());
			mojPanel.add(pole);

		}
		 pack();
	}
	

}
