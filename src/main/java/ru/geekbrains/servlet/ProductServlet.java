package ru.geekbrains.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "ProductServlet", urlPatterns = "/product_servlet")
public class ProductServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Product[] products = {
                new Product(1, "tube 40x20x3",110090),
                new Product(2, "tube 80x60x3",120090),
                new Product(3, "tube  140x100x5",130090),
                new Product(4, "tube  40x20x1,5",73090),
                new Product(5, "tube  60x40x4",68090),
                new Product(6, "tube  80x60x2",67090),
                new Product(7, "tube  100x40x3",75590),
                new Product(8, "tube  120x80x5",84090),
                new Product(9, "tube  140x60x6",78090),
                new Product(10, "tube  300x200x10",122090),
        };

        for (Product product : products){
            resp.getWriter().println("id = " + product.getId() + " - "
                    + "title = " + product.getTitle() + " - "
                    + "cost = " + product.getCost());
        }

    }
}
