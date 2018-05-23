package fr.wildcodeschool.githubtracker.model;


public class Githuber {
    private long id;
    private String name;
    private String email;
    private String login;
    private String avatar_url;
    private String bio;
    private String location;
    private String url;
    private long githuber_id;

    public Githuber(long id, String name, String email, String login, String avatar_url, String bio, String location, String url, long githuber_id) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.login = login;
        this.avatar_url = avatar_url;
        this.bio = bio;
        this.location = location;
        this.url = url;
        this.githuber_id = githuber_id;
    }

    public Githuber() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public long getGithuber_id() {
        return githuber_id;
    }

    public void setGithuber_id(long github_id) {
        this.githuber_id = github_id;
    }
}
