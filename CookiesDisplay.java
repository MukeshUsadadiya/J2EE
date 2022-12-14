import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CookiesDisplay extends HttpServlet 
{
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException, ServletException
    {
        	res.setContentType("text/html");
        	PrintWriter out = res.getWriter();
	
		out.println("<html>");
        	out.println("<head>");
        	out.println("<title>Cookies Display</title>");
        	out.println("</head>");
        	out.println("<body>");
		
		Cookie c1[]=req.getCookies();
		if (c1!=null)
		{
			for(int i=0;i<c1.length;i++)
			{
				out.println("<h1>Cookies Name:"+c1[i].getName()+"</h1>");
				out.println("<h1>Cookies Value:"+c1[i].getValue()+"</h1>");
				out.println("<br>");
			}
		}
        	out.println("</body>");
        	out.println("</html>");
    }
}



