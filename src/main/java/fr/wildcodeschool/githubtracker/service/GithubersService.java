package fr.wildcodeschool.githubtracker.service;

import fr.wildcodeschool.githubtracker.dao.*;
import fr.wildcodeschool.githubtracker.model.Githuber;

import java.util.List;

public class GithubersService {

    private GithuberDAO githuberDAO;

    public GithubersService(GithuberDAO githuberDAO) {
        this.githuberDAO = githuberDAO;
    }

    public List<Githuber> getAllGithubers(){
        List<Githuber> listGithubers = githuberDAO.getGithubers();
        return listGithubers;
    }

    public Githuber getGithuber(String login){
        List<Githuber> listGithubers = githuberDAO.getGithubers();
        Githuber githuber = null;

        for (Githuber git : listGithubers){

            if (git.getLogin().equals(login)){
                githuber = git;
            }
        }
        return githuber;
    }

    public void track(String login){
        //TODO
    }
}