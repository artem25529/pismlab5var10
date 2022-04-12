package com.es.servlets;

import com.es.service.FindYearNameService;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/myServlet")
public class MyServlet extends HttpServlet {
    @EJB
    protected FindYearNameService findYearNameService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("res", findYearNameService.find(Integer.parseInt(req.getParameter("year"))));

        req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }
}
