package uz.marvel.myschool.servlets.auth;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author :  Asliddin Ziyodullaev
 * @Date :  08:30   03/08/22
 * @Project :  school_manegment_system-
 */
@WebServlet("/auth/register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("/views/auth/register.jsp");
        dispatcher.forward(req, resp);
    }
}
