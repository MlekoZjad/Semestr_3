package pk2b_lab04;

import java.util.ArrayList;

import javax.swing.JFrame;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// tworzenie listy z dokumentami
		ArrayList<Dokument> lista = new ArrayList<Dokument>();

		// dodawanie kilku przykladowych dokumentow
		Dokument d1 = new Dokument("pierwszy", "jeden");
		Dokument d2 = new Dokument("drugi", "dwa");
		Dokument d3 = new Dokument("trzeci", "trzy");
		Dokument d4 = new Dokument("czwarty", "cztery");

		// dodawanie dokumentow do listy
		lista.add(d1);
		lista.add(d2);
		lista.add(d3);
		lista.add(d4);

		// tworzenie nowej ramki
		Ramka mojaRamka = new Ramka(lista);
		// wyswietlenie jej (ustawienie - widoczna)
		mojaRamka.setVisible(true);

		mojaRamka.pack();
		// zamykanie aplikacji po wcisnieciu "X"
		mojaRamka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
