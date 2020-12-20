package pk2b_lab04;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class Ramka extends JFrame {

	// konstruktor bioracy z klasy "Dokument"
	public ArrayList<Dokument> dokumenty;
	public ArrayList<JTextField> polaTekstoweTytuly;
	public ArrayList<JTextField> polaTekstoweTresci;
	// przechowuje panel umieszczony w ramce (przyciski na panelu)
	public JPanel mojPanel;
	public JTextField pole;
	public JButton przyciskDodaj;
	public ArrayList<JButton> przyciski;

	public Ramka(ArrayList<Dokument> lista) {

		this.dokumenty = lista;
		mojPanel = new JPanel();
		add(mojPanel);
		wypelnijPanel();

	}

	public void wypelnijPanel() {
		// Tworzenie nowej listy przyciskow
		mojPanel.removeAll();
		GridLayout grid = new GridLayout((dokumenty.size() + 1), 3);
		mojPanel.setLayout(grid);
		polaTekstoweTytuly = new ArrayList<JTextField>();
		polaTekstoweTresci = new ArrayList<JTextField>();

		przyciski = new ArrayList<JButton>();

		przyciskDodaj = new JButton();
		// przyciskDodaj;

		mojPanel.removeAll();

		// for (Dokument lista : dokumenty) {

		for (int i = 0; i < dokumenty.size(); i++) {

			pole = new JTextField(dokumenty.get(i).getTytul());
			mojPanel.add(pole);
			pole = new JTextField(dokumenty.get(i).getTresc());
			mojPanel.add(pole);
			pack();
			
			JButton usun = new JButton("Usuñ");
		//	usun.createActionListener();
			mojPanel.add(usun);
		}
			
		JButton dodaj= new JButton("Dodaj nowy dokument");
	//	LOkienko lo = new LOkienko(lista, this);
	//	dodaj.addActionListener(lo);
		
		mojPanel.add(dodaj);
		
		JButton zapisz= new JButton("Zapisz");
	//	LZapisz lzap = new LZapisz(lista, this);
	//	zapisz.addActionListener(lzap);
		mojPanel.add(zapisz);
		
		JButton odczytaj= new JButton("Odczytaj");
	//	LOdczytaj odczyt = new LOdczytaj(lista, this);
	//	odczytaj.addActionListener(odczyt);
		mojPanel.add(odczytaj);
		
		
		add(mojPanel);
		pack();
		setVisible(true);	

		
	}

	
	public void actionPerformed(ActionEvent e) {
		Object zrodlo = (JButton) e.getSource();

		for (int i = 0; i < przyciski.size(); i++) {
			if (zrodlo == przyciski.get(i)) {
				dokumenty.remove(i);
				wypelnijPanel();
				break;
			}

		}
		if (zrodlo == przyciskDodaj) {
			String tytul = JOptionPane.showInputDialog(null, "Nazwa dokumentu", "Nowy dokument",
					JOptionPane.OK_CANCEL_OPTION);
			String tresc = JOptionPane.showInputDialog(null, "Tresc dokumentu", "Nowy dokument",
					JOptionPane.OK_CANCEL_OPTION);
			Dokument nowyD = new Dokument(tytul, tresc);
			dokumenty.add(nowyD);
			wypelnijPanel();
			// } else if (zrodlo == zapisz){

		}

	}
}
