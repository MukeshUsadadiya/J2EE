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
		
			out.println("<html>");
			out.println("<head>");
			out.println("<title>t Servlet Connection With Oracle</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<table border=1>");
			out.println("<tr><th>Id</th><th>Name</th><th>Job</th></tr>");
			while(rs.next())
			{
				out.print("<tr><td>" +rs.getInt(1) +"</td><td>" +rs.getString(2)+"</td><td>" +rs.getString(3)+"</td></tr>");
			}
			
			out.println("</table>");
			out.println("</body>");
			out.println("</html>");

		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}

	%>
</body>
</html>