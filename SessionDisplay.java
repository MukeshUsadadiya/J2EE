import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SessionDisplay extends HttpServlet 
{
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException, ServletException
    {
        	res.setContentType("text/html");
        	PrintWriter out = res.getWriter();
	
		out.println("<html>");
        	out.println("<head>");
        	out.println("<title>Session Display</title>");
        	out.println("</head>");
        	out.println("<body>");
	
	HttpSession session=req.getSession(false);
	String unm=(String)session.getAttribute("uname");
	out.println("Hello"+unm);
        	out.println("</body>");
        	out.println("</html>");
    }
}



