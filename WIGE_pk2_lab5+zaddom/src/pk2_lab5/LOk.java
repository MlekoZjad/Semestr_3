package pk2_lab5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class LOk implements ActionListener {

	ArrayList<Dokument> lista;
	Ramka ramka;
	Okienko okno;

	public LOk(ArrayList<Dokument> list, Ramka ramk, Okienko ok) {

		lista = list;
		ramka = ramk;
		okno = ok;

	}

	public void actionPerformed(ActionEvent e) {

		lista.add(new Dokument(okno.getNewTitle(), okno.geContent()));
		okno.setVisible(false);
		ramka.usun();
		ramka.tworzZawartosc(lista);

	}

}
