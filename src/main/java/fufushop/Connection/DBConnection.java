package fufushop.Connection;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnection {
	private final String serverName = "SQL8003.site4now.net"; 
	private final String dbName = "db_a87b3d_fufushop";
	private final String portNumber = "1433";
	private final String instance="";//MSSQLSERVER LEAVE THIS ONE EMPTY IF YOUR SQL IS A SINGLE INSTANCE
	private final String userID = "db_a87b3d_fufushop_admin";
    private final String password = "msang2403@";
    

    public Connection getConnect()throws Exception{
    	String url="";
    	if(instance == null || instance.trim().isEmpty()) 
    		url="jdbc:sqlserver://"+serverName+":"+portNumber+";databaseName="+dbName;
    	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    	
    	return DriverManager.getConnection(url, userID, password);
    }
    
    public static void main(String[] args) {
		try {
			System.out.println(new DBConnection().getConnect());
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
