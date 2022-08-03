package source;

import java.awt.*;
import java.util.Random;

import javax.swing.JOptionPane;

public class BackEnd {

	Random random = new Random();
	int answer=0;
	public void up_action()
	{
		if(BinaryBulbs.game)
		{
			//do nothing
		}
		else
		{
			String value = BinaryBulbs.value.getText();
			int v;
			if(value.equals("value"))
			{
				
				v=1;
				BinaryBulbs.value.setText(String.valueOf(v));
				getBulbs(convert(String.valueOf(v)));
				setBulbs(BinaryBulbs.bulb);
			}
			else
			{
				v=Integer.parseInt(value);
				v++;
				BinaryBulbs.value.setText(String.valueOf(v));
				getBulbs(convert(String.valueOf(v)));
				setBulbs(BinaryBulbs.bulb);
			}
		}
	}
	public void down_action()
	{
		if(BinaryBulbs.game)
		{
			//do nothing
		}
		else
		{
			String value =BinaryBulbs.value.getText();
			int v;
			if(value.equals("1"))
			{
				setZero();
			}
			else if(value.equals("value"))
			{
				//do nothing
			}
			else
			{
				v = Integer.parseInt(value);
				BinaryBulbs.value.setText(String.valueOf(--v));
				getBulbs(convert(String.valueOf(BinaryBulbs.value.getText())));
				setBulbs(BinaryBulbs.bulb);
			}
		}
	}
	
	public void toggleToBinary()
	{
		BinaryBulbs.tb1.setIcon(BinaryBulbs.off);
		for(int i=1;i<=8;i++)
		{
			if(BinaryBulbs.bulb[i])
			{
				BinaryBulbs.B[i].setIcon(null);
				BinaryBulbs.B[i].setFont(new Font("serif",Font.BOLD,40));
				BinaryBulbs.B[i].setText("1");
			}
			else
			{
				BinaryBulbs.B[i].setIcon(null);
				BinaryBulbs.B[i].setFont(new Font("serif",Font.BOLD,40));
				BinaryBulbs.B[i].setText("0");
			}
		}
	}
	public void ToggleToBulbs()
	{
		BinaryBulbs.tb1.setIcon(BinaryBulbs.on);
		for(int i=1;i<=8;i++)
		{
			if(BinaryBulbs.bulb[i])
			{
				BinaryBulbs.B[i].setText(null);
				BinaryBulbs.B[i].setIcon(BinaryBulbs.b);
			}
			else
			{
				BinaryBulbs.B[i].setText(null);
				BinaryBulbs.B[i].setIcon(BinaryBulbs.i);
			}
		}
	}
	
	
	
	public void gameOn()
	{
		setZero();
		int v = (int) random.nextInt(255);
		v++;
		String ques = "How do you represent "+String.valueOf(v)+" in binary  ?";
		answer = v;
		BinaryBulbs.tb2.setIcon(BinaryBulbs.on);
		BinaryBulbs.q.setBackground(Color.yellow);
		BinaryBulbs.q.setText(ques);
		BinaryBulbs.q.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
	}
	
	public void gameOff()
	{
		BinaryBulbs.tb2.setIcon(BinaryBulbs.off);
		BinaryBulbs.q.setText(null);
		BinaryBulbs.q.setBackground(Color.white);
	}
	
	
	public void button1()
	{
		if(BinaryBulbs.binary)
		{
			if(!(BinaryBulbs.bulb[1]))
			{
				BinaryBulbs.B[1].setIcon(null);
				BinaryBulbs.B[1].setText("1");
				BinaryBulbs.bulb[1] = true;
				//BinaryBulbs.l1.setForeground(Color.YELLOW);
				BinaryBulbs.value.setText(getValue());
				if(BinaryBulbs.game)
				{
					check();
				}
			}
			else
			{
				BinaryBulbs.B[1].setIcon(null);
				BinaryBulbs.B[1].setText("0");
				BinaryBulbs.bulb[1] = false;
				BinaryBulbs.value.setText(getValue());
				if(BinaryBulbs.game)
				{
					check();
				}
			}
		}
		else
		{
			if(!(BinaryBulbs.bulb[1]))
			{
				BinaryBulbs.B[1].setIcon(BinaryBulbs.b);
				BinaryBulbs.bulb[1] = true;
				BinaryBulbs.value.setText(getValue());
				if(BinaryBulbs.game)
				{
					check();
				}
				//BinaryBulbs.l1.setForeground(Color.YELLOW);
			}
			else
			{
				BinaryBulbs.B[1].setIcon(BinaryBulbs.i);
				BinaryBulbs.bulb[1] = false;
				BinaryBulbs.value.setText(getValue());
				if(BinaryBulbs.game)
				{
					check();
				}
			}
		}
	}
	
	
	public void button2()
	{
		if(BinaryBulbs.binary)
		{
			if(!(BinaryBulbs.bulb[2]))
			{
				BinaryBulbs.B[2].setIcon(null);
				BinaryBulbs.B[2].setText("1");
				BinaryBulbs.bulb[2] = true;
				BinaryBulbs.value.setText(getValue());
				if(BinaryBulbs.game)
				{
					check();
				}
				//BinaryBulbs.l2.setForeground(Color.YELLOW);
			}
			else
			{
				BinaryBulbs.B[2].setIcon(null);
				BinaryBulbs.B[2].setText("0");
				BinaryBulbs.bulb[2] = false;
				BinaryBulbs.value.setText(getValue());
				if(BinaryBulbs.game)
				{
					check();
				}
			}
		}
		else
		{
			if(!(BinaryBulbs.bulb[2]))
			{
				BinaryBulbs.B[2].setIcon(BinaryBulbs.b);
				BinaryBulbs.bulb[2] = true;
				BinaryBulbs.value.setText(getValue());
				if(BinaryBulbs.game)
				{
					check();
				}
				//BinaryBulbs.l2.setForeground(Color.YELLOW);
			}
			else
			{
				BinaryBulbs.B[2].setIcon(BinaryBulbs.i);
				BinaryBulbs.bulb[2] = false;
				BinaryBulbs.value.setText(getValue());
				if(BinaryBulbs.game)
				{
					check();
				}
			}
		}
	}
	
	
	public void button3()
	{
		if(BinaryBulbs.binary)
		{
			if(!(BinaryBulbs.bulb[3]))
			{
				BinaryBulbs.B[3].setIcon(null);
				BinaryBulbs.B[3].setText("1");
				BinaryBulbs.bulb[3] = true;
				BinaryBulbs.value.setText(getValue());
				if(BinaryBulbs.game)
				{
					check();
				}
				//BinaryBulbs.l3.setForeground(Color.YELLOW);
			}
			else
			{
				BinaryBulbs.B[3].setIcon(null);
				BinaryBulbs.B[3].setText("0");
				BinaryBulbs.bulb[3] = false;
				BinaryBulbs.value.setText(getValue());
				if(BinaryBulbs.game)
				{
					check();
				}
			}
		}
		else
		{
			if(!(BinaryBulbs.bulb[3]))
			{
				BinaryBulbs.B[3].setIcon(BinaryBulbs.b);
				BinaryBulbs.bulb[3] = true;
				BinaryBulbs.value.setText(getValue());
				if(BinaryBulbs.game)
				{
					check();
				}
				//BinaryBulbs.l3.setForeground(Color.YELLOW);
			}
			else
			{
				BinaryBulbs.B[3].setIcon(BinaryBulbs.i);
				BinaryBulbs.bulb[3] = false;
				BinaryBulbs.value.setText(getValue());
				if(BinaryBulbs.game)
				{
					check();
				}
			}
		}
	}
	
	
	public void button4()
	{
		if(BinaryBulbs.binary)
		{
			if(!(BinaryBulbs.bulb[4]))
			{
				BinaryBulbs.B[4].setIcon(null);
				BinaryBulbs.B[4].setText("1");
				BinaryBulbs.bulb[4] = true;
				BinaryBulbs.value.setText(getValue());
				if(BinaryBulbs.game)
				{
					check();
				}
				//BinaryBulbs.l4.setForeground(Color.YELLOW);
			}
			else
			{
				BinaryBulbs.B[4].setIcon(null);
				BinaryBulbs.B[4].setText("0");
				BinaryBulbs.bulb[4] = false;
				BinaryBulbs.value.setText(getValue());
				if(BinaryBulbs.game)
				{
					check();
				}
			}
		}
		else
		{
			if(!(BinaryBulbs.bulb[4]))
			{
				BinaryBulbs.B[4].setIcon(BinaryBulbs.b);
				BinaryBulbs.bulb[4] = true;
				BinaryBulbs.value.setText(getValue());
				if(BinaryBulbs.game)
				{
					check();
				}
				//BinaryBulbs.l4.setForeground(Color.YELLOW);
			}
			else
			{
				BinaryBulbs.B[4].setIcon(BinaryBulbs.i);
				BinaryBulbs.bulb[4] = false;
				BinaryBulbs.value.setText(getValue());
				if(BinaryBulbs.game)
				{
					check();
				}
			}
		}
	}
	
	
	public void button5()
	{
		if(BinaryBulbs.binary)
		{
			if(!(BinaryBulbs.bulb[5]))
			{
				BinaryBulbs.B[5].setIcon(null);
				BinaryBulbs.B[5].setText("1");
				BinaryBulbs.bulb[5] = true;
				BinaryBulbs.value.setText(getValue());
				if(BinaryBulbs.game)
				{
					check();
				}
				//BinaryBulbs.l5.setForeground(Color.YELLOW);
			}
			else
			{
				BinaryBulbs.B[5].setIcon(null);
				BinaryBulbs.B[5].setText("0");
				BinaryBulbs.bulb[5] = false;
				BinaryBulbs.value.setText(getValue());
				if(BinaryBulbs.game)
				{
					check();
				}
			}
		}
		else
		{
			if(!(BinaryBulbs.bulb[5]))
			{
				BinaryBulbs.B[5].setIcon(BinaryBulbs.b);
				BinaryBulbs.bulb[5] = true;
				BinaryBulbs.value.setText(getValue());
				if(BinaryBulbs.game)
				{
					check();
				}
				//BinaryBulbs.l5.setForeground(Color.YELLOW);
			}
			else
			{
				BinaryBulbs.B[5].setIcon(BinaryBulbs.i);
				BinaryBulbs.bulb[5] = false;
				BinaryBulbs.value.setText(getValue());
				if(BinaryBulbs.game)
				{
					check();
				}
			}
		}
	}
	
	
	public void button6()
	{
		if(BinaryBulbs.binary)
		{
			if(!(BinaryBulbs.bulb[6]))
			{
				BinaryBulbs.B[6].setIcon(null);
				BinaryBulbs.B[6].setText("1");
				BinaryBulbs.bulb[6] = true;
				BinaryBulbs.value.setText(getValue());
				if(BinaryBulbs.game)
				{
					check();
				}
				//BinaryBulbs.l6.setForeground(Color.YELLOW);
			}
			else
			{
				BinaryBulbs.B[6].setIcon(null);
				BinaryBulbs.B[6].setText("0");
				BinaryBulbs.bulb[6] = false;
				BinaryBulbs.value.setText(getValue());
				if(BinaryBulbs.game)
				{
					check();
				}
			}
		}
		else
		{
			if(!(BinaryBulbs.bulb[6]))
			{
				BinaryBulbs.B[6].setIcon(BinaryBulbs.b);
				BinaryBulbs.bulb[6] = true;
				BinaryBulbs.value.setText(getValue());
				if(BinaryBulbs.game)
				{
					check();
				}
				//BinaryBulbs.l6.setForeground(Color.YELLOW);
			}
			else
			{
				BinaryBulbs.B[6].setIcon(BinaryBulbs.i);
				BinaryBulbs.bulb[6] = false;
				BinaryBulbs.value.setText(getValue());
				if(BinaryBulbs.game)
				{
					check();
				}
			}
		}
	}
	
	
	public void button7()
	{
		if(BinaryBulbs.binary)
		{
			if(!(BinaryBulbs.bulb[7]))
			{
				BinaryBulbs.B[7].setIcon(null);
				BinaryBulbs.B[7].setText("1");
				BinaryBulbs.bulb[7] = true;
				BinaryBulbs.value.setText(getValue());
				if(BinaryBulbs.game)
				{
					check();
				}
				//BinaryBulbs.l7.setForeground(Color.YELLOW);
			}
			else
			{
				BinaryBulbs.B[7].setIcon(null);
				BinaryBulbs.B[7].setText("0");
				BinaryBulbs.bulb[7] = false;
				BinaryBulbs.value.setText(getValue());
				if(BinaryBulbs.game)
				{
					check();
				}
			}
		}
		else
		{
			if(!(BinaryBulbs.bulb[7]))
			{
				BinaryBulbs.B[7].setIcon(BinaryBulbs.b);
				BinaryBulbs.bulb[7] = true;
				BinaryBulbs.value.setText(getValue());
				if(BinaryBulbs.game)
				{
					check();
				}
				//BinaryBulbs.l7.setForeground(Color.YELLOW);
			}
			else
			{
				BinaryBulbs.B[7].setIcon(BinaryBulbs.i);
				BinaryBulbs.bulb[7] = false;
				BinaryBulbs.value.setText(getValue());
				if(BinaryBulbs.game)
				{
					check();
				}
			}
		}
	}
	
	
	public void button8()
	{
		if(BinaryBulbs.binary)
		{
			if(!(BinaryBulbs.bulb[8]))
			{
				BinaryBulbs.B[8].setIcon(null);
				BinaryBulbs.B[8].setText("1");
				BinaryBulbs.bulb[8] = true;
				BinaryBulbs.value.setText(getValue());
				if(BinaryBulbs.game)
				{
					check();
				}
				//BinaryBulbs.l8.setForeground(Color.YELLOW);
			}
			else
			{
				BinaryBulbs.B[8].setIcon(null);
				BinaryBulbs.B[8].setText("0");
				BinaryBulbs.bulb[8] = false;
				BinaryBulbs.value.setText(getValue());
				if(BinaryBulbs.game)
				{
					check();
				}
			}
		}
		else
		{
			if(!(BinaryBulbs.bulb[8]))
			{
				BinaryBulbs.B[8].setIcon(BinaryBulbs.b);
				BinaryBulbs.bulb[8] = true;
				BinaryBulbs.value.setText(getValue());
				if(BinaryBulbs.game)
				{
					check();
				}
				//BinaryBulbs.l8.setForeground(Color.YELLOW);
			}
			else
			{
				BinaryBulbs.B[8].setIcon(BinaryBulbs.i);
				BinaryBulbs.bulb[8] = false;
				BinaryBulbs.value.setText(getValue());
				if(BinaryBulbs.game)
				{
					check();
				}
			}
		}
	}
	
	public String convert(String s)
	{
		int n = Integer.parseInt(s),temp;
		String result="";
		while(n>0)
		{
			temp = n%2;
			n=n/2;
			result= result+String.valueOf(temp);
		}
		char[] a=result.toCharArray();
		result = "";
		
		for(int i=a.length-1;i>=0;i--)
		{
			result = result+String.valueOf(a[i]);
		}
		return result;
	}
	
	public void getBulbs(String s)
	{
		for(int i=0;i<BinaryBulbs.bulb.length-1;i++)
		{
			BinaryBulbs.bulb[i] = false;
		}
		int j=0;
		for(int i=s.length()-1;i>=0;i--)
		{
			if(s.charAt(i)=='0')
			{
				BinaryBulbs.bulb[8-j]=false;
			}
			else if(s.charAt(i)=='1')
			{
				BinaryBulbs.bulb[8-j]=true;
			}
			j++;
		}
	}
	
	public void setBulbs(boolean b[])
	{
		if(BinaryBulbs.binary)
		{
			for(int i=1;i<b.length;i++)
			{
				if(b[i])
				{
					BinaryBulbs.B[i].setText("1");
				}
				else
				{
					BinaryBulbs.B[i].setText("0");
				}
			}
		}
		else
		{
			for(int i=1;i<b.length;i++)
			{
				if(b[i])
				{
					BinaryBulbs.B[i].setIcon(BinaryBulbs.b);
				}
				else
				{
					BinaryBulbs.B[i].setIcon(BinaryBulbs.i);
				}
			}
		}
	}
	
	public void setZero()
	{
		for(int i=0;i<BinaryBulbs.bulb.length;i++)
		{
			BinaryBulbs.bulb[i] = false;
		}
		setBulbs(BinaryBulbs.bulb);
		BinaryBulbs.value.setText("value");
	}
	
	public String getValue()
	{
		int values[] = {0,128,64,32,16,8,4,2,1},result=0;
		for(int i=1;i<BinaryBulbs.bulb.length;i++)
		{
			if(BinaryBulbs.bulb[i])
			{
				result = result+values[i];
			}
		}
		if(result==0)
		{
			return "value";
		}
		return String.valueOf(result);
	}
	
	public void check()
	{
		if(answer == Integer.parseInt(getValue()))
		{
			JOptionPane.showMessageDialog(BinaryBulbs.f,"Congratulations!! you won.");
			gameOn();
		}
	}
}
