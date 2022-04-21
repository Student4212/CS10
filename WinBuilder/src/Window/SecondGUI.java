package Window;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SecondGUI {

	private JFrame frame;
	private JTextField td;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SecondGUI window = new SecondGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SecondGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 444, 291);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 198);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter 2 digits");
		lblNewLabel.setBounds(10, 11, 79, 14);
		panel.add(lblNewLabel);
		
		td = new JTextField();
		td.setBounds(99, 8, 86, 20);
		panel.add(td);
		td.setColumns(10);
		
		JLabel Dis = new JLabel(" ");
		Dis.setBounds(26, 128, 378, 59);
		panel.add(Dis);
		
		JButton btnNewButton = new JButton("Enter");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String twoDigit = td.getText(); 
				int twoD = Integer.parseInt(twoDigit); 
				int firstD = twoD/10; //record first digit 
				int secondD = twoD%10; //record second digit
				int sum = firstD+secondD;//record sum
				int prdc = firstD*secondD;//record product
				int check = sum+prdc;
				//Dis.setText(""+sum);//display the special number
				if(check==prdc) 
				{
					Dis.setText(twoD+" is a special two digit number");
				}
				else
				{
					Dis.setText(twoD+" is not a special two digit number");
				}
				
			}
		}
		);
		btnNewButton.setBounds(278, 7, 89, 23);
		panel.add(btnNewButton);
		
		
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				td.setText("");
				Dis.setText("");
			}
		});
		btnNewButton_1.setBounds(278, 35, 89, 23);
		panel.add(btnNewButton_1);
	}
}
