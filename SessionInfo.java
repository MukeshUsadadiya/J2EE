import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SessionInfo extends HttpServlet 
{
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException, ServletException
    {
        	res.setContentType("text/html");
        	PrintWriter out = res.getWriter();

	HttpSession s1=req.getSession(true);
	out.println("<html>");
        	out.println("<head>");
        	out.println("<title>Session  Info  </title>");
        	out.println("</head>");
        	out.println("<body>");

	out.println("<p>New Session :"+s1.isNew()+"</p>");
	out.println("<p>Session Id :"+s1.getId()+"</p>");
	out.println("<p>Session Creation Time  :"+s1.getCreationTime()+"</p>");
	out.println("<p>Session Last Access TIme  :"+s1.getLastAccessedTime()+"</p>");
        	out.println("</body>");
        	out.println("</html>");
    }
}



