/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.enviro.assessment.grad001.InnocentAphane;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Student
 */
public class WithdrawalServlet extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Handle form submission, perform validation, and create withdrawal notice
        // Assume you have a service class for withdrawal operations
        //WithdrawalService withdrawalService = new WithdrawalService();
        
        // Retrieve form data
        Long productId = Long.parseLong(request.getParameter("productId"));
        double withdrawalAmount = Double.parseDouble(request.getParameter("withdrawalAmount"));

        // Perform validation and create withdrawal notice
        //boolean isValid = withdrawalService.validateWithdrawal(productId, withdrawalAmount);
       // if (isValid) {
            // Create withdrawal notice
           // withdrawalService.createWithdrawal(productId, withdrawalAmount);
            response.sendRedirect("/success.jsp"); // Redirect to a success page
       // } else {
            request.setAttribute("error", "Invalid withdrawal request");
            request.getRequestDispatcher("/withdrawal.jsp").forward(request, response);
        }
    
}
