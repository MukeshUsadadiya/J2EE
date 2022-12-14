//print whole department table in tabular format 

import java.sql.*;
import java.io.*;
class O10
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl1","scott","tiger");
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery("select * from dept");
			System.out.println("DEPTNO"+"	"+"DNAME"+"		  "+"LOC");
			System.out.println("-------------------------------------");
						
			while(rs.next())
			{
				System.out.print(rs.getInt(1));
				System.out.print("	"+rs.getString(2));
				System.out.print("	 "+rs.getString(3));
				System.out.println();
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
