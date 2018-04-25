package fr.wildcodeschool.githubtracker.dao;

import com.fasterxml.jackson.databind.ObjectMapper;
import fr.wildcodeschool.githubtracker.model.Githuber;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@ApplicationScoped
public class MemoryGithuberDAO implements GithuberDAO {


    @Override
    public List<Githuber> getGithubers() {
        return null;
    }

    @Override
    public void saveGithuber(Githuber githuber) {
        mapGithubers.put(githuber.getLogin(), githuber);
    }

    public Githuber parseGithuber(String login) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Githuber githuber = objectMapper.readValue(new URL("https://api.github.com/users/"+ login), Githuber.class);
        return githuber;
    }

    @PostConstruct
    private void MemoryGithuberDAO() {

        try {
            saveGithuber(parseGithuber("sebaurel"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*Githuber Githuber01 = new Githuber("Aristote", "aristote@wcs.fr", "Aris", "https://s3-eu-west-1.amazonaws.com/sdz-upload/prod/upload/cactus3.png");
        saveGithuber(Githuber01);
        Githuber Githuber02 = new Githuber("Euclide", "euclide@wcs.fr", "Heud", "https://dimelo-users-production.s3-eu-west-1.amazonaws.com/identity_avatars/283a08c68754dd05/avatar_x-large.png?5613c1f");
        saveGithuber(Githuber02);
        Githuber Githuber03 = new Githuber("Platon", "platon@wcs.fr", "Plate", "https://dimelo-users-production.s3-eu-west-1.amazonaws.com/identity_avatars/1943feab289b239b/avatar_x-large.png?6179b68");
        saveGithuber(Githuber03);
        Githuber Githuber04 = new Githuber("Pythagore", "pithagore@wcs.fr", "Pyta", "https://www.okiwoki.com/images/produits/parodies-manga/xpeace-and-love-chibi-version-t-shirt-enfant-fille-noir-f-3-4-ans_1.jpg.pagespeed.ic.Zoeful13LH.jpg");
        saveGithuber(Githuber04);
        Githuber Githuber05 = new Githuber("Plutarque", "plutarque@wcs.fr", "Aplus", "http://www.mdetouraine.fr/bundles/site/images/upload/avatar_napooh-1.jpg");
        saveGithuber(Githuber05);*/
    }
}
