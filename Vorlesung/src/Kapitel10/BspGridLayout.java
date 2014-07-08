package Kapitel10;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

public class BspGridLayout {

	private BspGridLayout(String title){
		
		JFrame fenster = new JFrame(title);
		
		fenster.setLayout(new GridLayout(0,2));
		
		final JLabel nameTxt = new JLabel("Name:");
		final JTextField nameField = new JTextField(20);
		
		
		
		
		ItemListener bizepsHoerer = new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == e.SELECTED){
					System.out.println("Combobox geändert!");
				
					JComboBox box = (JComboBox)e.getSource();
				
					System.out.println(box.getSelectedItem());
					System.out.println(e.getStateChange());
					
					nameTxt.setText("Neuer Wert gewählt!");
					nameField.setText("Anderer Name");
				}
				
			}
		};
		
		nameField.setText("Murvin");
		
		JLabel buTxt = new JLabel("Bizepsumfang:");
		//JTextField buField = new JTextField();
		
		//Vector werte = new Vector();
		
		Object[] werte = {40, 42, 44, 46};
		
		JComboBox buField = new JComboBox(werte);
		buField.addItemListener(bizepsHoerer);
		
		Border rahmen = BorderFactory.createBevelBorder(BevelBorder.RAISED);
		
		
		JPanel nameTxtPanel = new JPanel(new FlowLayout());
		nameTxtPanel.add(nameTxt);
		nameTxtPanel.setBorder(rahmen);
		JPanel nameFieldPanel = new JPanel(new FlowLayout());
		nameFieldPanel.add(nameField);
		
		
		fenster.add(nameTxtPanel);
		fenster.add(nameFieldPanel);
		fenster.add(buTxt);
		fenster.add(buField);
		
		
		fenster.pack();
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenster.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new BspGridLayout("GridLayout Beispiel");

	}

}
