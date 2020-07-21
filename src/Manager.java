import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import javafx.event.ActionEvent;

public class Manager extends MyFrame implements ActionListener{

	ChangeManager cm=ChangeManager.getInstance();

	Manager man;
	Manager manager;




	ManagerFrame mf=ManagerFrame.getInstance();


	JPanel SubPanels=new JPanel();



	JTextField jtxmanager=new JTextField();
	JTextField jtxmanager1=new JTextField();
	JTextField jtxmanager2=new JTextField();
	JTextField jtxmanager3=new JTextField();
	JTextField jtxmanager4=new JTextField();

	JLabel jl1=new JLabel();
	JLabel jl2=new JLabel();
	JLabel jl3=new JLabel();
	JLabel jl4=new JLabel();
	JLabel jl5=new JLabel();


	JButton DetailsManager=new JButton();
	JButton Assign=new JButton();
	JButton Technician=new JButton();


	String[] choices = { "Hamza Plumber", "Yasir Painter", "Inam Electrician", "Saboor Carpainter",
			"Shakoor Welder", "Majeed WoodWorker" };                //In these choices names technicians will be named


	final JComboBox<String> cb = new JComboBox<String>(choices);

	String[] durat;
	String [] Data=new String[3];

	String[] AssignData=new String[4];



	public Manager()
	{

	}

	public void CreateManager()
	{                                //inorder to make this made frame generic for every client entry we have to insert thi all stuff in a panel

		SubPanels.setLayout(new GridLayout(1,7,15,0));

		cm.Managers.add(this);

		man=this;



		jtxmanager.setBounds(140, 20, 100, 30);
		jtxmanager.setColumns(5);
		jtxmanager.setEditable(false);
		jtxmanager.setVisible(true);

		SubPanels.add(jtxmanager);



		jtxmanager1.setBounds(10,20, 100, 30);
		jtxmanager1.setColumns(5);
		jtxmanager1.setEditable(false);
		jtxmanager1.setVisible(true);    

		SubPanels.add(jtxmanager1);


		//the detail button		
		DetailsManager.setText("Details");
		DetailsManager.setToolTipText("Click for more details");
		DetailsManager.setBounds(270, 20, 90, 30);
		DetailsManager.setBackground(Color.RED);
		DetailsManager.setVisible(true);
		DetailsManager.addActionListener(this);

		SubPanels.add(DetailsManager);

		//The dropdown menu
		cb.setMaximumSize(cb.getPreferredSize()); // added code
		cb.setAlignmentX(Component.CENTER_ALIGNMENT);   // added code
		cb.setVisible(true); // Not needed
		cb.setBounds(370, 40, 80, 30);                                  
		cb.addActionListener(this);

		SubPanels.add(cb);



		final String jtx2string;
		jtxmanager2.setBounds(485,20, 100, 30);
		jtxmanager2.setColumns(5);
		jtxmanager2.setEditable(true);
		jtxmanager2.setVisible(true);    

		jtxmanager2.addActionListener(this); 
		SubPanels.add(jtxmanager2);






		jtxmanager3.setBounds(600,20, 100, 30);
		jtxmanager3.setColumns(5);
		jtxmanager3.setEditable(true);
		jtxmanager3.setVisible(true);    

		jtxmanager3.addActionListener(this);
		SubPanels.add(jtxmanager3);


		//the assign button
		Assign.setText("Assign");
		Assign.setToolTipText("Click to Assign task");
		Assign.setBounds(720, 20, 130, 30);
		Assign.setBackground(Color.RED);
		Assign.setVisible(true);
		Assign.addActionListener(this);
		SubPanels.add(Assign);

		SubPanels.setVisible(true);


		mf.BigPanel.add(SubPanels);

		mf.BigPanel.setVisible(true);
		mf.jfmanager.add(mf.BigPanel);
		mf.jfmanager.setVisible(true);








	}

	@Override public void actionPerformed(java.awt.event.ActionEvent arg0) {                  //the actionListner for the all the jtxtfields here thir input will be procesed

		System.out.print("ActionListner for catching detail button\n");
		JButton jb;





		jb=(JButton) arg0.getSource();

		if(jb==DetailsManager)
		{

			durat=cm.Notification();

			System.out.print("detail button has been clicked\n"+durat);

			jtxmanager1.setText(durat[0]);
			jtxmanager.setText(durat[1]);
			DetailsManager.setToolTipText("Preferd date is "+ durat[2] +durat[3]);

			jtxmanager3.setVisible(true);		  

		}
		else
			if(jb==Assign)
			{

				AssignData[0]= (String) cb.getSelectedItem();

				AssignData[1]=jtxmanager2.getText();
				AssignData[2]=jtxmanager3.getText();



				if(AssignData[0]=="Hamza Plumber")
				{
					AssignData[3]="030766443";
				}
				else
					if(AssignData[0]=="Yasir Painter")
					{
						AssignData[3]="031566913";
					}
					else
						if(AssignData[0]=="Inam Electrician")
						{
							AssignData[3]="92347798";
						}
						else
							if(AssignData[0]=="Saboor Carpainter")
							{
								AssignData[3]="0307331164";
							}
							else
								if(AssignData[0]=="Shakoor Welder")
								{
									AssignData[3]="0307331164";
								}
								else
									if(AssignData[0]=="Majeed WoodWorker")
									{
										AssignData[3]="0378248124";
									}else
									{
										AssignData[3]="0335755974";
									}



				System.out.print("The assigned data is "+AssignData[0]+AssignData[1]+ AssignData[2]);
				System.out.print("The total size of managers  is "+cm.Managers.size());



				for(int search=0 ; search<cm.Managers.size(); search++)
				{
					if(cm.Managers.get(search)== this)
					{
						System.out.println("\n We've found operated manager number "+search);
						cm.Assign_Getter(search,this);

						break;
					}
				}




			}


	}





}
