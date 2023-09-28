package com.trackobit;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/portfolio")
public class PortFolio extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("Sytemmmmmmmm hang Portfolio########========> ---------------------");
        response.sendRedirect("https://mrvivek30.github.io/");

    }
}
