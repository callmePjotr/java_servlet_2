import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "NameServlet2", urlPatterns = "/othername")
public class NameServlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        if(request.getParameter("error") == null){
            String firstName = (String) request.getAttribute("firstName");
            String lastName = (String) request.getAttribute("lastname");
            String age = (String) request.getAttribute("age");

            System.out.println(firstName +  " " + lastName + " " + age);
        }


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
