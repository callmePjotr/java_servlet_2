import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "PersonServlet", urlPatterns = "/person")
public class PersonServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastname");
        String age = request.getParameter("age");

        StringBuilder error = new StringBuilder();

        if(firstName == null){
            error.append("No first name provided!");
        }else if (lastName ==null){
            error.append("No  last first name provided!");
        } else if (age == null) {
            error.append("No age provided!");
        }

        if(error.length() > 0){
            request.setAttribute("error", error.toString());
            request.setAttribute("person", new model.person());
        }else{
            request.setAttribute("person", new model.person(firstName, lastName, Integer.parseInt(age)));

        }

        getServletContext().getRequestDispatcher("/name.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
