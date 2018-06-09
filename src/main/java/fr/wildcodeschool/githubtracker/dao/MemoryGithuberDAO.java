package fr.wildcodeschool.githubtracker.dao;

import fr.wildcodeschool.githubtracker.model.Githuber;

import javax.annotation.PostConstruct;
import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Default;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Dependent
//@Default
@Alternative
@InMemory
public class MemoryGithuberDAO extends GithubUtils implements GithuberDAO {



    private Map<String, Githuber> mapGithubers = new HashMap<>();

    @Override
    public void saveGithuber(Githuber githuber) {
        if (githuber != null){
            mapGithubers.put(githuber.getLogin(), githuber);
        }
    }

    @Override
    public List<Githuber> getGithubers() {

        List<Githuber> listGithubersMemory = new ArrayList<>();
        for (Map.Entry<String, Githuber> entry : mapGithubers.entrySet()){
            listGithubersMemory.add(entry.getValue());
        }

        return listGithubersMemory;
    }

    @Override
    public void deleteGithuber(String login) {

    }


    @PostConstruct
    private void memoryGithuber (){

    }

}
