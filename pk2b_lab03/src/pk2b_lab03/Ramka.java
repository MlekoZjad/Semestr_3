package pk2b_lab03;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Ramka extends JFrame implements ActionListener{

	/*
	 * Konstruktor tworzacy 2 przyciski oraz "panel" ktory wybiera
	 * okreslone dzialanie w zaleznosci od tego, ktory przycisk wcisniemy
	 */
	
	public JButton przycisk;
	public JButton przycisk2;
	public GridLayout panel;
	public JTextField poleTekstowe;
	
	
	public Ramka(){
		// nazwa ramki
		setTitle("Aplikacja");
		// tworzenie przycisku i odawanie napisu znajdujacego sie na nim
		this.przycisk = new JButton("Klikac na wlasne ryzyko");
		// wyswietlenie przycisku
		this.add(przycisk);
		// dopasowanie zawartosci do ramki
		pack();
		// wywolanie okna z napisem znajdujacym sie w metodzie actionPerformed
		przycisk.addActionListener(this);	
		// tworzenie panelu kilku przyciskow (wiersze, kolumny)
		GridLayout panel = new GridLayout(2,2);
		
		this.setLayout(panel);
		
		// tworzenie drugiego przycisku i odawanie napisu znajdujacego sie na nim
		this.przycisk2 = new JButton("Klikasz po raz drugi");
		// wyswietlenie przycisku
		this.add(przycisk2);
		przycisk2.addActionListener(this);
		// stworzenie pola tekstowego z napiesem wpisz
		this.poleTekstowe = new JTextField("Wpisz...");
		// dodanie pola tekstowego
		this.add(poleTekstowe);
		

	}

	public void actionPerformed(ActionEvent e) {
		
		/*
		 *  ========================
		 *  uruchomienie okna z napisem po nacisnieciu przycisku
		 * 		 JOptionPane.showMessageDialog(null, "Dziala! I'm a genius!");
		 * ==========================
		 */
		
		
		/*
		 *  okreslone dzialanie po nacisnieciu odpowiedniego klawisza przy 
		 *  uzyciu obiektu "zrodlo", ktore sprawdza, wybrany przez uzytkownika 
		 *  przycisk
		 */
		
		// tworzenie nowego obiektu o nazwie 'zrodlo'
		JButton zrodloZdarzenia = (JButton) e.getSource();
			/*
			 *  instrukcja warunkowa wywolujaca okreslone dzialanie po
			 *  nacisnieciu odpowiedniego klawisza
			 */
		
			if (zrodloZdarzenia==this.przycisk) {	
				// wyswietlenie okna dialogowego z napisem
			JOptionPane.showMessageDialog(null, "Dziala! I'm a genius!");
			}
				else if (zrodloZdarzenia==this.przycisk2) {
					// wyswietla nowe okienkko z napisem
					JOptionPane.showMessageDialog(null, "Klikniete");
					// zmienia napis w polu tekstowym
					poleTekstowe.setText("Klikniete...");
			}

	
	}
	
	
}
