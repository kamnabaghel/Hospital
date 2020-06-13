package Hospital;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.Color;

public class Main {

	private JFrame frame;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 414, 225);
		panel.setBackground(Color.CYAN);
		frame.getContentPane().add(panel);
		JLabel lblBirlaInstituteOf = new JLabel("BIRLA  HOSPITAL ");
		lblBirlaInstituteOf.setBounds(120, 20, 200, 23);
		lblBirlaInstituteOf.setFont(new Font("Tahoma", Font.BOLD, 21));
		panel.add(lblBirlaInstituteOf);
		JButton btnLoginFrom = new JButton("login from");
		btnLoginFrom.setBounds(120, 148, 189, 30);
		btnLoginFrom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			new Loginframe().setVisible(true);
			}
			
			
		});
		panel.setLayout(null);
		panel.add(btnLoginFrom);
	}

}
