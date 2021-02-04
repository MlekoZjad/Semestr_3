import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AppFrame extends JFrame implements ActionListener {

	public JTextField rzuty = new JTextField();
	public JTextField sciany = new JTextField();
	public JTextField wynik = new JTextField();
	public JButton start = new JButton("Start symulacji");
	public JLabel rzut = new JLabel("Liczba rzutów(n)");
	public JLabel sciana = new JLabel("Liczba œcian(k)");
	public JLabel wyniki = new JLabel("Wynik:");
	public JLabel pusty = new JLabel();
	public JPanel panel = new JPanel();
	int n, k;

	AppFrame() {
		setTitle("Kostki do gry");
		setSize(400, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		this.add(rzut);
		this.add(sciana);
		this.add(rzuty);
		this.add(sciany);
		this.add(start);
		this.add(wyniki);
		this.add(pusty);
		this.add(wynik);

		this.start.addActionListener(this);

		GridLayout gl = new GridLayout(5, 2);
		setLayout(gl);

		add(panel);
	}

	int z;
	double t;

	@Override
	public void actionPerformed(ActionEvent arg0) {

		try {
			this.n = Integer.parseInt(rzuty.getText());
			this.k = Integer.parseInt(sciany.getText());

		} catch (NumberFormatException x) {

			rzuty.setText("Wprowadz n");
			sciany.setText("Wprowadz k");
		}
		

		for (int i = 0; i <= k; i++) {
			Random random = new Random();
			int a = random.nextInt(k) + 1;
			if (a == 1) {
				this.z++;			
			}
			

		}
		t = (double)z/n;

		wynik.setText(String.valueOf(t));

	}

}
