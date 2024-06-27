package demo1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "loginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String demo = req.getParameter("demo");
        System.out.println("username: " + username);
        System.out.println("password: " + password);
        System.out.println("demo: " + demo);
        System.out.println("Day la method getLogin");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String demo = req.getParameter("demo");
        System.out.println("username: " + username);
        System.out.println("password: " + password);
        System.out.println("demo: " + demo);
        System.out.println("Day la method postLogin");
    }
}
