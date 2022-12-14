import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CookiesCreate extends HttpServlet 
{
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException, ServletException
    {
        	res.setContentType("text/html");
        	PrintWriter out = res.getWriter();

		out.println("<html>");
        	out.println("<head>");
        	out.println("<title>Cookies Create  </title>");
        	out.println("</head>");
        	out.println("<body>");
		Cookie c1=new Cookie("Mukesh","Developer");
		res.addCookie(c1);
        	out.println("</body>");
        	out.println("</html>");
    }
}



