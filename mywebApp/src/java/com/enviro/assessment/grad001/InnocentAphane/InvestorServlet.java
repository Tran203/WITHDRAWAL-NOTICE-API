/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.enviro.assessment.grad001.InnocentAphane;

import com.enviro.assessment.grad001.AphaneInnocent.bl.InvestorFacadeLocal;
import com.enviro.assessment.grad001.AphaneInnocent.entities.Investor;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Student
 */
@WebServlet("/investor")
public class InvestorServlet extends HttpServlet {
    @EJB
    private InvestorFacadeLocal ifl;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       // Assume you have a service class to retrieve investor data
        //InvestorService investorService = new InvestorService();
        Long investorId = Long.parseLong(request.getParameter("id")); // Assuming you pass the investor's ID as a parameter
        //Investor investor = investorService.getInvestorById(investorId);

        //request.setAttribute("investor", investor);
        request.getRequestDispatcher("/investor.jsp").forward(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession(true);
        
        //Investor Details
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String address = request.getParameter("address");
        String contact = request.getParameter("contact");
        int age = Integer.parseInt(request.getParameter("age"));
        
        //Investor object
        Investor investor = createInvestor(firstName,lastName,address,contact,age);
        
        //record to database
        ifl.create(investor);
        
        session.setAttribute("investor", investor);
        
        request.getRequestDispatcher("register_successful.jsp").forward(request, response);
    }

    private Investor createInvestor(String firstName, String lastName, String address, String contact, int age) {
       Investor investor = new Investor();
       
       //pass details
        investor.setFirstName(firstName);
        investor.setLastName(lastName);
        investor.setAddress(address);
        investor.setContact(contact);
        investor.setAge(age);
        
        //return
        return investor;
    }
}
