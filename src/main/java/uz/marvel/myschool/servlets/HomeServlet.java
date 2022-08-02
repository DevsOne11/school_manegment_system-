package uz.marvel.myschool.servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/")
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Object sessionid = req.getSession().getAttribute("sessionid");
        if (sessionid == null) {
            resp.sendRedirect("/auth/login");
        } else {
            RequestDispatcher dispatcher = req.getRequestDispatcher("/views/index.jsp");
            dispatcher.forward(req, resp);
        }
    }
}
