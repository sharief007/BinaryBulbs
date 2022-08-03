package source;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class BinaryBulbs implements ActionListener {
	
	static JFrame f;
	JPanel jp1,jp2,jp3,i1,i2;
	static JButton B[] = new JButton[9];
	//JButton b1,b2,b3,b4,b5,b6,b7,b8;
	JButton up,down;
	static JLabel l1,l2,l3,l4,l5,l6,l7,l8,s1,s2,s3;
	static JLabel value,q;
	static JButton tb1,tb2,tb3;
	static BackEnd be = new BackEnd();
	
	static Icon i = new ImageIcon("bulb.png");
	Icon u = new ImageIcon("up.png");
	Icon d = new ImageIcon("down.png");
	static Icon b = new ImageIcon("bulb2.png");
	static Icon on = new ImageIcon("on.png");
	static Icon off = new ImageIcon("off.png");
	
	
	static boolean bulb[] = new boolean[9];
	static boolean binary = false;
	static boolean game= false;
	
	
	public static void main(String[] args) 
	{
		System.out.println(be.convert("250"));
		new BinaryBulbs();
		
	}
	public BinaryBulbs()
	{
		
		
		f =new JFrame("Binary Bulbs");
		f.setSize(600,400);
		f.getContentPane().setBackground(Color.WHITE);
		
		jp1 = new JPanel();
		jp1.setBounds(40,70,520,130);
		jp1.setLayout(null);
		
		
		B[1] = new JButton(i);
		B[1].setBounds(0,0,65,65);
		B[1].setFocusable(false);
		B[1].setBackground(Color.white);
		B[1].addActionListener(this);
		
		B[2] = new JButton(i);
		B[2].setBounds(65,0,65,65);
		B[2].setFocusable(false);
		B[2].setBackground(Color.white);
		B[2].addActionListener(this);
		
	
		B[3] = new JButton(i);
		B[3].setBounds(130,0,65,65);
		B[3].setFocusable(false);
		B[3].setBackground(Color.white);
		B[3].addActionListener(this);
		
		
		B[4] = new JButton(i);
		B[4].setBounds(195,0,65,65);
		B[4].setFocusable(false);
		B[4].setBackground(Color.white);
		B[4].addActionListener(this);
		
		
		
		B[5] = new JButton(i);
		B[5].setBounds(260,0,65,65);
		B[5].setFocusable(false);
		B[5].setBackground(Color.white);
		B[5].addActionListener(this);
		
		
		
		B[6] = new JButton(i);
		B[6].setBounds(325,0,65,65);
		B[6].setFocusable(false);
		B[6].setBackground(Color.white);
		B[6].addActionListener(this);

		
		B[7] = new JButton(i);
		B[7].setBounds(390,0,65,65);
		B[7].setFocusable(false);
		B[7].setBackground(Color.white);
		B[7].addActionListener(this);
		
		
		B[8] = new JButton(i);
		B[8].setBounds(455,0,65,65);
		B[8].setFocusable(false);
		B[8].setBackground(Color.white);
		B[8].addActionListener(this);
		
		
		l1 = new JLabel("128",JLabel.CENTER);
		l1.setBounds(0,65,65,65);
		l1.setOpaque(true);
		l1.setBackground(Color.white);
		
		l2 = new JLabel("64",JLabel.CENTER);
		l2.setBounds(65,65,65,65);
		l2.setOpaque(true);
		l2.setBackground(Color.white);
		
		l3 = new JLabel("32",JLabel.CENTER);
		l3.setBounds(130,65,65,65);
		l3.setOpaque(true);
		l3.setBackground(Color.white);
		
		l4 = new JLabel("16",JLabel.CENTER);
		l4.setBounds(195,65,65,65);
		l4.setOpaque(true);
		l4.setBackground(Color.white);
		
		l5 = new JLabel("8",JLabel.CENTER);
		l5.setBounds(260,65,65,65);
		l5.setOpaque(true);
		l5.setBackground(Color.white);
		
		l6 = new JLabel("4",JLabel.CENTER);
		l6.setBounds(325,65,65,65);
		l6.setOpaque(true);
		l6.setBackground(Color.white);
		
		l7 = new JLabel("2",JLabel.CENTER);
		l7.setBounds(390,65,65,65);
		l7.setOpaque(true);
		l7.setBackground(Color.white);
		
		l8 = new JLabel("1",JLabel.CENTER);
		l8.setBounds(455,65,65,65);
		l8.setOpaque(true);
		l8.setBackground(Color.white);
		
		
		q = new JLabel();
		q.setOpaque(true);
		q.setBackground(Color.white);
		q.setBounds(40,215,520,50);
		
		jp2 = new JPanel();
		jp2.setBounds(50,280,175,50);
		jp2.setLayout(null);
		jp2.setBackground(Color.BLUE);
		
		up = new JButton(u);
		up.setBounds(0, 0, 50, 50);
		up.setBackground(Color.white);
		up.setBorder(null);
		up.setFocusable(false);
		up.addActionListener(this);
		
		down = new JButton(d);
		down.setBounds(125,0, 50, 50);
		down.setBackground(Color.white);
		down.setBorder(null);
		down.setFocusable(false);
		down.addActionListener(this);
		
		value = new JLabel("value",JLabel.CENTER);
		value.setBounds(50,0,75,50);
		value.setOpaque(true);
		value.setBackground(Color.white);
		
		
		
		jp3 = new JPanel();
		jp3.setBounds(225,280,325,50);
		jp3.setLayout(null);
		jp3.setBackground(Color.BLUE);
		
		i1 = new JPanel();
		i1.setBounds(0,0,165,50);
		i1.setLayout(null);
		i1.setBackground(Color.white);
		
		
		i2 = new JPanel();
		i2.setBounds(165,0,165,50);
		i2.setLayout(null);
		i2.setBackground(Color.white);
		
		
		s1 = new JLabel("Bulbs",JLabel.CENTER);
		s1.setBounds(20,0,65,50);
		s1.setOpaque(true);
		s1.setBackground(Color.white);
		
		tb1 = new JButton(on);
		tb1.setBounds(90,0,70,50);
		tb1.setFocusable(false);
		tb1.setBackground(Color.white);
		tb1.setBorder(null);
		tb1.addActionListener(this);
		
		
		s2 = new JLabel("Game Play",JLabel.CENTER);
		s2.setBounds(0,0,85,50);
		s2.setOpaque(true);
		s2.setBackground(Color.white);
		
		tb2 = new JButton(off);
		tb2.setBounds(90,0,70,50);
		tb2.setFocusable(false);
		tb2.setBackground(Color.white);
		tb2.setBorder(null);
		tb2.addActionListener(this);
		
		
		
		jp1.add(B[1]);
		jp1.add(B[2]);
		jp1.add(B[3]);
		jp1.add(B[4]);
		jp1.add(B[5]);
		jp1.add(B[6]);
		jp1.add(B[7]);
		jp1.add(B[8]);
		
		
		jp1.add(l1);
		jp1.add(l2);
		jp1.add(l3);
		jp1.add(l4);
		jp1.add(l5);
		jp1.add(l6);
		jp1.add(l7);
		jp1.add(l8);
		
		jp2.add(up);
		jp2.add(down);
		jp2.add(value);
		
		jp3.add(i1);
		jp3.add(i2);
		
		i1.add(s1);
		i1.add(tb1);
		i2.add(s2);
		i2.add(tb2);
		
		f.add(jp1);
		f.add(jp2);
		f.add(jp3);
		f.add(q);
		
		
		//f.setUndecorated(true);
		f.setLayout(null);
		f.setResizable(false);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==B[1])
		{
			be.button1();
		}
		else if(e.getSource()==B[2])
		{
			be.button2();
		}
		else if(e.getSource()==B[3])
		{
			be.button3();
		}
		else if(e.getSource()==B[4])
		{
			be.button4();
		}
		else if(e.getSource()==B[5])
		{
			be.button5();
		}
		else if(e.getSource()==B[6])
		{
			be.button6();
		}
		else if(e.getSource()==B[7])
		{
			be.button7();
		}
		else if(e.getSource()==B[8])
		{
			be.button8();
		}
		else if(e.getSource()==up)
		{
			be.up_action();
		}
		else if(e.getSource()==down)
		{
			be.down_action();
		}
		else if(e.getSource()==tb1)
		{
			if(binary)
			{
				be.ToggleToBulbs();
				binary =false;
			}
			else
			{
				be.toggleToBinary();
				binary = true;
			}
		}
		else if(e.getSource()==tb2)
		{
			if(!game)
			{
				be.gameOn();
				game=true;
			}
			else
			{
				be.gameOff();
				game=false;
			}
		}
		
	}
}
