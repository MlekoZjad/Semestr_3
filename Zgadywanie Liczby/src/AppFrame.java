import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*A u mnie trzeba by�o zareagowa� na klikni�cie przycisku "START"w spos�b nast�puj�cy: 
 * wylosowa� liczb� od 1 do 100- i nie wy�wietla� u�ytkownikowi. 
 * Nast�pnie u�ytkownik wpisywa� liczb� i klika� "zgaduj" wtedy w polu JTextField mia� si� wy�wietla�" za ma�a"/"za du�a"/ "brawo- odgad�e� w X pr�bach." 
 * A tam gdzie x- mia�o by� wyliczone jak d�ugo u�ytkownik zgadywa�. */
public class AppFrame extends JFrame implements ActionListener {

	public JButton start = new JButton("start");
	public JTextField liczba = new JTextField();
	public JButton zgaduj = new JButton("zgaduj");
	public JTextField wynik = new JTextField();

	public JPanel panel = new JPanel();

	AppFrame() {
		setTitle("Zgadywanie liczby");
		setSize(500, 500);
		setLocationRelativeTo(null);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		initGUI();
	}

	public void initGUI() {

		this.setLayout(new BorderLayout());

		start.setPreferredSize(new Dimension(400, 100));
		liczba.setPreferredSize(new Dimension(400, 100));
		zgaduj.setPreferredSize(new Dimension(400, 100));
		wynik.setPreferredSize(new Dimension(400, 100));

		start.addActionListener(this);
		zgaduj.addActionListener(this);

		panel.add(start);
		panel.add(liczba);
		panel.add(zgaduj);
		panel.add(wynik);
		this.add(panel);
	}

	int x;
	int i = 0;

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();

		if (source == start) {
			this.x = (int) (Math.random() * 100);
		}
		if (source == zgaduj) {
			i++;
			int z = Integer.parseInt(liczba.getText());

			if (z > x) {
				wynik.setText("Za du�a");
			}
			if (z < x) {
				wynik.setText("Za ma�a");

			}
			if (z == x) {
				wynik.setText("Zgad�e� za " + String.valueOf(i) + ". razem");
			}

		}

	}

}
