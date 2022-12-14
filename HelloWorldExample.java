import java.io.*;
import java.util.ResourceBundle;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class HelloWorldExample extends HttpServlet 
{
    @Override
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException, ServletException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<head>");
        out.println("<title>WELCOME   </title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Hello!!......</h1>");
	out.println("<h1>Welcome to Tomcat......👋</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}



