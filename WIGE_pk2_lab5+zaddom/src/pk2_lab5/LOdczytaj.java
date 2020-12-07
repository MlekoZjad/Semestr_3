package pk2_lab5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LOdczytaj implements ActionListener {

	ArrayList<Dokument> lista;
	Ramka ramka;

	public LOdczytaj(ArrayList<Dokument> list, Ramka ramk) {
		lista = list;
		ramka = ramk;
	}

	public void actionPerformed(ActionEvent e) {
		try {
			odczyt(lista);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		ramka.usun();
		ramka.tworzZawartosc(lista);

	}

	void odczyt(ArrayList<Dokument> lista) throws IOException {

		File file = new File("dokumenty.txt");
		FileReader freader = new FileReader(file);
		BufferedReader breader = new BufferedReader(freader);
		lista.clear();
		String line;
		while ((line = breader.readLine()) != null) {
			if (line.equals("Dokument")) {
				String tytul = breader.readLine();
				String tresc = breader.readLine();
				Dokument mojDokumentTekstowy = new Dokument(tytul, tresc);
				lista.add(mojDokumentTekstowy);
			}
		}
		breader.close();
		System.out.println("Documents have been loaded from the file");

	}

}
