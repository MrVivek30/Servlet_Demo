package com.trackobit;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebServlet("/project")
public class MyFirst_JS_Project extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("Sytemmmmmmmm hang ========> ---------------------");
        response.sendRedirect("https://resilient-bublanina-cc6879.netlify.app/");

    }
}
