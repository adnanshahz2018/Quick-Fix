import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import javafx.scene.layout.Border;

public class Client extends MyFrame  implements ActionListener{                    //we've to implement the Actionlistner just like the Manager

	//client shall have UI for an internal frame and the actionliostners
	//public ChangeManager cm1=new ChangeManager();       //a new client shall be saved in the change manager
	ChangeManager cm1=ChangeManager.getInstance();

	public Manager manager=null;

	Client c;
	JFrame jfClient=new JFrame();
	JPanel jpc=new JPanel();
	int count;

	JPanel jpClientA=new JPanel();
	JPanel jpClientB=new JPanel();
	JPanel Date=new JPanel();
	
	JButton Submit=new JButton();
	JButton jb2=new JButton();
	JButton jb3=new JButton();

	JLabel jp2la=new JLabel();
	JLabel jp2lb=new JLabel();
	JLabel jp2lc=new JLabel();
	JLabel jp2ld=new JLabel();
	JLabel jp2l=new JLabel();
	JLabel jp2lsupport=new JLabel();

	JLabel jp1la=new JLabel();
	JLabel jp1lb=new JLabel();
	JLabel jp1lc=new JLabel();
	JLabel jp1ld=new JLabel();
	JLabel jp1l=new JLabel();
	JLabel jp1lsupport=new JLabel();



	JTextField jtxp2a=new JTextField();
	JTextField jtxp2b=new JTextField();
	JTextField jtxp2c=new JTextField();
	JTextField jtxp2d=new JTextField();


	//temp generated jtxt

	JTextField jtxp1a=new JTextField();
	JTextField jtxp1b=new JTextField();
	JTextField jtxp1c=new JTextField();
	JTextField jtxp1d=new JTextField();

	String TypeOfJob,Description,PrefferdDate;



	////temp generated jtxt
	String[] Assign=new String[3];


	String[] Jobs = { "Plumbing", "Woodwork", "Electrician", "White Wash",
	};                //In these choices names technicians will be named

	final JComboBox<String> Kindofjobs = new JComboBox<String>(Jobs);
    
	//for fetching date and month
	String[] Dat = { "1", "8", "9", "15","21","27"
	};                //In these choices names technicians will be named

	final JComboBox<String> Dates = new JComboBox<String>(Dat);
	
	String[] Month = { "January", "Feburary", "March", "April","June","July","August","September","Octobar","November","December"
	};                //In these choices names technicians will be named

	final JComboBox<String> Months = new JComboBox<String>(Month);
	
	//
	String	Monthh,Datess;
	 
	
	

	public Client()                                 //actionlistners will be planted here in the vicinity
	{
		jpc=new JPanel (new GridLayout(2,0,2,2));
		jpClientA= new JPanel(new GridLayout(5,2,2,2));

		cm1.Clients.add(this);                     //these clients are being saved in the list so inorder to solve the bug. 

		System.out.println("Total number of clients is "+cm1.Clients.size());

		TitledBorder title;
		title = BorderFactory.createTitledBorder("Job Details");
		jpClientA.setBorder(title);

		javax.swing.border.Border blackline = BorderFactory.createLineBorder(Color.black);
		title = BorderFactory.createTitledBorder(
                blackline, "Job Details");
title.setTitleJustification(TitledBorder.LEFT);
jpClientA.setBorder(title);
		
		
		jp1l.setText("");
		jp1l.setFont(new Font("Times New Roman",Font.ITALIC,20));
		jp1l.setVisible(true);
		jpClientA.add(jp1l);
		
		jp1lsupport.setText("");
		jp1lsupport.setVisible(true);
		jpClientA.add(jp1lsupport);
		




		jp1la.setText("Type of Job");
		jp1la.setVisible(true);
		jpClientA.add(jp1la);
		




		 Kindofjobs.setAlignmentX(Component.CENTER_ALIGNMENT);   // added code
		 Kindofjobs.setVisible(true); // Not needed
		 Kindofjobs.setBounds(370, 20, 80, 30);                                  
		 Kindofjobs.addActionListener(this);

		 jpClientA.add(Kindofjobs);






		 jp1lb.setText("Description");
		 jp1lb.setVisible(true);
		 jpClientA.add(jp1lb);
		


		 jtxp1b.setEditable(true);
		 jtxp1b.setBackground(Color.white);
		 jtxp1b.setVisible(true);
		 //setsize
		 jpClientA.add(jtxp1b);
		




		 jp1lc.setText("Preffered Date");
		 jp1lc.setVisible(true);
		 jpClientA.add(jp1lc);
				 Date= new JPanel(new GridLayout(1,2,2,2));
		 
		 
		 Dates.setMaximumSize(Kindofjobs.getPreferredSize()); // added code
		 Dates.setAlignmentX(Component.CENTER_ALIGNMENT);   // added code
		 Dates.setVisible(true); // Not needed
		 Dates.setBounds(370, 20, 80, 30);                                  
		 Dates.addActionListener(this);
         Date.add(Dates);

		 Months.setMaximumSize(Kindofjobs.getPreferredSize()); // added code
		 Months.setAlignmentX(Component.CENTER_ALIGNMENT);   // added code
		 Months.setVisible(true); // Not needed
		 Months.setBounds(370, 20, 80, 30);                                  
		 Months.addActionListener(this);
		 Date.add(Months);
		 
		 jpClientA.add(Date);
		 
		 
		 jp1ld.setText("");
		 jp1ld.setVisible(true);
		 jpClientA.add(jp1ld);
		 //jfClient.add(jpClientA);


		 Submit.setText("Submit");
		 Submit.setToolTipText("Click to submit request");
		 Submit.setBackground(Color.red);
		 Submit.setVisible(true);

		 Submit.addActionListener(this);


		 jpClientA.add(Submit);
		 //jfClient.add(jpClientA);



		 jpc.add(jpClientA);

		 jfClient.setVisible(true);




























		 //The panel B site started
		 jpClientB= new JPanel(new GridLayout(5,2,2,2));

		 
			TitledBorder titles;
			titles = BorderFactory.createTitledBorder("Assignment");
			jpClientB.setBorder(titles);

			javax.swing.border.Border blacklines = BorderFactory.createLineBorder(Color.black);
			title = BorderFactory.createTitledBorder(
	                blacklines, "Assignment");
	title.setTitleJustification(TitledBorder.LEFT);
	jpClientB.setBorder(title);
		 
		 
		 
		 jp2l.setText("");
		 jp2l.setFont(new Font("Times New Roman",Font.ITALIC,20));
		 jp2l.setVisible(true);
		 jpClientB.add(jp2l);
		

		 jp2lsupport.setText("");
		 jp2lsupport.setVisible(true);
		 jpClientB.add(jp2lsupport);
		




		 jp2la.setText("Name of Tech");
		 jp2la.setVisible(true);
		 jpClientB.add(jp2la);
		



		 jtxp2a.setEditable(false); 
		 jtxp2a.setBackground(Color.GRAY);
		 jtxp2a.setSize(15,15);
		 jtxp2a.setVisible(true);
		 jtxp2a.setSize(10,10);
		 jpClientB.add(jtxp2a);
		





		 jp2lb.setText("Contact#");
		 jp2lb.setVisible(true);
		 jpClientB.add(jp2lb);
		


		 jtxp2b.setEditable(false);
		 jtxp2b.setBackground(Color.GRAY);
		 jtxp2b.setVisible(true);
		 //setsize
		 jpClientB.add(jtxp2b);
		




		 jp2lc.setText("Expected Cost");
		 jp2lc.setVisible(true);
		 jpClientB.add(jp2lc);
		


		 jtxp2c.setEditable(false);
		 jtxp2c.setBackground(Color.GRAY);
		 jtxp2c.setVisible(true);
		 //setsize
		 jpClientB.add(jtxp2c);
		
		 jp2ld.setText("Duration(Hours)");
		 jp2ld.setVisible(true);
		 jpClientB.add(jp2ld);
		

		 jtxp2d.setEditable(false);
		 jtxp2d.setBackground(Color.GRAY);
		 jtxp2d.setVisible(true);
		 jtxp2d.addActionListener(this);

		 //setsize
		 jpClientB.add(jtxp2d);
		 jpc.add(jpClientB);

		
		 //The Panel B has ended
		 //________________________________________________








		 jfClient.add(jpc);
		 jfClient.setTitle("Client Dashboard");
		 jfClient.setSize(375, 500);
		 jfClient.setVisible(true);

		 //now by sending the obkect of the new cutomer



	}

	
	public void Add_Client(Client c)
	{

		cm1.Add_Client(c);

		//The panel A is starting from here


	}
	
	@Override public void actionPerformed(java.awt.event.ActionEvent arg0) {                  //the actionListner for the all the jtxtfields here thir input will be procesed
		JButton jb=new JButton();
		
		jb=(JButton) arg0.getSource();
		
		//TypeOfJob=jtxp1a.getText();
		
		if(jb==Submit)
		{
		TypeOfJob=(String) Kindofjobs.getSelectedItem();
		Description=jtxp1b.getText();
		
		Datess=(String) Dates.getSelectedItem();
		Monthh=(String) Months.getSelectedItem();
		
	
		Kindofjobs.setEnabled(false);
		jtxp1b.setEnabled(false);
		Dates.setEnabled(false);
		Months.setEnabled(false);
		
		Add_Client(this);


		if(count==0)
		{
			count++;
			cm1.Make_managerp();
		}	
	

	}

	}


	public void Data_Assign_Get(String [] assignArray,int index_forClient)
	{

		//Assign=cm1.Notificationb();
		//search the client which equals the manager than insert data in the client which resembles with the manager insert the data in the object of that client.

		for(int indexing=0 ; indexing<cm1.Clients.size();indexing++)
		{
			//if(m==Clients.get(indexing))
			{
				System.out.print("\n Inserting managers data on client "+index_forClient);
				c=cm1.Clients.get(index_forClient);         //      the incomming index is 1 here the list donot have 1st list index created so giving error

				c.jtxp2a.setText(assignArray[0]);
				c.jtxp2b.setText(assignArray[3]);
				c.jtxp2c.setText(assignArray[1]);
			
				c.jtxp2d.setText(assignArray[2]);


			}

		}
			}



}
