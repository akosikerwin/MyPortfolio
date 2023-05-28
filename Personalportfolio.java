import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class personalportfolio extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					personalportfolio frame = new personalportfolio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public personalportfolio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\TOSHIBA\\Pictures\\Saved Pictures\\1.1.png"));
		lblNewLabel.setBounds(0, 0, 800, 450);
		contentPane.add(lblNewLabel);
		
		
		JButton btnNewButton1 = new JButton("button");
		btnNewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Secondpage Secondpage = new Secondpage();
				Secondpage.setVisible(true);
				dispose();
			}
		});
		btnNewButton1.setBounds(308, 316, 195, 23);
		btnNewButton1.setOpaque(false);
		btnNewButton1.setContentAreaFilled(false);
		btnNewButton1.setBorderPainted(false);
		contentPane.add(btnNewButton1);
	}
}
