//find employee name who can get salary more than or equal to inputed salary

import java.sql.*;
import java.io.*;
class O8
{
	public static void main(String args[])
	{
		PreparedStatement ps3;
		Connection cn;
		ResultSet rs;
		String str;

		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl1","scott","tiger");
		
			System.out.print("Enter Salary :");
			int s = Integer.parseInt(System.console().readLine());

			str = "select * from emp where sal >= ?";
			ps3 = cn.prepareStatement(str);
			ps3.setInt(1,s);
			rs = ps3.executeQuery();

			while(rs.next())
			{
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
