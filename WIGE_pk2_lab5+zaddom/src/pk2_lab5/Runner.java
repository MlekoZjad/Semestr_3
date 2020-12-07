package pk2_lab5;

import java.util.ArrayList;

import javax.swing.JFrame;

public class Runner {

	public static ArrayList<Dokument> lista = new ArrayList<Dokument>();

	public static void main(String[] args) {

		lista.add(new Dokument("Pan Tadeusz ", "Litwo! Ojczyzno moja! ty jesteœ jak zdrowie \n Ile ciê trzeba ceniæ, ten tylko siê dowie"));
		lista.add(new Dokument("Reduta Ordona", "Nam strzelaæ nie kazano. - Wst¹pi³em na dzia³o I spójrza³em na pole; dwieœcie armat grzmia³o."));
		lista.add(new Dokument("Lokomotywa", "Stoi na stacji lokomotywa,Ciê¿ka, ogromna i pot z niej sp³ywa -T³usta oliwa."));
		

		Ramka ramka = new Ramka(lista);
		ramka.setVisible(true);
		ramka.pack();
		ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
