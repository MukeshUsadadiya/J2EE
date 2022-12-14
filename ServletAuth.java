import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ServletAuth extends HttpServlet 
{
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException, ServletException
    {
        	res.setContentType("text/html");
        	PrintWriter out = res.getWriter();

	out.println("<html>");
        	out.println("<head>");
        	out.println("<title>Servlet Auth </title>");
        	out.println("</head>");
        	out.println("<body>");
	
	String nm =req.getParameter("nm");
	String ps=req.getParameter("ps");
	
	if(nm.equals("Mk") && ps.equals("777"))
	{
		RequestDispatcher r1=req.getRequestDispatcher("ServletWelcome");
		r1.forward(req,res);
	}
	else
	{
		RequestDispatcher r1=req.getRequestDispatcher("/login.html");
		r1.include(req,res);
	}
        	out.println("</body>");
        	out.println("</html>");
    }
}



