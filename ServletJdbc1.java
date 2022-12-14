import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class ServletJdbc1 extends HttpServlet 
{
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException, ServletException
    {
        	res.setContentType("text/html");
        	PrintWriter out = res.getWriter();
	out.println("<html>");

	try
		{
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl1","scott","tiger");
			
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery("select * from emp");

			out.println("<html>");
			out.println("<head>");
			out.println("<title>Servlet Connection</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>ORACLE CONNECTION</h1>");
			out.println("<table border=2>");
			out.println("<tr><th>EMPNO</th><th>ENAME</th><th>JOB</th><th>MGR</th><th>HIREDATE</th><th>SAL</th><th>COMM</th></tr>");
			while(rs.next())
			{
				out.println("<tr><td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getInt(4)+"</td><td>"+rs.getString(5)+"</td><td>"+rs.getInt(6)+"</td><td>"+rs.getInt(7)+"</td></tr>");
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



