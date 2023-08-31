/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.enviro.assessment.grad001.InnocentAphane;

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
import javax.servlet.http.HttpSession;

/**
 *
 * @author Student
 */
public class WithdrawalServlet extends HttpServlet {

    @EJB
    private ProductFacadeLocal pfl;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession(true);
        
        //Investor Info
        Investor investor = (Investor) session.getAttribute("investor");
        
        
        // Retrieve form data
        Long productId = Long.parseLong(request.getParameter("productId"));
        Product product = pfl.find(productId);
        
        double withdrawalAmount = Double.parseDouble(request.getParameter("withdrawalAmount"));
        //maxToWithdraw
        double maxWithdrawalAmount = product.getBalance() * 0.9;
        
        //withdrawal conditions
        if(product.getType().equalsIgnoreCase("Retirement") && investor.getAge() < 65){
            //error
        }else if(withdrawalAmount > product.getBalance()){
            //error
        }else if(withdrawalAmount > maxWithdrawalAmount){
            
        }else{
            //success notice
            request.getRequestDispatcher("/sucess.jsp").forward(request, response); // Redirect to a success page
        }
        
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession(true);
        
        //Investor Info
        Investor investor = (Investor) session.getAttribute("investor");
        
        
        // Retrieve form data
        Long productId = Long.parseLong(request.getParameter("productId"));
        Product product = pfl.find(productId);
        
        //
        request.setAttribute("product", product);
        
        
        //navigate
        request.getRequestDispatcher("./withdrawal.jsp").forward(request, response);
        
        }
}
