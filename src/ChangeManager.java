import java.util.ArrayList;
import java.util.List;

public class ChangeManager {
	//The change manager will know all the subscribers whereas 
	private Client clientCarrier;
	//private	List<Client> Clients = new ArrayList<Client>();         //here will be a list of type of objects of clients
	public	Manager m;
	
	public List<Client> Clients = new ArrayList<Client>();
public	List<Manager> Managers = new ArrayList<Manager>();
	
	//the objective of this class is to notify the clients
	//under here a method for notification will be implemented 
//public	List<Manager> Managers = new ArrayList<Manager>();
	private	String TypeOfJob,Description,PrefferdDate,Technician,ExpectedCost,Duration;
	
    //Mystring=new String[3];
	String[] JobDetails=new String[4];
	
	String[] Assignment=new String[4];
	
	 private static ChangeManager cm;
	    /**
	     * Create private constructor
	     */
	    private ChangeManager(){
	         
	    }
	
	    public static ChangeManager getInstance(){
	        if(cm == null){
	            cm = new ChangeManager();
	        }
	        return cm;
	    }
	    
	    
	    
	
	public void Add_Client(Client c)             //this method will have an argument of the object of the new client being added //There seems to be no affect of the argument of  the new client object
	{
		//Clients.add(c);         //the object of client addes in the list                                        //a class shall be created for the internal frame of the client(That client class shall contain the UI for the client internal frame)
		clientCarrier=c;
		
		m=new Manager();
		    	
		TypeOfJob=c.TypeOfJob;
		
		Description=c.Description;
		PrefferdDate=c.PrefferdDate;

		
		JobDetails[0]=TypeOfJob;
		JobDetails[1]=Description;
		
		JobDetails[2]=c.Datess;
		JobDetails[3]=c.Monthh;
		
		
		//whenevr a new frame for the client will be requested .add_Client shall be called with the paremter of a new cliwnt class and we'll 
		System.out.print("The client obj saved in list");


		//now i have to send the data to the manager 
		//this is where new client will be added
		System.out.print("A new client has been saved\n");
	}

	public String[] Notification()
	{
		
		System.out.print("Notfication has been called from ChangeManger\n");

		//m.Get_Data(durationCarrier);
		//m.Send_Data();
		
		return JobDetails;
		//here only one object client object whose refrence will be provided will be notified  	
	}
	
	
	
	public void Assign_Getter(int index_forClient,Manager mang)
	{
		
		Assignment[0]=mang.AssignData[0];
		Assignment[1]=mang.AssignData[1];
		Assignment[2]=mang.AssignData[2];
		Assignment[3]=mang.AssignData[3];
		System.out.print("\nFound manager of "+index_forClient);
		//System.out.print("\n The assigned data is "+Assignment[0]+Assignment[1]);
	  
		Notificationb(index_forClient);
	  
	}
	
	
	
	
	
	public void Notificationb(int index_forClient)
	{
		//System.out.print("\n The assigned data is "+m.AssignData[0]+m.AssignData[1]);
		clientCarrier.Data_Assign_Get(Assignment,index_forClient) ; 
		
		
		//return Assignment;                 //call the data from the same object.
		
		//return JobDetails;
		
		
	}
	
	public void Make_managerp() {
		
		Manager manager=new Manager();                  //now put only the frame of the manager UI in the constructor
	
		System.out.print("Manager is going to be created");
		
		manager.CreateManager();                       //and put a panel in the create manager which will have all the components for a profile of a single client.
		
		//Add_Client(this);			                                              //whenever we'll call the create manager a panel will be made and inserted in the frame of the manager one stepdown from the last panel.
    //System.out.print("Now, Data will be thrown to the manager to be used when manager clicks details");
    
		Notification();    
		
		
	}
	
	
	
	
	
	
	
}
