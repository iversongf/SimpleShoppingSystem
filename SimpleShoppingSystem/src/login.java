package SimpleShoppingSystem;


import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.SwingConstants;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JPasswordField;

import SimpleShoppingSystem.User;
import net.sf.json.JSONObject;

public class login {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField textField_1;
	protected Component contentPane1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
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
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 0));
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("\u8D26\u53F7\uFF1A");
		label.setBounds(61, 78, 54, 34);
		label.setForeground(new Color(32, 178, 170));
		label.setFont(new Font("Ã“Ã—Ã”Â²", Font.PLAIN, 17));
		frame.getContentPane().add(label);
		
		textField = new JTextField();
		textField.setBounds(125, 86, 171, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel label_3 = new JLabel("\u767B\u5F55\u60A8\u7684\u8D26\u53F7");
		label_3.setBounds(109, 13, 200, 55);
		label_3.setForeground(new Color(34, 139, 34));
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Ã‹ÃŽÃŒÃ¥", Font.PLAIN, 30));
		frame.getContentPane().add(label_3);
		
		JButton btnNewButton = new JButton("\u5173\u95ED");
		btnNewButton.setBounds(328, 216, 67, 23);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frame.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("\u786E\u8BA4");
		button.addMouseListener(new MouseAdapter() {
		                                         
			@Override
			public void mouseClicked(MouseEvent e) {
				   User use=new User();
				   String name=textField.getText();
				   String ps=passwordField.getText();
				   boolean tt;
				   tt=use.Judge(name, ps);
				   if(tt==true)
				   {   
					   JOptionPane pn1=new JOptionPane();
						pn1.showMessageDialog(contentPane1, "µÇÂ¼³É¹¦");
					   
					  
				   }else{
					   JOptionPane pn1=new JOptionPane();
						pn1.showMessageDialog(contentPane1, "µÇÂ¼Ê§°Ü");
				   }
					   
				   
			}
		});
		button.setBounds(208, 216, 67, 23);
		frame.getContentPane().add(button);
		
		JLabel lblNewLabel = new JLabel("\u5BC6\u7801\uFF1A");
		lblNewLabel.setBounds(61, 122, 54, 41);
		lblNewLabel.setForeground(new Color(102, 205, 170));
		lblNewLabel.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 17));
		frame.getContentPane().add(lblNewLabel);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(125, 133, 171, 21);
		frame.getContentPane().add(passwordField);
		
		textField_1 = new JTextField();
		textField_1.setBackground(Color.YELLOW);
		textField_1.setForeground(Color.RED);
		textField_1.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 15));
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setBounds(20, 193, 134, 46);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
	}
}
