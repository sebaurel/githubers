package fr.wildcodeschool.githubtracker.controller;


import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "TrackServlet", urlPatterns = {"/track"})
public class TrackServlet extends HttpServlet {
    //private @Inject MemoryGithuberDAO memoryGithuberDAO;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String login = request.getParameter("login");
        //Githuber githuber = memoryGithuberDAO.parseGithuber(login);
        //memoryGithuberDAO.saveGithuber(githuber);

        response.sendRedirect("githubers?login=" + login);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/track.jsp" ).forward( request, response );

    }
}
