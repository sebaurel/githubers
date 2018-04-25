package fr.wildcodeschool.githubtracker.dao;

import fr.wildcodeschool.githubtracker.model.Githuber;

import javax.annotation.Resource;
import java.sql.Connection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface GithuberDAO {

    Map<String, Githuber> mapGithubers= new HashMap<>();


    List<Githuber> getGithubers();

    void saveGithuber(Githuber githuber);
}
