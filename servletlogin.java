import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class servletlogin extends HttpServlet 
{
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException, ServletException
    {
        	res.setContentType("text/html");
        	PrintWriter out = res.getWriter();
		
		String nm=req.getParameter("nm");
		String pass=req.getParameter("pass");
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>LOGIN</title>");
		out.println("</head>");
		out.println("<body>");
		
		if(nm.equals("mk") && pass.equals("777"))
		{
			out.println("User and Password are Match....");
		}
		else
		{
			out.println("User and Password arer not Match...");
		}
		out.println("</body>");
		out.println("</html>");
	}
}