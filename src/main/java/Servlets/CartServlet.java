package Servlets;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@WebServlet("/cart")
public class CartServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<String, String[]> params = req.getParameterMap();
        HttpSession session = req.getSession();
        List<String> products = (List<String>)session.getAttribute("cart");
        if(products == null)
        {
            products = new ArrayList<String>();
        }
        if(params.containsKey("name"))
        {
            products.add(params.get("name")[0]);
            resp.sendRedirect("welcome.jsp");
        }
        else
        {
            req.setAttribute("cart", products);
            resp.sendRedirect("cart.jsp");
        }
    }
}
