package Hospital;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Loginframe extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
    private boolean succeeded;
	/**
	 * Launch the application.
	 */

public Loginframe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 28, 414, 222);
		panel.setBackground(Color.CYAN);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(148, 54, 120, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(148, 101, 120, 20);
		panel.add(passwordField);
		JLabel lblBirlaInstituteOf = new JLabel("BIRLA  HOSPITAL ");
		lblBirlaInstituteOf.setBounds(110, 20, 2000, 23);
		lblBirlaInstituteOf.setFont(new Font("Tahoma", Font.BOLD, 21));
		panel.add(lblBirlaInstituteOf);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			if(Login.authenticate(getUsername(), getPassword())){
				Arjun window = new Arjun();
				window.frame.setVisible(true);
			}
			else {
				JOptionPane.showInternalMessageDialog(Loginframe.this, "either name or password is wrong");
				succeeded = false;
			}
			}
		});
		btnNewButton.setBounds(148, 157, 89, 23);
		panel.add(btnNewButton);
	}
	 public String getUsername() {
	        return textField.getText().trim();
	    }
	 
	    public String getPassword() {
	        return new String(passwordField.getPassword());
	    }
	 
	    public boolean isSucceeded() {
	        return succeeded;
	    }
}
