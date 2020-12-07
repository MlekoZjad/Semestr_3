package pk2_lab5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LAnuluj implements ActionListener {

	Okienko ok;
	
	public LAnuluj(Okienko okno) {
		ok = okno;
	}
	public void actionPerformed(ActionEvent e) {
		ok.zamknij();

	}

}
