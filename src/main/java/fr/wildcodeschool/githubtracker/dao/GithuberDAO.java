package fr.wildcodeschool.githubtracker.dao;

import fr.wildcodeschool.githubtracker.model.Githuber;

import javax.annotation.Resource;
import java.sql.Connection;
import java.util.List;

public interface GithuberDAO {

    List<Githuber> getGithubers();
}
