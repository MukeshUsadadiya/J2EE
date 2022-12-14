import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class ServletJdbc extends HttpServlet 
{
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException, ServletException
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

			while(rs.next())
			{
				System.out.println("Id :" +rs.getInt(1));
				System.out.println("Name :" +rs.getString(2));
				System.out.println("Job :" +rs.getString(3));
				System.out.println();
			}
		}
		catch(Exception ex)
		{
			System.out.println("Error is :"+ex);
		}
        	out.println("</html>");
    }
}



