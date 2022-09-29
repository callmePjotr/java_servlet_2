import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "PresidentServlet", urlPatterns = "/bonk")
public class PresidentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //getServletContext().getRequestDispatcher("/bonk.jsp").forward(request, response);
        //getServletContext().getRequestDispatcher("/anotherServlet").forward(request, response); //bonk.jsp - wir bleiben in unserer APP
        response.sendRedirect("/anotherServlet"); //ändert die tatsächliche URL, eher dafür gedacht, die App zu verlassen
        //response.sendRedirect("https://www.digitalocean.com/community/tutorials/sql-injection-in-java");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
