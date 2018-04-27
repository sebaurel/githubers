package fr.wildcodeschool.githubtracker.dao;

import fr.wildcodeschool.githubtracker.model.Githuber;

import javax.annotation.Resource;
import javax.enterprise.context.Dependent;
import java.sql.Connection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface GithuberDAO {

    void saveGithuber(Githuber githuber);

    List<Githuber> getGithubers();

}
