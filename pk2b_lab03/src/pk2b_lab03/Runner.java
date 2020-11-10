package pk2b_lab03;

import javax.swing.JFrame;

public class Runner {

	public static void main(String[] args) {
		

		// tworzenie nowej ramki
		Ramka mojaRamka = new Ramka();
		// zamykanie aplikacji po wcisnieciu "X"
		mojaRamka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// wyswietlenie jej (ustawienie - widoczna)
		mojaRamka.setVisible(true);

}
}
