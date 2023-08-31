/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.enviro.assessment.grad001.InnocentAphane;

import com.enviro.assessment.grad001.AphaneInnocent.bl.InvestorFacadeLocal;
import com.enviro.assessment.grad001.AphaneInnocent.bl.ProductFacadeLocal;
import com.enviro.assessment.grad001.AphaneInnocent.entities.Investor;
import com.enviro.assessment.grad001.AphaneInnocent.entities.Product;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Student
 */
public class ProductServlet extends HttpServlet {
    @EJB
    private ProductFacadeLocal pfl;
    private InvestorFacadeLocal ifl;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       // Assume you have a service class to retrieve products for an investor
       // ProductService productService = new ProductService();
        Long investorId = Long.parseLong(request.getParameter("investorId")); // Assuming you pass the investor's ID as a parameter
        //List<Product> products = productService.getProductsByInvestorId(investorId);

       // request.setAttribute("products", products);
        request.getRequestDispatcher("/products.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Investor Info
        Long investorId = Long.parseLong(request.getParameter("investorId"));
        Investor investor = ifl.find(investorId);
        
        // Retrieve product info
        String productType = request.getParameter("productType");
        String productName = request.getParameter("productName");
        double initialBalance = Double.parseDouble(request.getParameter("initialBalance"));

        
        // Product object
        Product product = createProduct(productType,productName,initialBalance,investor);
        pfl.create(product);

        //
        request.setAttribute("investor", investor);
        
        
        //get all the user's investment products

        // Redirect to a success page or display a confirmation message
        response.sendRedirect("/product-selection-success.jsp");
    }

    private Product createProduct(String productType, String productName, double initialBalance, Investor investor) {
        Product product = new Product();
        
        //
        product.setType(productType);
        product.setName(productName);
        product.setBalance(initialBalance);
        product.setInvestor(investor);
        
        return product;
    }
}
