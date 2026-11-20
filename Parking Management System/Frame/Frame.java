package Frame;
import Objects.*;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.table.*;
public class Frame extends JFrame implements ActionListener,MouseListener
{
	private JPanel panel;
	private JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
	private JTextField tf1,tf2,tf3;
	private JPasswordField pf1;
	private JButton b1,b2,b3;
	private ImageIcon img;
	private JRadioButton rb1,rb2,rb3,rb4;
	private ButtonGroup bg;
	private JCheckBox cb1,cb2,cb3;
	private JComboBox jb;
	private JTextArea ta,ta1;
	private Color c1;
	private Font f1,f2;
	private JTable table;
	private DefaultTableModel model;
	
	public Frame()
	{
		super("Parking Management System");
		super.setBounds(350,50,750,750);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(null);
		c1 = new Color(211,211,211);
		panel.setBackground(c1);
		
		f1 = new Font("Cambria",Font.BOLD, 30);
		f2 = new Font("Cambria",Font.BOLD,20);
		
		l1 = new JLabel("Parking Management");
		l1.setBounds(220,0,300,40);
		l1.setFont(f1);
		l1.setForeground(Color.BLACK);
		l1.setBackground(Color.GRAY);
		l1.setOpaque(true);
		l1.addMouseListener(this);
		panel.add(l1);
		super.add(panel);
		
		l2 = new JLabel("Owner Name");
		l2.setBounds(10,40,150,40);
		l2.setFont(f2);
		panel.add(l2);
		
		tf1 = new JTextField();
		tf1.setBounds(160,45,150,30);
		tf1.setFont(f2);
		panel.add(tf1);
		
		l3 = new JLabel("Vehicle Number");
		l3.setBounds(10,80,150,40);
		l3.setFont(f2);
		panel.add(l3);
		
		tf2 = new JTextField();
		tf2.setBounds(160,85,150,30);
		tf2.setFont(f2);
		panel.add(tf2);

		l4 = new JLabel("Phone Number");
		l4.setBounds(10,120,150,40);
		l4.setFont(f2);
		panel.add(l4);

		tf3 = new JTextField();
		tf3.setBounds(160,125,150,30);
		tf3.setFont(f2);
		panel.add(tf3);

		l5 = new JLabel("Parking Fee");
		l5.setBounds(10,160,150,40);
		l5.setFont(f2);
		panel.add(l5);		
		
		pf1 = new JPasswordField();
		pf1.setBounds(160,165,150,30);
		pf1.setFont(f2);
		pf1.setEchoChar('#');
		pf1.addActionListener(this);
        panel.add(pf1);
		
		b1 = new JButton("Show");
		b1.setBounds(325,165,150,30);
		b1.setFont(f2);
		b1.addActionListener(this);
		panel.add(b1);
		
		l6 = new JLabel("Vehicle Type");
		l6.setBounds(10,200,150,40);
		l6.setFont(f2);
		panel.add(l6);
		
		String items[] = new String[] {"","Car","Bike","Bycicle"};
		jb = new JComboBox(items);
		jb.setBounds(160,205,140,35);
		jb.setFont(f2);
		jb.setForeground(Color.BLACK);
		panel.add(jb);
		
		l7 = new JLabel("Gender");
		l7.setBounds(10,350,150,40);
		l7.setFont(f2);
		panel.add(l7);
		
		rb1 = new JRadioButton("Male");
		rb1.setBounds(160,355,100,30);
		rb1.setFont(f2);
		panel.add(rb1);
		
		rb2 = new JRadioButton("Female");
		rb2.setBounds(290,355,100,30);
		rb2.setFont(f2);
		panel.add(rb2);
		
		bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		
		l8 = new JLabel("Parking Slot");
		l8.setBounds(10,400,150,40);
		l8.setFont(f2);
		panel.add(l8);
		
		cb1 = new JCheckBox("1");
		cb1.setBounds(160,405,100,30);
		cb1.setFont(f2);
		panel.add(cb1);
		
		cb2 = new JCheckBox("2");
		cb2.setBounds(290,405,100,30);
		cb2.setFont(f2);
		panel.add(cb2);
		
		cb3 = new JCheckBox("3");
		cb3.setBounds(420,405,100,30);
		cb3.setFont(f2);
		panel.add(cb3);
		
		l9 = new JLabel("Comment");
		l9.setBounds(350,205,100,45);
		l9.setFont(f2);
		l9.addMouseListener(this);
		panel.add(l9);
		
		ta = new JTextArea();
		ta.setBounds(450,215,250,30);
		ta.setFont(f2);
		panel.add(ta);
		
		b2 = new JButton("SAVE");
		b2.setBounds(550,350,150,30);
		b2.setFont(f2);
		b2.setBackground(Color.GRAY);
		b2.addMouseListener(this);
		b2.addActionListener(this);
		panel.add(b2);
		
		b3 = new JButton("EXIT");
		b3.setBounds(550,405,150,30);
		b3.setFont(f2);
		b3.setBackground(Color.GRAY);
		b3.addActionListener(this);
		panel.add(b3);
		
		img=new ImageIcon("picture\\Pic.jpg");
		l10=new JLabel(img);
		l10.setBounds(550,50,150,136);
		panel.add(l10);
		
		String[] columns = {"Owner","VN","Phone","Fee","Gender","Slot","Type"};
		model = new DefaultTableModel(columns,0);
		table = new JTable(model);
		table.setFont(f2);
		table.setRowHeight(22);
		JScrollPane spTable = new JScrollPane(table);
		spTable.setBounds(10,500,700,200);
		panel.add(spTable);
		setVisible(true);
	}
		
		public void actionPerformed(ActionEvent a)
		{
			if(a.getSource() == b1)
			{
				pf1.setEchoChar((char)0);
			}
			else if(a.getSource() == b2)
			{
				String s,s0,s1,s2,s3,s4,s5,s6;
				s=tf1.getText();
				s0=tf2.getText();
				s1=tf3.getText();
				s2=pf1.getText();
				if (rb1.isSelected())
				{
				    s3 = rb1.getText();	
				}
				else if(rb2.isSelected())
				{
					s3 = rb2.getText();
				}
				else
				{
					s3 = "Others";
				}
				if(cb1.isSelected() && cb2.isSelected() && cb3.isSelected())
				{
					s4=cb1.getText()+" "+cb2.getText()+" "+cb3.getText();
				}
				else if(cb1.isSelected() && cb2.isSelected())
				{
					s4=cb1.getText()+" "+cb2.getText();
				}
				else if(cb2.isSelected() && cb3.isSelected())
				{
					s4=cb2.getText()+" "+cb3.getText();
				}
				else if(cb1.isSelected() && cb3.isSelected())
				{
					s4=cb1.getText()+" "+cb3.getText();
				}
				else if(cb1.isSelected())
				{
					s4=cb1.getText();
				}
				else if(cb2.isSelected())
				{
					s4=cb2.getText();
				}
				else if(cb3.isSelected())
				{
					s4=cb3.getText();
				}
				else
				{
					s4 = "";
				}
				String phone = tf3.getText().trim();
				String feeText = new String(pf1.getPassword()).trim();
				if(!phone.matches("\\d{11}"))
					{
						JOptionPane.showMessageDialog(this,"Phone number must be 11 digits");
						return;
					}
					int fee;
					try
					{
						fee = Integer.parseInt(feeText);
						if(fee<=0)
						{
							JOptionPane.showMessageDialog(this,"Parking fee must be integer");
							return;
						}
					}
					catch(NumberFormatException e)
					{
						JOptionPane.showMessageDialog(this,"Parking fee must be integer");
					    return;
					}
				s5 = jb.getSelectedItem().toString();
				s6 = ta.getText();
				if(s.isEmpty() || s0.isEmpty() || s1.isEmpty() || s2.isEmpty() || s3.isEmpty() || s4.isEmpty() || s5.isEmpty())
				{
					JOptionPane.showMessageDialog(this,"Please give all the information asked");
				}
				else
				{
					Vehicle obj1 = new Vehicle(s,s0,s1,String.valueOf(fee),s3,s4,s5,ta.getText());
					obj1.insertInfo();
					JOptionPane.showMessageDialog(this,"Thanks for the information");
					showinfo();
				}
			}
			else if(a.getSource() == b3)
			{
				System.exit(0);
			}
	    }
		public void mouseClicked(MouseEvent me)
		{
		if(me.getSource() == l1)
		{
			l1.setText("Parking System");
		}
		}
		public void mousePressed(MouseEvent me)
        {
            if(me.getSource() == l9)
			{
				l9.setText("Text");
			}
		}
		public void mouseReleased(MouseEvent me)
		{
            if(me.getSource() == l9)
			{
				l9.setText("Comment");
			}
		}
		public void mouseEntered(MouseEvent me)
		{
			if(me.getSource() == b2)
			{
				b2.setBackground(Color.GREEN);
				b2.setForeground(Color.WHITE);
			}
		}
		
		public void mouseExited(MouseEvent me)
		{
			if(me.getSource() == b2)
			{
				b2.setBackground(Color.GRAY);
				b2.setForeground(Color.WHITE);
			}
		}
		private void showinfo()
		{
            model.setRowCount(0);
			try
			{
				File file = new File("./Data/vehicledata.txt");
					FileReader fr = new FileReader(file);
				    BufferedReader br = new BufferedReader(fr);
					String line;
					String o="",v="",p="",f="",g="",s="",t="";
					while((line = br.readLine()) != null)
					{
						if(line.startsWith("Owner:"))
						{
							o = line.substring(7);
						}
						else if(line.startsWith("Vehicle No:"))
						{
							v = line.substring(12);
						}
						else if(line.startsWith("Phone:"))
						{
							p = line.substring(7);
						}
						else if(line.startsWith("Fee:"))
						{
							f = line.substring(5);
						}
						else if(line.startsWith("Gender:"))
						{
							g = line.substring(8);
						}
						else if(line.startsWith("Slot:"))
						{
							s = line.substring(6);
						}
						else if(line.startsWith("Type:"))
						{
							t = line.substring(6);
						}
						else if(line.startsWith("====") && !o.isEmpty())
						{
							model.addRow(new Object[]{o,v,p,f,g,s,t});
							o=v=p=f=g=s=t="";
						}
					}
					br.close();
			}
			catch(IOException ioe)
			{
				ioe.printStackTrace();
				JOptionPane.showMessageDialog(this,"Error occours");
			}
    }
}