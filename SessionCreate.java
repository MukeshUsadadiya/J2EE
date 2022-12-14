import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SessionCreate extends HttpServlet 
{
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException, ServletException
    {
        	res.setContentType("text/html");
        	PrintWriter out = res.getWriter();

	out.println("<html>");
        	out.println("<head>");
        	out.println("<title>Session  Create  </title>");
        	out.println("</head>");
        	out.println("<body>");
	
	String unm =req.getParameter("unm");
	out.println("Welcome "+unm);

	HttpSession session=req.getSession();
	session.setAttribute("uname",unm);

	out.println("<a href='/mukesh/SessionDisplay'>Click Here</a>");
        	out.println("</body>");
        	out.println("</html>");
    }
}



