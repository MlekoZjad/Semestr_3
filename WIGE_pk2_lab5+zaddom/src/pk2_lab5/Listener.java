package pk2_lab5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JPanel;

public class Listener implements ActionListener {

	int indeks;
	ArrayList<Dokument> lista;
	Ramka ramka;

	Listener(int index, ArrayList<Dokument> list, Ramka r) {
		indeks = index;
		lista = list;
		ramka = r;

	}

	public void actionPerformed(ActionEvent e) {

		lista.remove(indeks);

		ramka.usun();

		ramka.tworzZawartosc(lista);

	}

}
