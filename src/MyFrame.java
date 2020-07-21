import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.security.auth.Subject;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener {

	protected JFrame jf=new JFrame();
	public  JPanel jp=new JPanel(); 
	private	JButton jb=new JButton("Add");
	private JButton jb1=new JButton("Delete");
	JLabel jl=new JLabel();
	JTextField jtxx=new JTextField();

	public void MyFrames()                                //A procedure will be written in which the Whole UI with actionListners will be present.
	{

		System.out.print("The Myframe has been created\n");

		//if the button "New Client" we'll call the constructor of the client.

		//all the callings  and decisions "when to create a client" of the cient and manager methods will be done from the myframe class.



		                                                         //Here all the UI
		                                                        //The manager UI will have a list for the row for each client so whenevr a client inserts data a new data field will be created and added in the list

		JMenuBar bar = new JMenuBar();                      // create menu bar
		JMenu addMenu = new JMenu( "Add" );                 // create Add menu
		
		JMenuItem newFrame = new JMenuItem( "New Customer" );
        newFrame.addActionListener(this);
        
		 
		addMenu.add( newFrame );                    // add menu item to Add menu
		bar.add( addMenu );                     // add Add menu to menu bar
		setJMenuBar( bar );                     // set menu bar of outer frame
		jp.add(bar);
		jf.add(jp); 
		jf.setSize(900, 700);
		jf.setVisible(true);

		jtxx.setText("Inititailly The MyFrame Screen will come the create user button will be pressed and a  "
				+ "new customer will be created that new customer will insert the data into the box and send it to the Manager this is the"
				+ "time when a new panel for a customer request will be created in the Manager panel ");
		jtxx.setBounds(10, 20, 450, 50);


		jtxx.setVisible(true);

		jf.add(jtxx);
		
		ManagerFrame mf=ManagerFrame.getInstance();
		mf.CreateSoleFrame();
		
		
		
		
		
		//new Client();       //HERE A button listner will be insetrted on the new client button when clicked a new obkect will be created 
		
		//Client cla=new Client();
		//cla.Add_Client();
		//new Manager(); 
		//Manager mg=new Manager();
		//mg.CreateManager();



		/*outerPane = new JDesktopPane(); // create pane for outer frame
		add(outerPane); // add this pane to the outer frame
                                                                       //and beneath it the actionListners
		newFrame.addActionListener(new ActionListener()	{  
			public void actionPerformed( ActionEvent event ){
				// create internal frame
				JInternalFrame frame = new JInternalFrame( 
						"Internal Frame", true, true, true, true );

				MyPanel panel = new MyPanel(subject); 

				frame.add(panel);
				frame.pack(); // set internal frame to size of contents

				outerPane.add( frame ); // add internal frame to outer frame
				frame.setVisible( true ); // show internal frame
			} 
		}*/

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		new Client();
		
		//cl.Add_Client();

		
	}	
}
