import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*A u mnie trzeba by³o zareagowaæ na klikniêcie przycisku "START"w sposób nastêpuj¹cy: 
 * wylosowaæ liczbê od 1 do 100- i nie wyœwietlaæ u¿ytkownikowi. 
 * Nastêpnie u¿ytkownik wpisywa³ liczbê i klika³ "zgaduj" wtedy w polu JTextField mia³ siê wyœwietlaæ" za ma³a"/"za du¿a"/ "brawo- odgad³eœ w X próbach." 
 * A tam gdzie x- mia³o byæ wyliczone jak d³ugo u¿ytkownik zgadywa³. */
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
				wynik.setText("Za du¿a");
			}
			if (z < x) {
				wynik.setText("Za ma³a");

			}
			if (z == x) {
				wynik.setText("Zgad³eœ za " + String.valueOf(i) + ". razem");
			}

		}

	}

}
