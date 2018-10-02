package dice;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class aaaa extends JFrame {

	private JPanel contentPane;
	/**
	 * @wbp.nonvisual location=34,564
	 */
	private final JButton button = new JButton("New button");
	private JTextField txtBelt;
	private JTextField txtPlayername;
	private JTextField txtPlayername_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					aaaa frame = new aaaa();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public aaaa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 714, 523);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Roll1");
		btnNewButton.setBounds(481, 26, 106, 37);
		contentPane.add(btnNewButton);
		
		txtBelt = new JTextField();
		txtBelt.setBounds(98, 128, 207, 50);
		contentPane.add(txtBelt);
		txtBelt.setColumns(10);
		
		JTextArea txtrResult = new JTextArea();
		txtrResult.setText("Result:");
		txtrResult.setBounds(47, 265, 325, 158);
		contentPane.add(txtrResult);
		
		txtPlayername = new JTextField();
		txtPlayername.setText("Player1name\uFF1A");
		txtPlayername.setBounds(47, 26, 258, 37);
		contentPane.add(txtPlayername);
		txtPlayername.setColumns(10);
		
		txtPlayername_1 = new JTextField();
		txtPlayername_1.setText("Player2name\uFF1A");
		txtPlayername_1.setColumns(10);
		txtPlayername_1.setBounds(47, 76, 258, 37);
		contentPane.add(txtPlayername_1);
		
		JTextArea txtrBelt = new JTextArea();
		txtrBelt.setText("Belt:");
		txtrBelt.setBounds(47, 128, 39, 50);
		contentPane.add(txtrBelt);
	}
}
