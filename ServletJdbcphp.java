import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class ServletJdbcphp extends HttpServlet 
{
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException, ServletException
    {
        	res.setContentType("text/html");
        	PrintWriter out = res.getWriter();
	out.println("<html>");

	try
		{
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
			
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery("select * from stud");

			out.println("<html>");
			out.println("<head>");
			out.println("<title>Servlet  PHP Connection</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>PHP CONNECTION</h1>");
			out.println("<table border=2>");
			out.println("<tr><th>ID</th><th>NAME</th><th>CITY</th></tr>");
			while(rs.next())
			{
				out.println("<tr><td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td></tr>");
			}
			out.println("</table>");
			out.println("</body>");
			out.println("</html>");
		}
		catch(Exception ex)
		{
			out.println("Error is :"+ex);
		}
        	out.println("</html>");
    }
}



