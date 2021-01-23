
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AppFrame extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	public JButton pauseButton = new JButton("Pause");
	public AnimationPanel animArea;
	public JButton faster = new JButton("Faster");
	public JButton slower = new JButton("Slower");
	public JButton toggleOrbit = new JButton("Toggle orbit");
	public JButton speedConf = new JButton("Confirm");
	public static JTextField speedCircle = new JTextField();

	public JPanel panel = new JPanel();
	public int row, col;

	public AppFrame() throws IOException {
		setTitle("Animation");
		setSize(1920, 1080);
		setResizable(false);
		setLocationRelativeTo(null);
		add(panel, BorderLayout.NORTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		initGUI();
	}

	public void initGUI() throws IOException {

		animArea = new AnimationPanel();

		this.add(animArea, BorderLayout.CENTER);
		// this.add(faster, BorderLayout.WEST);
		// this.add(slower, BorderLayout.EAST);
		// this.add(toggleOrbit, BorderLayout.NORTH);
		// this.add(pauseButton, BorderLayout.SOUTH);
		pauseButton.addActionListener(this);
		faster.addActionListener(this);
		slower.addActionListener(this);
		toggleOrbit.addActionListener(this);
		speedConf.addActionListener(this);
		speedCircle.setPreferredSize(new Dimension(80, 24));

		panel.add(faster);
		panel.add(slower);
		panel.add(toggleOrbit);
		panel.add(pauseButton);
		panel.add(speedCircle);
		panel.add(speedConf);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton source = (JButton) arg0.getSource();

		if (source == pauseButton) {
			animArea.switchAnimationState();
		} else if (source == faster) {
			animArea.speed();
		} else if (source == slower) {
			animArea.slower();
		} else if (source == toggleOrbit) {
			animArea.orbit();
		} else if (source == speedConf) {
			animArea.userSpeed();
		}

	}
}
