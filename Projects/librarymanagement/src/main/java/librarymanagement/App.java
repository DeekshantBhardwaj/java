package librarymanagement;
	// Java Program to Illustrate App File
	 
	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.cfg.Configuration;
	 
	// Main class
	public class App {
	 
	    // Main driver method
	    public static void main(String[] args)
	    {
	 
	        // Create Configuration
	        Configuration configuration = new Configuration();
	        configuration.configure("hibernate.cfg.xml");
	        configuration.addAnnotatedClass(LibraryManagement.class);
	 
	        // Create Session Factory
	        SessionFactory sessionFactory = configuration.buildSessionFactory();
	 
	        // Initialize Session Object
	        Session session = sessionFactory.openSession();
	 
	        LibraryManagement LMS = new LibraryManagement();//LMS is object word which we created withthe help of new keyword...
	        LibraryManagement LMS1 = new LibraryManagement();
	        LibraryManagement LMS2 = new LibraryManagement();
	        //adding values in the table..by the help of the object
	        LMS.setId(1);
	        LMS.setBookname("Angel");
	        LMS.setPublisher("akrit");
	        LMS.setDateofpublisH("22/09/2002");
	 
	        
	        LMS1.setId(2);
	        LMS1.setBookname("Broken");
	        LMS1.setPublisher("Amit");
	        LMS1.setDateofpublisH("31/09/2002");
	        
	        LMS2.setId(3);
	        LMS2.setBookname("Bad People");
	        LMS2.setPublisher("Ameri");
	        LMS2.setDateofpublisH("02/09/2002");
	        session.beginTransaction();
	 
	        // Here we have used
	        // save() method of JPA
	        session.save(LMS);
	        session.save(LMS1);
	        session.save(LMS2);
	        session.getTransaction().commit();
	    }
	}



