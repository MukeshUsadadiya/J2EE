//1callable statement
//note : must create procedure in oracle after written this code in java
//update record

import java.sql.*;
import java.io.*;
class O12
{
	public static void main(String args[])
	{
		CallableStatement cs1;
		Connection cn;
		int no;
		String nm,mno,em,ct;

		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl1","scott","tiger");

			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery("select * from reg");
			
			while(rs.next())
			{
				System.out.println("Id :" +rs.getInt(1));
				System.out.println("Name :" +rs.getString(2));
				System.out.println("Mobile :" +rs.getString(3));
				System.out.println("EMail :" +rs.getString(4));
				System.out.println("City :" +rs.getString(5));
				System.out.println();
			}	

			System.out.print("Enter Id :");
			no = Integer.parseInt(System.console().readLine());
			System.out.print("Enter Name :");
			nm = System.console().readLine();
			System.out.print("Enter Moblie :");
			mno = System.console().readLine();
			System.out.print("Enter Email :");
			em = System.console().readLine();
			System.out.print("Enter City :");
			ct = System.console().readLine();
			
			cs1 = cn.prepareCall("{Call pro5(?,?,?,?,?)}");
			cs1.setInt(1,no);
			cs1.setString(2,nm);
			cs1.setString(3,mno);
			cs1.setString(4,em);
			cs1.setString(5,ct);
			cs1.executeUpdate();

			System.out.println("Id :" +no);
			System.out.println("Name :" +nm);
			System.out.println("Mobile :" +mno);
			System.out.println("EMail :" +em);
			System.out.println("City :" +ct);
			System.out.println();
				
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
