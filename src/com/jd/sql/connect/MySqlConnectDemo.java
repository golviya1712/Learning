package com.jd.sql.connect;

import java.io.File;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlConnectDemo {
	public static void main(String arg[]) throws SQLException {
		Statement stmt = null;
		ResultSet rsstate = null;
		Connection con = null;
		ResultSet rscity = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/dbworld?useUnicode=true&characterEncoding=utf-8", "root", "root");
			// here sonoo is database name, root is username and password
			stmt = con.createStatement();
			File file=new File("F:\\queryCity.txt");
			if(!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file);
	
	
			for (int i = 1; i <= 10; i++) {
				rscity = stmt.executeQuery("select * from tblcity where fkstateid=" + i);
				while (rscity.next()) {
					
					
					String query= "("+rscity.getInt(1) + "," + rscity.getInt(2) + "," + rscity.getInt(3) + ","
							+ rscity.getDouble(4) + "," + rscity.getDouble(5) + ",";
					if(rscity.getString(6).contains("\'")) {
						query+="'"+rscity.getString(6).replaceAll("\'", "\\'")+"'),";
					}
					fw.write(query+"\n");
				}
			}
			con.close();
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
