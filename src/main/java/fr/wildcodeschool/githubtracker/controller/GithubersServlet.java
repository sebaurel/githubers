package fr.wildcodeschool.githubtracker.controller;

import fr.wildcodeschool.githubtracker.model.Githuber;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

@WebServlet(name = "GithubersServlet", urlPatterns = {"/githubers.html"})
public class GithubersServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Githuber> guithuberListe = new LinkedList<Githuber>();

        Githuber Githuber01 = new Githuber("Aristote", "aristote@wcs.fr", "Aris", "https://s3-eu-west-1.amazonaws.com/sdz-upload/prod/upload/cactus3.png");
        guithuberListe.add(Githuber01);
        Githuber Githuber02 = new Githuber("Euclide", "euclide@wcs.fr", "Heud", "https://dimelo-users-production.s3-eu-west-1.amazonaws.com/identity_avatars/283a08c68754dd05/avatar_x-large.png?5613c1f");
        guithuberListe.add(Githuber02);
        Githuber Githuber03 = new Githuber("Platon", "platon@wcs.fr", "Plate", "https://dimelo-users-production.s3-eu-west-1.amazonaws.com/identity_avatars/1943feab289b239b/avatar_x-large.png?6179b68");
        guithuberListe.add(Githuber03);
        Githuber Githuber04 = new Githuber("Pythagore", "pithagore@wcs.fr", "Pyta", "https://www.okiwoki.com/images/produits/parodies-manga/xpeace-and-love-chibi-version-t-shirt-enfant-fille-noir-f-3-4-ans_1.jpg.pagespeed.ic.Zoeful13LH.jpg");
        guithuberListe.add(Githuber04);
        Githuber Githuber05 = new Githuber("Plutarque", "plutarque@wcs.fr", "Aplus", "http://www.mdetouraine.fr/bundles/site/images/upload/avatar_napooh-1.jpg");
        guithuberListe.add(Githuber05);

        request.setAttribute("guithuberListe", guithuberListe);

        getServletContext().getRequestDispatcher("/githubers.jsp" ).forward( request, response );

    }
}
