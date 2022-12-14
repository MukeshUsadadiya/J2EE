//print whole employee table into tabular formate.

import java.sql.*;
import java.io.*;
class O9
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl1","scott","tiger");
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery("select * from emp");
			System.out.println("EMPNO"+"	"+"ENAME"+"	  "+"JOB"+"		"+"MGR"+"    "+"HIREDATE"+"			 "+"Sal"+"	"+"COMM"+"	"+"DEPTNO");
			System.out.println("-------------------------------------------------------------------------------------------");
						
			while(rs.next())
			{
				System.out.print(rs.getInt(1));
				System.out.print("	"+rs.getString(2));
				System.out.print("	 "+rs.getString(3)+"	");
				System.out.print("	"+rs.getString(4));
				System.out.print("	"+rs.getString(5));
				System.out.print("	"+rs.getString(6));
				System.out.print("	"+rs.getString(7));
				System.out.print("	"+rs.getString(8));
				System.out.println();
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
