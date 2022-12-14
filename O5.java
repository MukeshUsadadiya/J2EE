//prepared statement 

import java.sql.*;
import java.io.*;
class O5
{
	public static void main(String args[])
	{
		PreparedStatement ps1;
		Connection cn;
		ResultSet rs;
		int dno;
		String str,job;

		try
		{
			System.out.print("Enter Deptno :");
			dno = Integer.parseInt(System.console().readLine());
			System.out.print("Enter Job :");
			job = System.console().readLine();

			Class.forName("oracle.jdbc.driver.OracleDriver");
			cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl1","scott","tiger");
			
			str = "select * from emp where deptno = ? and job=?";
			ps1 = cn.prepareStatement(str);
			ps1.setInt(1,dno);
			ps1.setString(2,job);
			rs = ps1.executeQuery();

			while(rs.next())
			{
				System.out.println("Employee no :" +rs.getInt(1));
				System.out.println("Name :" +rs.getString(2));
				System.out.println();
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
