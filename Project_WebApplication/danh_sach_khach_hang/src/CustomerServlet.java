import model.Customer;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet",urlPatterns = "/customer")
public class CustomerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Nguyen Chi Hieu","16-04-1991","Da Nang","img"));
        customers.add(new Customer("Nguyen Chi Hieu","16-04-1991","Da Nang","img"));
        customers.add(new Customer("Nguyen Chi Hieu","16-04-1991","Da Nang","img"));
        customers.add(new Customer("Nguyen Chi Hieu","16-04-1991","Da Nang","img"));
        customers.add(new Customer("Nguyen Chi Hieu","16-04-1991","Da Nang","img"));
        request.setAttribute("customers",customers);
        request.getRequestDispatcher("/index.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


}
}
