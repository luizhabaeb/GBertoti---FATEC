package database;

public class DataBase {
	
	private static DataBase instance;
	
	private DataBase() {};
	
	
	public static synchronized DataBase getInstance() {
		if (instance == null) {
			instance = new DataBase();
		}
		return instance;
	}
	
	public void getConnection() {
	       System.out.println("You are now connected to the database.");
	   }

}
