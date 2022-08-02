package uz.marvel.myschool.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

@WebFilter("/*")
public class SecurityFilter implements Filter {

    private final List<String> WHITE_LIST = List.of(
            "/resources/",
            "/auth/login",
            "/auth/register"
    );

    private final Predicate<String> isOpen = (path) -> WHITE_LIST.stream().anyMatch(path::startsWith);


    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;
        String path = req.getRequestURI();
        Object sessionid = req.getSession().getAttribute("sessionid");

        if (isOpen.test(path) || Objects.nonNull(sessionid)) {
            chain.doFilter(request, response);
        } else {
            req.getSession().setAttribute("s_path", path);
            resp.sendRedirect("/auth/login");
        }
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {

    }
}
