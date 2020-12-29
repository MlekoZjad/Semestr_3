package pk2b_lab04;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import pk2_lab5.Dokument;

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
	/*
	public JButton usun;
	public JButton zapisz;
	public JButton odczytaj;
*/

	public Ramka(ArrayList<Dokument> lista) {

		this.dokumenty = lista;
		mojPanel = new JPanel();
		add(mojPanel);
		wypelnijPanel();

	}
	// usuwanie
public void usun(){
		
		remove(mojPanel);
		setVisible(false);
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
		przyciski.add(przyciskDodaj);	

		mojPanel.removeAll();

		for (int i = 0; i < dokumenty.size(); i++) {

			pole = new JTextField(dokumenty.get(i).getTytul());
			mojPanel.add(pole);
			pole = new JTextField(dokumenty.get(i).getTresc());
			mojPanel.add(pole);
			pack();

			JButton usun = new JButton("Usuñ");
			// usun.createActionListener();
			mojPanel.add(usun);
			przyciski.add(usun);
		}

		JButton dodaj = new JButton("Dodaj nowy dokument");
		mojPanel.add(dodaj);
		przyciski.add(dodaj);
		JButton zapisz = new JButton("Zapisz");
		mojPanel.add(zapisz);
		przyciski.add(zapisz);

		JButton odczytaj = new JButton("Odczytaj");
		mojPanel.add(odczytaj);
		przyciski.add(odczytaj);

		add(mojPanel);
		pack();
		setVisible(true);

	}

	public void actionPerformed(ActionEvent e) throws IOException {
		Object zrodlo = (JButton) e.getSource();

		if (zrodlo == usun) {
		for (int i = 0; i < przyciski.size(); i++) {
			if (zrodlo == przyciski.get(i)) {
				dokumenty.remove(i);
				remove(mojPanel);
				wypelnijPanel();
				break;
			}
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
			// zapisanie do pliku txt
		} else if (zrodlo == zapisz) {
			File file = new File("dokumenty.txt");
			FileWriter fwriter = new FileWriter(file);
			BufferedWriter bwriter = new BufferedWriter(fwriter);
			for (int i = 0; i < dokumenty.size(); i++) {
				bwriter.write("Dokument\n");
				bwriter.write(dokumenty.get(i).getTytul() + "\n");
				bwriter.write(dokumenty.get(i).getTresc() + "\n");
			}
			bwriter.close();
			System.out.println("Documents have been saved to the file");
			// odczyt z pliku txt
		} else if (zrodlo == odczytaj) {
			File file = new File("dokumenty.txt");
			FileReader freader = new FileReader(file);
			BufferedReader breader = new BufferedReader(freader);
			dokumenty.clear();
			String line;
			while ((line = breader.readLine()) != null) {
				if (line.equals("Dokument")) {
					String tytul = breader.readLine();
					String tresc = breader.readLine();
					Dokument mojDokumentTekstowy = new Dokument(tytul, tresc);
					dokumenty.add(mojDokumentTekstowy);
				}
			}
			breader.close();
			System.out.println("Documents have been loaded from the file");
		}

	}
}
