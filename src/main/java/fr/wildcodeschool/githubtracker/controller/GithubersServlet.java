package fr.wildcodeschool.githubtracker.controller;

import fr.wildcodeschool.githubtracker.dao.*;
import fr.wildcodeschool.githubtracker.service.GithubersService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(name = "GithubersServlet", urlPatterns = {"/githubers"})
public class GithubersServlet extends HttpServlet {

    GithuberDAO githuberDAO;
    GithubersService githuberService;
    
    public GithubersServlet() {
        githuberDAO = new DumbGithuberDAO();
        githuberService = new GithubersService(githuberDAO);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



        request.setAttribute("guithuberListe", githuberService.getAllGithubers());

        getServletContext().getRequestDispatcher("/githubers.jsp" ).forward( request, response );

    }

}
