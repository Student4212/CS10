package Window;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JInternalFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class Cr3GUI 
{

	private JFrame frame;
	private JTextField tx1;
	private JTextField tx2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					Cr3GUI window = new Cr3GUI();
					window.frame.setVisible(true);
				}
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		}
		);
	}

	/**
	 * Create the application.
	 */
	public Cr3GUI() 
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 575, 417);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel FN = new JLabel("First Name");
		FN.setBounds(10, 65, 116, 14);
		panel.add(FN);
		
		tx1 = new JTextField();
		tx1.setBounds(136, 65, 86, 20);
		panel.add(tx1);
		tx1.setColumns(10);
		
		JLabel LN = new JLabel("Last Name");
		LN.setBounds(11, 112, 115, 14);
		panel.add(LN);
		
		tx2 = new JTextField();
		tx2.setBounds(136, 112, 86, 20);
		panel.add(tx2);
		tx2.setColumns(10);
		
		JLabel grd = new JLabel("Grade\r\n");
		grd.setBounds(42, 158, 84, 14);
		panel.add(grd);
		
		JComboBox tx3 = new JComboBox();
		tx3.setModel(new DefaultComboBoxModel(new String[] {"10", "11", "12"}));
		tx3.setBounds(136, 154, 86, 22);
		panel.add(tx3);
		
		JLabel DIS = new JLabel("");
		DIS.setBounds(15, 203, 379, 47);
		panel.add(DIS);
		
		
		JButton NB = new JButton("Submit");
		NB.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String first = tx1.getText(); 
				String last = tx2.getText();
				int grade; 
				
				if(tx3.getSelectedItem().equals("10"))
				{
					grade = 10; 
				}
				else if(tx3.getSelectedItem().equals("11")) 
				{
					grade = 11; 
				}
				else 
				{
					grade = 12; 
				}
				
				
				DIS.setText("First name: "+ first +" Last name: "+ last + " Age: " + grade);
				
			}
		}
		);
		NB.setBounds(279, 61, 89, 23);
		panel.add(NB);
		
		JButton NB1 = new JButton("Reset");
		NB1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				tx1.setText(" "); 
				tx2.setText(" "); 
				
			}
		}
		);
		NB1.setBounds(279, 154, 89, 23);
		panel.add(NB1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 208, 397, 42);
		panel.add(lblNewLabel);
		
		
	
	}
}
