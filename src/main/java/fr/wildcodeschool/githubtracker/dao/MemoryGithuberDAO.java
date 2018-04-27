package fr.wildcodeschool.githubtracker.dao;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.ObjectMapper;
import fr.wildcodeschool.githubtracker.model.Githuber;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Dependent;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ApplicationScoped
public class MemoryGithuberDAO implements GithuberDAO {

    Map<String, Githuber> mapGithubers = new HashMap<>();


    @Override
    public void saveGithuber(Githuber githuber) {
        mapGithubers.put(githuber.getLogin(), githuber);
    }

    @Override
    public List<Githuber> getGithubers() {

        List<Githuber> listGithubersMemory = new ArrayList<>();
        for (Map.Entry<String, Githuber> entry : mapGithubers.entrySet()){
            listGithubersMemory.add(entry.getValue());
        }

        return listGithubersMemory;
    }

    public Githuber parseGithuber(String login) {
        ObjectMapper objectMapper = new ObjectMapper();
        Githuber githuber = null;
        try {
            githuber = objectMapper.readValue(new URL("https://api.github.com/users/" + login), Githuber.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return githuber;
    }

    @PostConstruct
    private void memoryGithuber (){
        saveGithuber(parseGithuber("sebaurel"));
        saveGithuber(parseGithuber("TomBtz"));
        saveGithuber(parseGithuber("JulTorres"));
        saveGithuber(parseGithuber("loloof64"));
        saveGithuber(parseGithuber("xpdemon"));
        saveGithuber(parseGithuber("kobanogit"));
        saveGithuber(parseGithuber("devart64"));

        Githuber githuber01 = new Githuber("Aristote", "aristote@wcs.fr", "Aris", "https://s3-eu-west-1.amazonaws.com/sdz-upload/prod/upload/cactus3.png");
        saveGithuber(githuber01);

        /*List<Githuber> listGithubers = getGithubers();
        for (Githuber githuber : listGithubers){
            saveGithuber(githuber);
        }*/
    }

}