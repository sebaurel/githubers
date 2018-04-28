package fr.wildcodeschool.githubtracker.dao;

import com.fasterxml.jackson.databind.ObjectMapper;
import fr.wildcodeschool.githubtracker.model.Githuber;

import javax.inject.Inject;
import java.io.IOException;
import java.net.URL;

public class GithubUtils {

    @Inject
    private ObjectMapper om;


    public GithubUtils() {
    }

    public Githuber parseGithuber(String login) {
        Githuber githuber = null;
        try {
            githuber = om.readValue(new URL("https://api.github.com/users/" + login), Githuber.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return githuber;    }
}
