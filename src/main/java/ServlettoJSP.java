import java.io.IOException;
import java.sql.*;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ServlettoJSP", urlPatterns = "/ServlettoJSP")
public class ServlettoJSP extends HttpServlet {
    private static String encryptpw = null;
    private static Connection con = null;
    private static PreparedStatement preparedStatement = null;
    private static ResultSet result = null;
    private static String name = null;
    private static String email = null;
    private static String kommentar = null;
    private static final SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MM-yyyy' 'HH:mm:ss.SSS");
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Timestamp timestamp = new Timestamp(System.currentTimeMillis());

        try {
            con = connect.connectToDatabase();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            String sql = "SELECT name, email, kommentar FROM kommentare";
            preparedStatement = con.prepareStatement(sql);
            System.out.println(sdf2.format(timestamp) + " " + " " + sql + " - SQL prepared statement");
            result = preparedStatement.executeQuery();
            while (result.next()){
                name = result.getString("name");
                email = result.getString("email");
                kommentar = result.getString("kommentar");
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }




        StringBuilder error = new StringBuilder();



        if(error.length() > 0){
            request.setAttribute("error", error.toString());
        }else{
            //request.setAttribute("firstName", firstName);
            //request.setAttribute("lasttName", lastName);
            //request.setAttribute("age", age);

        }
        request.setAttribute("name", name);
        request.setAttribute("email", email);
        request.setAttribute("kommentar", kommentar);
        getServletContext().getRequestDispatcher("/WEB-INF/blog.jsp").forward(request,response);
    }
}
