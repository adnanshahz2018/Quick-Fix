

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ManagerFrame {

	Manager m;
	
	JPanel BigPanel=new JPanel();
	JPanel LabelPanel=new JPanel();
	JFrame jfmanager=new JFrame();

	JLabel jl1=new JLabel();
	JLabel jl2=new JLabel();
	JLabel jl2help=new JLabel();
	JLabel jl7=new JLabel();
	JLabel jl3=new JLabel();
	JLabel jl4=new JLabel();
	JLabel jl5=new JLabel();

	JButton jb=new JButton();

	private static ManagerFrame instance = null;


	private ManagerFrame() {


	}

	public static ManagerFrame getInstance() {
		if(instance == null) {
			instance = new ManagerFrame();
		}
		return instance;
	}

	public void CreateSoleFrame()
	{

		BigPanel.setLayout(new GridLayout(5,1,10,5));      // 5 rows and and 1 column
		LabelPanel.setLayout(new GridLayout(1,7,15,0));
		
		jl1.setText("Customer");
		jl1.setVisible(true);


		jl2.setText("Job");
		jl2.setVisible(true);


		jl2help.setText("");
		jl2.setVisible(true);
		
		
		jl3.setText("Technician");
		jl3.setVisible(true);

		jl4.setText("Expected Cost");
		jl4.setVisible(true);

		jl5.setText("Duration");
		jl5.setVisible(true);
       
		jl7.setText("");
		jl7.setVisible(true);
		
		
LabelPanel.add(jl1);
LabelPanel.add(jl2);
LabelPanel.add(jl2help);
LabelPanel.add(jl3);
LabelPanel.add(jl4);
LabelPanel.add(jl5);
LabelPanel.add(jl7);
LabelPanel.setVisible(true);

BigPanel.add(LabelPanel);
jfmanager.add(BigPanel);


		BigPanel.setVisible(true);
		jfmanager.setTitle("Manager Dashboard");


		jfmanager.setSize(900, 200);
		jfmanager.setBackground(Color.red);
		jfmanager.setVisible(true);
		System.out.println("The frame is created\n");

	}

}


