package lab5GUI;

import java.util.ArrayList;

import javax.swing.JFrame;

public class Runner {

	public static void main(String[] args) {

		ArrayList<Document> list = new ArrayList<Document>();

		Document d1 = new Document("pierwszy", "jeden");
		Document d2 = new Document("drugi", "dwa");
		Document d3 = new Document("trzeci", "trzy");

		list.add(d1);
		list.add(d2);
		list.add(d3);

		Frame frame = new Frame(list);
		frame.setVisible(true);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Lab06GUI");
		
	}

}
