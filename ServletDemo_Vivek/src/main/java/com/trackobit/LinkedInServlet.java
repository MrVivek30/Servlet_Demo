package com.trackobit;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
//import javax.servlet.http.HttpServletRequest;


//@WebServlet(name = "AnnotatedServlet",urlPatterns = {"/VivekLinkedin","/myProfile"})
//@WebServlet("/linkedin")
public class LinkedInServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {

        System.out.println("Sytemmmmmmmm hang ========> ---------------------");
        response.sendRedirect("https://www.linkedin.com/in/vivek-chowdhary-725087203");

    }
}
