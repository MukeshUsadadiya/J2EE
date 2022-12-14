import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ServletWelcome extends HttpServlet 
{
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException, ServletException
    {
        	res.setContentType("text/html");
        	PrintWriter out = res.getWriter();

	out.println("<html>");
        	out.println("<head>");
        	out.println("<title>Servlet Welcome</title>");
        	out.println("</head>");
        	out.println("<body>");
	
	String nm =req.getParameter("nm");
	
	out.println("<h1>Welcome :: "+nm+"</h1>");
        	out.println("</body>");
        	out.println("</html>");
    }
}



