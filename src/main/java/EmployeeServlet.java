import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class EmployeeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        response.getWriter().println(
                "<html>" +
                "<head><title>Employee Portal</title></head>" +
                "<body>" +
                "<h1>Employee Portal</h1>" +
                "<p>Application is running successfully!</p>" +
                "</body>" +
                "</html>"
        );
    }
}
