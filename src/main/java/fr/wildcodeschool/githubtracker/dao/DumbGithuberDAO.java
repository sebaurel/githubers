package fr.wildcodeschool.githubtracker.dao;

import fr.wildcodeschool.githubtracker.model.Githuber;

import javax.enterprise.context.Dependent;
import java.util.ArrayList;
import java.util.List;

@Dependent
public class DumbGithuberDAO implements GithuberDAO{

    private List<Githuber> listGitubers = new ArrayList<>();


    @Override
    public void saveGithuber(Githuber githuber) {

    }

    @Override
    public List<Githuber> getGithubers(){
        Githuber githuber01 = new Githuber("Aristote", "aristote@wcs.fr", "Aris", "https://s3-eu-west-1.amazonaws.com/sdz-upload/prod/upload/cactus3.png");
        listGitubers.add(githuber01);
        Githuber githuber02 = new Githuber("Euclide", "euclide@wcs.fr", "Heud", "https://dimelo-users-production.s3-eu-west-1.amazonaws.com/identity_avatars/283a08c68754dd05/avatar_x-large.png?5613c1f");
        listGitubers.add(githuber02);
        Githuber githuber03 = new Githuber("Platon", "platon@wcs.fr", "Plate", "https://dimelo-users-production.s3-eu-west-1.amazonaws.com/identity_avatars/1943feab289b239b/avatar_x-large.png?6179b68");
        listGitubers.add(githuber03);
        Githuber githuber04 = new Githuber("Pythagore", "pithagore@wcs.fr", "Pyta", "https://www.okiwoki.com/images/produits/parodies-manga/xpeace-and-love-chibi-version-t-shirt-enfant-fille-noir-f-3-4-ans_1.jpg.pagespeed.ic.Zoeful13LH.jpg");
        listGitubers.add(githuber04);
        Githuber githuber05 = new Githuber("Plutarque", "plutarque@wcs.fr", "Aplus", "http://www.mdetouraine.fr/bundles/site/images/upload/avatar_napooh-1.jpg");
        listGitubers.add(githuber05);
        return listGitubers;
    }

    public List<Githuber> getListGitubers() {
        return listGitubers;
    }

}
