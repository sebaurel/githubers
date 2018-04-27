package fr.wildcodeschool.githubtracker.service;

import fr.wildcodeschool.githubtracker.dao.*;
import fr.wildcodeschool.githubtracker.model.Githuber;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;

@Dependent
public class GithubersService {

    private MemoryGithuberDAO githuberDAO;

    @Inject
    public GithubersService(MemoryGithuberDAO githuberDAO) {

        this.githuberDAO = githuberDAO;
    }

    public List<Githuber> getAllGithubers(){
        List<Githuber> listGithubers = githuberDAO.getGithubers();
        return listGithubers;
    }

    public Githuber getGithuber(final String login){
        List<Githuber> listGithubers = githuberDAO.getGithubers();
        Githuber githuber = listGithubers.stream()
                .filter(x -> login.equals(x.getLogin()))
                .findAny()
                .orElse(null);

        /*for (Githuber git : listGithubers){

            if (git.getLogin().equals(login)){
                githuber = git;
            }
        }*/
        return githuber;
    }

    public void track(String login){
        //TODO
    }
}
