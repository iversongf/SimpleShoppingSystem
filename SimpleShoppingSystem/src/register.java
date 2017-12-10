package SimpleShoppingSystem;


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
import java.awt.Component;
import java.awt.SystemColor;
import java.io.*;
import java.util.HashMap;

import javax.swing.JPasswordField;

import SimpleShoppingSystem.User;

public class register {

	private JFrame frame;
	private JTextField textField0;
	private JTextField textField1;
	private JPasswordField passwordField0;
	private JPasswordField passwordField;
	private JLabel textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					register window = new register();
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
	public register() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(new Color(255, 255, 0));
		frame.getContentPane().setBackground(new Color(255, 255, 0));
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setTitle("\u6CE8\u518C\u754C\u9762");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
	    JLabel label0 = new JLabel("\u8D26\u53F7\uFF1A");
		label0.setFont(new Font("隶书", Font.PLAIN, 14));
		label0.setForeground(new Color(34, 139, 34));
		label0.setBounds(36, 75, 54, 15);
		frame.getContentPane().add(label0);
		
		JLabel label1 = new JLabel("\u5BC6\u7801\uFF1A");
		label1.setFont(new Font("隶书", Font.PLAIN, 14));
		label1.setForeground(new Color(34, 139, 34));
		label1.setBounds(36, 137, 54, 15);
		frame.getContentPane().add(label1);
		
		textField0 = new JTextField();
		textField0.setBounds(125, 72, 171, 21);
		frame.getContentPane().add(textField0);
		textField0.setColumns(10);
		
		textField1 = new JTextField();
		textField1.setBounds(125, 103, 171, 21);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		JLabel label_3 = new JLabel("\u6CE8\u518C\u65B0\u8D26\u53F7");
		label_3.setForeground(new Color(255, 215, 0));
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("宋体", Font.PLAIN, 30));
		label_3.setBounds(105, 10, 200, 44);
		frame.getContentPane().add(label_3);
		
		JButton Button1 = new JButton("\u53D6\u6D88");
		Button1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField0.setText("");
                passwordField0.setText("");
                passwordField.setText("");
                textField1.setText("");
			}
		});
		Button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Button1.setBounds(357, 216, 67, 23);
		frame.getContentPane().add(Button1);
		
		JButton button = new JButton("\u6CE8\u518C");
		button.addMouseListener(new MouseAdapter() {
			private Component contentPane1;

			@Override
			public void mouseClicked(MouseEvent e) {
				
				String name=textField0.getText();
                String ps=passwordField0.getText();
                String cops=passwordField.getText();
                String em=textField1.getText();
                User use=new User();
                
                	if(name.equals("")||ps.equals("")||cops.equals("")||em.equals(""))
                    {
                    	textField.setText("请填写信息");
                    	textField.repaint();
                    }
                	
                	else
                    {
                    	if(ps.equals(cops))
                    	{
                    		
                        textField.setText("密码一致");
                        textField.repaint();
                       
                        boolean t;
                        t=use.usernameregist(name);
                    	 if(t==true)	
                         {
                    		 use.saveuser(name, ps, em);
                    		 textField.setText("注册成功");
                        	 textField.repaint();
                        	 
                         }
                    	 else
                    	 {
                    		 textField.setText("该用户已经存在");
                        	 textField.repaint();
                        	 
                    	 }
                    	
                        }
                        
                    	
                    	else
                    		
                    	{
                        	textField.setText("密码不一致");
                        	textField.repaint();
                        }
                    
                    
                    	
                    	
                    }
                	
            	
           
			}
		});
		button.setBounds(229, 216, 67, 23);
		frame.getContentPane().add(button);
		
		JLabel label4 = new JLabel("\u90AE\u7BB1\uFF1A");
		label4.setFont(new Font("闅朵功", Font.PLAIN, 14));
		label4.setForeground(new Color(34, 139, 34));
		label4.setBounds(36, 106, 54, 15);
		frame.getContentPane().add(label4);
		
		passwordField0 = new JPasswordField();
		passwordField0.setBounds(125, 134, 171, 21);
		frame.getContentPane().add(passwordField0);
		
		JLabel label = new JLabel("\u786E\u8BA4\u5BC6\u7801\uFF1A");
		label.setForeground(new Color(34, 139, 34));
		label.setFont(new Font("闅朵功", Font.PLAIN, 14));
		label.setBounds(20, 171, 83, 15);
		frame.getContentPane().add(label);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(125, 168, 171, 21);
		frame.getContentPane().add(passwordField);
		
		textField = new JLabel();
		textField.setForeground(Color.RED);
		textField.setBackground(Color.YELLOW);
		textField.setFont(new Font("妤蜂綋", Font.PLAIN, 17));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(20, 205, 162, 42);
		textField.setBorder(null);
		frame.getContentPane().add(textField);
	}
}
