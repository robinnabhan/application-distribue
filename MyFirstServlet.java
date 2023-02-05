import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class MyFirstServlet extends HttpServlet{
 public void doGet(HttpServletRequest request, HttpServletResponse 
response)
            throws ServletException, IOException {
            response.setContentType("text/html");

 PrintWriter out = response.getWriter();
 out.println("<html><body>");
out.println("<p>Hello Robin Nabhan!! -- From first servlet</p>");
out.println("</body></html>");
}
}
