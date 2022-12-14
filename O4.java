//prepared statement 

import java.sql.*;
import java.io.*;
class O4
{
	public static void main(String args[])
	{
		PreparedStatement ps1;
		Connection cn;
		ResultSet rs;
		String str;

		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl1","scott","tiger");
			
			str = "select * from emp where deptno = ?";
			ps1 = cn.prepareStatement(str);
			ps1.setInt(1,10);
			rs = ps1.executeQuery();

			while(rs.next())
			{
				System.out.println("Employee no :" +rs.getInt(1));
				System.out.println("Name :" +rs.getString(2));
				System.out.println("Job :" +rs.getString(3));
				System.out.println();
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
