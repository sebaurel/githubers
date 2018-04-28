package fr.wildcodeschool.githubtracker.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//@JsonIgnoreProperties(ignoreUnknown = true)
public class Githuber {
    private String name;
    private String email;
    private String login;
    private String avatar_url;
    private String bio;

    public Githuber(String name, String email, String login, String avatar_url) {
        this.name = name;
        this.email = email;
        this.login = login;
        this.avatar_url = avatar_url;
    }

    public Githuber(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
