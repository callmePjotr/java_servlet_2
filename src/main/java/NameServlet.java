import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "NameServlet", urlPatterns = "/getname")
public class NameServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //String firstName = request.getParameter("firstName");
        String firstName = "fqwefqefq";
        String lastName = request.getParameter("lastname");
        String age = request.getParameter("age");

        StringBuilder error = new StringBuilder();

        if(firstName == null){
            error.append("No first name provided!");
        }else if (lastName ==null){
            error.append("No last name provided!");
        } else if (age == null) {
            error.append("No age provided!");
        }

        if(error.length() > 0){
            request.setAttribute("error", error.toString());
        }else{
          //  request.setAttribute("firstName", "blabliblub");
            request.setAttribute("lasttName", lastName);
            request.setAttribute("age", age);

        }
        request.setAttribute("firstName", firstName);
        getServletContext().getRequestDispatcher("/name.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
