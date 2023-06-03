package oes.db;
import java.sql.*;
public class Provider {
	private static final String DRIVER_CLASS="com.mysql.jdbc.Driver";
	//by using jdbc driver - connect to mysql which is a local dB server on the port of 3306 which has db1 as dB
	private static final String DB_URL="jdbc:mysql://localhost:3306/quiz";
	private static final String USERNAME="root";
	private static final String PASSWORD="Rajaraja@009";

	public static Connection getConn() throws ClassNotFoundException, SQLException {
		//register the driver 
		Class.forName(DRIVER_CLASS);
		//connection with the dB
		Connection con=DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
		return con;
	}

		
	}	