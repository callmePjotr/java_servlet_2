import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintStream;

@WebServlet(name = "AnnotatedServlet", urlPatterns = {"/home"})
public class AnnotatedServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("doGet has been called by AnnotatedServlet");
        getServletContext().getRequestDispatcher("/WEB-INF/datenbank.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
