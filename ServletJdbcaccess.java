import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class ServletJdbcaccess extends HttpServlet 
{
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException, ServletException
    {
        	res.setContentType("text/html");
        	PrintWriter out = res.getWriter();
	out.println("<html>");

	try
		{
			
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			Connection cn = DriverManager.getConnection("jdbc:ucanaccess://F:/MY-WORK/TY-2022/J2EE/Database.accdb");
			
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery("select * from mk");

			out.println("<html>");
			out.println("<head>");
			out.println("<title>Servlet  Access Connection</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>ACCESS CONNECTION</h1>");
			out.println("<table border=2>");
			out.println("<tr><th>RNO</th><th>NAME</th><th>CITY</th></tr>");
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



