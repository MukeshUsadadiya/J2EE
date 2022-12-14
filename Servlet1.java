import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Servlet1 extends HttpServlet 
{
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException, ServletException
    {
        	res.setContentType("text/html");
        	PrintWriter out = res.getWriter();
	
	String nm=req.getParameter("nm");
	out.println("<html>");
        	out.println("<head>");
        	out.println("<title>WELCOME   </title>");
        	out.println("</head>");
        	out.println("<body>");
	out.println("<h1>Welcome  "+nm+"</h1>");
        	out.println("</body>");
        	out.println("</html>");
    }
}



