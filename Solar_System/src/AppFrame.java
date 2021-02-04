
import javax.swing.JFrame;


public class AppFrame extends JFrame {
	
	private static final long serialVersionUID = 1L;

	public AppFrame() {
		setTitle("Part of Solar System");
		setSize(1920, 1080);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		initGUI();
	}
	
	public void initGUI() {
		Animation animArea = new Animation();
		add(animArea);
		this.addKeyListener(animArea);
	}
}
