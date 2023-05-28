import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Thirdpage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Thirdpage frame = new Thirdpage();
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
	public Thirdpage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NEXT");
		lblNewLabel.setFont(new Font("Rockwell", Font.PLAIN, 14));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\TOSHIBA\\Pictures\\Saved Pictures\\3.3.png"));
		lblNewLabel.setBounds(0, 0, 800, 400);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.setFont(new Font("Rockwell", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Secondpage Secondpage = new Secondpage();
				Secondpage.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(336, 336, 89, 23);
		contentPane.add(btnNewButton);
	}

}
