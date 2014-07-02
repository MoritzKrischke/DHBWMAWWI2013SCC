package Kapitel10;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ErstesFenster {


	public static void main(String[] args) {
		
		JFrame fenster = new JFrame("Erstes Fenster");
		
		JLabel text = new JLabel("Hallo Welt!");
		
		
		
		JButton klick = new JButton("Klick mich");
		
		
		
		FlowLayout flow = new FlowLayout(FlowLayout.RIGHT);
		fenster.setLayout(flow);
		
		fenster.add(klick);
		
		fenster.add(text);
		
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		fenster.pack();
		fenster.setVisible(true);

	}

}
