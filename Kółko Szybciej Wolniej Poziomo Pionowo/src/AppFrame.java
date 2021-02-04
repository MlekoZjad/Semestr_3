import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AppFrame extends JFrame implements ActionListener{
	
	
	public JButton szybciej = new JButton("szybciej");
	public JButton wolniej = new JButton("wolniej");
	public JButton poziomo = new JButton("poziomo");
	public JButton pionowo = new JButton("pionowo");
	public Animation animacja;
	
	
	public AppFrame() {
		setTitle("Kó³ko odbijaj¹ce siê");
		setSize(500, 500);
		setResizable(false);
		setLocationRelativeTo(null);
		
		initGUI();
		
		this.add(szybciej,BorderLayout.NORTH);
		this.add(wolniej,BorderLayout.EAST);
		this.add(pionowo,BorderLayout.SOUTH);
		this.add(poziomo,BorderLayout.WEST);
		
		
		this.szybciej.addActionListener(this);
		this.wolniej.addActionListener(this);
		this.poziomo.addActionListener(this);
		this.pionowo.addActionListener(this);

		
	}
	
	
	public void initGUI() {
		
		
		this.setLayout(new BorderLayout());
		
		animacja = new Animation();
		this.add(animacja,BorderLayout.CENTER);
		
	}
	
	
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if(source == szybciej) {
			
			animacja.refreshRate-=5;
			
			
		}
		if(source==wolniej) {
			animacja.refreshRate+=5;
			
		}
		if(source==poziomo) {
			
			animacja.poziomoo=true;
		}
		if(source==pionowo) {
			animacja.poziomoo=false;
			
		}
		
	}

}
