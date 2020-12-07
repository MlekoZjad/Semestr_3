package pk2_lab5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class LZapisz implements ActionListener {

	
	ArrayList<Dokument> lista;
	Ramka ramka;
	public LZapisz(ArrayList<Dokument> list, Ramka ramk){
		
		lista= list;
		ramka= ramk;
	}
	
	public void actionPerformed(ActionEvent e)  {

		try {
			zapisz();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	ramka.usun();
	ramka.tworzZawartosc(lista);

	}

	void zapisz() throws IOException{
		File file = new File("dokumenty.txt");
		FileWriter fwriter = new FileWriter(file);
		BufferedWriter bwriter = new BufferedWriter(fwriter);
		for (int i = 0; i < lista.size(); i++) {
			bwriter.write("Dokument\n");
			bwriter.write(lista.get(i).getTytul() + "\n");
			bwriter.write(lista.get(i).getTresc() + "\n");
		}
		bwriter.close();
		System.out.println("Documents have been saved to the file");
		
		
	}
	
}
