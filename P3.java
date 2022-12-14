//resultset metadata

import java.sql.*;
import java.io.*;
class P3
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/online","root","");
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery("select * from vegetable");

			ResultSetMetaData rsmd = rs.getMetaData();
			String tableName = rsmd.getTableName(1);
			System.out.println("Name of The Table :" + tableName);
			
			int no = rsmd.getColumnCount();
			System.out.println("Name of  column :" + no);
			System.out.print("\nName\t\tType\n");
		
			for (int i=1;i<=no;i++)
			{
				System.out.print(rsmd.getColumnName(i));
				System.out.println("\t\t"+rsmd.getColumnTypeName(i));
			}	
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
