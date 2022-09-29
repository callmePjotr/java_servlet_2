import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "AnotherServlet", urlPatterns = "/anotherServlet")
public class AnotherServlet extends HttpServlet {
    private static String input = null;
    private static String output = null;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("get Request in AnotherServlet");

        input = "This is <script> some malicious shit <script></script>";
        output = myXSSStrip.stripXSS(input);

        System.out.println(output);

        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + output + "</h1>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



    }
}
