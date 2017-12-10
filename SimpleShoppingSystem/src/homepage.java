package 简单购物系统;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class homepage {
	private JLabel ID00;
	private JLabel name00;
	private JLabel pic00;
	private JLabel price00;
	private JComboBox comboBox1;
	private JLabel ID01;
	private JLabel name01;
	private JLabel pic01;
	private JLabel price01;
	private JComboBox comboBox2;
	private JLabel ID02;
	private JLabel name02;
	private JLabel pic03;
	private JLabel price02;
	private JComboBox comboBox3;
	private JLabel ID03;
	private JLabel name03;
	private JLabel pic04;
	private JLabel price03;
	private JComboBox comboBox4;
	private JLabel ID04;
	private JLabel name04;
	private JLabel price04;
	private JComboBox comboBox5;
	private int  totalcount=0;
	private JLabel sum;
	private JLabel count;
	private JFrame frame;
	private JLabel pic05;
	private int a1;
	private int a2;
	private int a3;
	private int a4;
	private int a5;
	private int a;
	private float p1;
	private float p2;
	private float p3;
	private float p4;
	private float p5;
	private JButton button_2;
	private JButton button;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					homepage window = new homepage();
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
	public homepage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u9996\u9875");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		button = new JButton("\u767B\u9646");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

			}
		});
		frame.getContentPane().add(button, BorderLayout.WEST);
		
		JButton button_1 = new JButton("\u6CE8\u518C");
		frame.getContentPane().add(button_1, BorderLayout.EAST);
		
		JPanel pic02 = new JPanel();
		frame.getContentPane().add(pic02, BorderLayout.CENTER);
		pic02.setLayout(new GridLayout(7, 1, 10, 10));
		
		JPanel panel_1 = new JPanel();
		pic02.add(panel_1);
		panel_1.setLayout(new GridLayout(1, 5, 0, 0));
		
		JLabel label = new JLabel("\u7F16\u53F7");
		panel_1.add(label);
		
		JLabel label_1 = new JLabel("\u540D\u79F0");
		panel_1.add(label_1);
		
		JLabel label_2 = new JLabel("\u56FE\u7247");
		panel_1.add(label_2);
		
		JLabel label_3 = new JLabel("\u4EF7\u683C");
		panel_1.add(label_3);
		
		JLabel label_5 = new JLabel("\u6570\u91CF");
		panel_1.add(label_5);
		
		JPanel panel_2 = new JPanel();
		pic02.add(panel_2);
		panel_2.setLayout(new GridLayout(1, 5, 1, 1));
		
		 ID00 = new JLabel("");
		 ID00.setBackground(Color.GREEN);
		ID00.setToolTipText("");
		panel_2.add(ID00);
		
		name00 = new JLabel("");
		name00.setBackground(Color.GREEN);
		name00.setToolTipText("");
		panel_2.add(name00);
		
		pic00 = new JLabel("");
		
		panel_2.add(pic00);
		
		price00 = new JLabel("");
		price00.setBackground(Color.GREEN);
		price00.setToolTipText("");
		panel_2.add(price00);
		
		 comboBox1 = new JComboBox();
		for(int i=0;i<=10;i++)
		{
			comboBox1.addItem(i);
		}
		comboBox1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				a1=Integer.parseInt(comboBox1.getSelectedItem().toString());
				number();
				Usergoods one=new Usergoods();
				one=one.getgoodID("1");
				p1=one.getPrice();
				count();
			}
		});
		
		panel_2.add(comboBox1);
		
		JPanel panel_3 = new JPanel();
		pic02.add(panel_3);
		panel_3.setLayout(new GridLayout(1, 5, 1, 1));
		
		 ID01 = new JLabel("");
		 ID01.setBackground(Color.GREEN);
		ID01.setToolTipText("");
		panel_3.add(ID01);
		
		 name01 = new JLabel("");
		 name01.setBackground(Color.GREEN);
		name01.setToolTipText("");
		panel_3.add(name01);
		
		pic01 = new JLabel("");
		
		panel_3.add(pic01);
		
		price01 = new JLabel("");
		price01.setBackground(Color.GREEN);
		price01.setToolTipText("");
		panel_3.add(price01);
		
		 comboBox2 = new JComboBox();
		 for(int i=0;i<=10;i++)
			{
				comboBox2.addItem(i);
			}
		comboBox2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 
				a2=Integer.parseInt(comboBox2.getSelectedItem().toString());
				number();
				Usergoods two=new Usergoods();
				two=two.getgoodID("2");
				p2=two.getPrice();
				count();
			}
		});
		panel_3.add(comboBox2);
		
		JPanel panel_4 = new JPanel();
		pic02.add(panel_4);
		panel_4.setLayout(new GridLayout(1, 5, 1, 1));
		
		ID02 = new JLabel("");
		ID02.setBackground(Color.GREEN);
		ID02.setToolTipText("");
		panel_4.add(ID02);
		
		name02 = new JLabel("");
		name02.setBackground(Color.GREEN);
		name02.setToolTipText("");
		panel_4.add(name02);
		
		pic03 = new JLabel("");
		
		panel_4.add(pic03);
		
		price02 = new JLabel("");
		price02.setBackground(Color.GREEN);
		price02.setToolTipText("");
		panel_4.add(price02);
		
		comboBox3 = new JComboBox();
		for(int i=0;i<=10;i++)
		{
			comboBox3.addItem(i);
		}
		comboBox3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 
				a3=Integer.parseInt(comboBox3.getSelectedItem().toString());
				number();
				Usergoods three=new Usergoods();
				three=three.getgoodID("3");
				p3=three.getPrice();
				count();
			}
		});
		panel_4.add(comboBox3);
		
		JPanel panel_5 = new JPanel();
		pic02.add(panel_5);
		panel_5.setLayout(new GridLayout(1, 5, 1, 1));
		
		ID03 = new JLabel("");
		ID03.setBackground(Color.GREEN);
		ID03.setToolTipText("");
		panel_5.add(ID03);
		
		name03 = new JLabel("");
		name03.setBackground(Color.GREEN);
		name03.setToolTipText("");
		panel_5.add(name03);
		
		pic04 = new JLabel("");
		
		panel_5.add(pic04);
		
		price03 = new JLabel("");
		price03.setToolTipText("");
		panel_5.add(price03);
		
		comboBox4 = new JComboBox();
		for(int i=0;i<=10;i++)
		{
			comboBox4.addItem(i);
		}
		comboBox4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 
				a4=Integer.parseInt(comboBox4.getSelectedItem().toString());
				number();
				Usergoods go4=new Usergoods();
				go4=go4.getgoodID("4");
			    p4=go4.getPrice();
			    count();
			}
		});
		panel_5.add(comboBox4);
		
		JPanel panel_6 = new JPanel();
		pic02.add(panel_6);
		panel_6.setLayout(new GridLayout(1, 5, 1, 1));
		
		ID04 = new JLabel("");
		ID04.setBackground(Color.GREEN);
		ID04.setToolTipText("");
		panel_6.add(ID04);
		
		name04 = new JLabel("");
		name04.setBackground(Color.GREEN);
		name04.setToolTipText("");
		panel_6.add(name04);
		
		pic05 = new JLabel("");
		panel_6.add(pic05);
		
		price04 = new JLabel("");
		price04.setBackground(Color.GREEN);
		price04.setToolTipText("");
		panel_6.add(price04);
		
		 comboBox5 = new JComboBox();
		 for(int i=0;i<=10;i++)
			{
				comboBox5.addItem(i);
			}
		comboBox5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			   	
				a5=Integer.parseInt(comboBox5.getSelectedItem().toString());
				number();
				Usergoods go5=new Usergoods();
				go5=go5.getgoodID("5");
				p5=go5.getPrice();
				count();
			}
		});
		panel_6.add(comboBox5);
		
		JPanel panel_7 = new JPanel();
		pic02.add(panel_7);
		panel_7.setLayout(new GridLayout(1, 6, 0, 0));
		
		JLabel Number = new JLabel("\u6570\u91CF:");
		panel_7.add(Number);
		
		 sum = new JLabel("");
		panel_7.add(sum);
		
		JLabel Price = new JLabel("\u603B\u4EF7\uFF1A");
		panel_7.add(Price);
		
		count = new JLabel("");
		panel_7.add(count);
		
		JButton btnNewButton1 = new JButton("\u8D2D\u7269\u8F66");
		panel_7.add(btnNewButton1);
		
		JButton btnNewButton2 = new JButton("\u7ED3\u7B97");
		panel_7.add(btnNewButton2);
		
		JPanel panel2 = new JPanel();
		frame.getContentPane().add(panel2, BorderLayout.SOUTH);
		
		button_2 = new JButton("\u4E0B\u4E00\u9875");
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		panel2.add(button_2);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		
		JLabel label_4 = new JLabel("\u5929\u5929\u8D2D\u7269");
		label_4.setForeground(Color.GREEN);
		label_4.setBackground(Color.RED);
		panel.add(label_4);
		load();
	}
	public void number(){
		//数量增加近
		a=a1+a2+a3+a4+a5;
		sum.setText(String.valueOf(a));
	}
	public void count(){
		//总价
		float sum=a1*p1+a2*p2+a3*p3+a4*p4+a5*p5;
		count.setText(String.valueOf(sum));
	}
    public void load()
    {
		Usergoods goods1=new Usergoods();
		goods1=goods1.getgoodID("1");
		ID00.setText(goods1.getId().toString());
		name00.setText(goods1.getName1().toString());
		price00.setText(String.valueOf(goods1.getPrice()));
		String phouto1=goods1.getPhoto().toString();
		ImageIcon img1=new ImageIcon(getClass().getResource("/"+phouto1));
		pic00.setIcon(img1);
		
		Usergoods goods2=new Usergoods();
		goods2=goods2.getgoodID("2");
		ID01.setText(goods2.getId().toString());
		name01.setText(goods2.getName1().toString());
		String phouto2=goods2.getPhoto().toString();
		price01.setText(String.valueOf(goods2.getPrice()));
		ImageIcon img2=new ImageIcon(getClass().getResource("/"+phouto2));
	    pic01.setIcon(img2);
		
		Usergoods goods3=new Usergoods();
		goods3=goods3.getgoodID("3");
		ID02.setText(goods3.getId().toString());
		name02.setText(goods3.getName1().toString());
		price02.setText(String.valueOf(goods3.getPrice()));
		String phout3=goods3.getPhoto().toString();
		ImageIcon img3=new ImageIcon(getClass().getResource("/"+phout3));
	    pic03.setIcon(img3);
		
		Usergoods goods4=new Usergoods();
		goods4=goods4.getgoodID("4");
		ID03.setText(goods4.getId().toString());
		name03.setText(goods4.getName1().toString());
		price03.setText(String.valueOf(goods4.getPrice()));
		String phout4=goods4.getPhoto().toString();
		ImageIcon img4=new ImageIcon(getClass().getResource("/"+phout4));
	    pic04.setIcon(img4);
		
		Usergoods goods5=new Usergoods();
		goods5=goods5.getgoodID("5");
		ID04.setText(goods5.getId().toString());
		name04.setText(goods5.getName1().toString());
		price04.setText(String.valueOf(goods5.getPrice()));
		String phout5=goods5.getPhoto().toString();
		ImageIcon img5=new ImageIcon(getClass().getResource("/xifashui.jpg"));
		pic05.setIcon(img5);
	
    }
}
