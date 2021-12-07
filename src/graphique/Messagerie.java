package JFrame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Messagerie {

	private JFrame frame;
	private JTextField textFieldSujetMsg;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Messagerie window = new Messagerie();
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
	public Messagerie() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 876, 695);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Sujet");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(60, 96, 78, 30);
		frame.getContentPane().add(lblNewLabel_1);
		
		textFieldSujetMsg = new JTextField();
		textFieldSujetMsg.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldSujetMsg.setBounds(130, 98, 632, 30);
		frame.getContentPane().add(textFieldSujetMsg);
		textFieldSujetMsg.setColumns(10);
		
		JButton btnSendMsg = new JButton("ENVOYER");
		btnSendMsg.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSendMsg.setBounds(105, 516, 144, 53);
		frame.getContentPane().add(btnSendMsg);
		
		JButton btnCancelMsg = new JButton("ANNULER");
		btnCancelMsg.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnCancelMsg.setBounds(598, 514, 144, 57);
		frame.getContentPane().add(btnCancelMsg);
		
		JLabel lblNewLabel = new JLabel("Message");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBounds(370, 161, 119, 24);
		frame.getContentPane().add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(60, 195, 718, 267);
		frame.getContentPane().add(scrollPane);
		
		JTextArea textAreaMsg = new JTextArea();
		textAreaMsg.setLineWrap(true);
		textAreaMsg.setWrapStyleWord(true);
		textAreaMsg.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		scrollPane.setViewportView(textAreaMsg);
		
		JLabel lblNewLabel_2 = new JLabel("Une remarque, une suggestion ? N'h\u00E9sitez pas \u00E0 nous \u00E9crire ! ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_2.setBounds(130, 0, 632, 69);
		frame.getContentPane().add(lblNewLabel_2);
	}
}
