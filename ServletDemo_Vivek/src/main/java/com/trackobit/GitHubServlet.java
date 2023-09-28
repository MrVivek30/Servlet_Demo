package com.trackobit;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
//@WebServlet(name = "AnnotatedServlet",urlPatterns = {"/VivekGithub","/myProfileGit"})
@WebServlet("/github")
public class GitHubServlet extends  HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("chal rha---------------------");
        response.sendRedirect("https://github.com/MrVivek30");

    }
}
