package pk2_lab5;

import java.util.ArrayList;

import javax.swing.JFrame;

public class Runner {

	public static ArrayList<Dokument> lista = new ArrayList<Dokument>();

	public static void main(String[] args) {

		lista.add(new Dokument("Pan Tadeusz ", "Litwo! Ojczyzno moja! ty jeste� jak zdrowie \n Ile ci� trzeba ceni�, ten tylko si� dowie"));
		lista.add(new Dokument("Reduta Ordona", "Nam strzela� nie kazano. - Wst�pi�em na dzia�o I sp�jrza�em na pole; dwie�cie armat grzmia�o."));
		lista.add(new Dokument("Lokomotywa", "Stoi na stacji lokomotywa,Ci�ka, ogromna i pot z niej sp�ywa -T�usta oliwa."));
		

		Ramka ramka = new Ramka(lista);
		ramka.setVisible(true);
		ramka.pack();
		ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
