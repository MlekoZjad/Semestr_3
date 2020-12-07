package pk2_lab5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class LOkienko implements ActionListener {

	ArrayList<Dokument> lista;
	Ramka ramka;
	
	public LOkienko(ArrayList<Dokument> list,Ramka ramk) {
		
		lista= list;
		ramka= ramk;
		
	}
	public void actionPerformed(ActionEvent e) {

		Okienko okienko = new Okienko( lista, ramka);
		okienko.setVisible(true);

	}

}
