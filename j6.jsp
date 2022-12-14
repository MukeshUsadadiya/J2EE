<%--Record Insert using Form and Html Page --%>
<html>
<head>
	<title>Welcome</title>
</head>
<body>
	<%@ page import="java.sql.*"%>
	<%
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
	
			Connection cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
			
			Statement st=cn.createStatement();
			ResultSet rs = st.executeQuery("Select *from emp");

			while(rs.next())
			{
				out.print("ID :"+rs.getInt(1));
				out.print("Name :"+rs.getString(2));
				out.print("City :"+rs.getString(3));
				
			}

		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}

	%>
</body>
</html>