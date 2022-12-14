import java.io.*;
import javax.servlet.*;
  
public class GSD extends GenericServlet
  
{
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException
	{
		PrintWriter out = resp.getWriter();
     		resp.setContentType("text/html");
      	  	out.println("<head>");
        	out.println("<title>WELCOME   </title>");
        	out.println("</head>");
        	out.println("<body>");
        	out.println("<h1>Hello!!......</h1>");
		out.println("<h1>Welcome  To Generic Servlet......</h1>");
        	out.println("</body>");
        	out.println("</html>");
   	 }
}



