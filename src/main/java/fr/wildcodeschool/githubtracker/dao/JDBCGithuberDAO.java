package fr.wildcodeschool.githubtracker.dao;

import fr.wildcodeschool.githubtracker.model.Githuber;
import fr.wildcodeschool.githubtracker.service.ConnectionFactory;

import javax.annotation.PostConstruct;
import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Dependent
@Default
public class JDBCGithuberDAO extends GithubUtils implements GithuberDAO{


    public static final String URL = "jdbc:mysql://localhost:3306/githuber";
    public static final String USER = "root";
    public static final String PASS = "root";

    public static Connection getConnection(){
        try {
            Class<?> driverClass = null;
            driverClass = Class.forName("com.mysql.jdbc.Driver");

            Driver driverInstance = (Driver) driverClass.newInstance();
            //DriverManager.registerDriver(new Driver());
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException ex) {
            throw new RuntimeException("Error connecting to the database", ex);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return null;
    }

    Connection connection = getConnection();
    //@Inject
    //private ConnectionFactory connectionFactory;

    //private Connection connection = connectionFactory.getConnection();

    @Override
    public void saveGithuber(Githuber githuber) {
        String sql = "INSERT INTO githuber (name, login, githuber_id, avatar_url, bio) VALUES(?,?,?,?,?)";

        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, githuber.getName());
            statement.setString(2, githuber.getLogin());
            statement.setLong(3, githuber.getId());
            statement.setString(4, githuber.getAvatar_url());
            statement.setString(5, githuber.getBio());
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<Githuber> getGithubers() {
        List<Githuber> listGithubersMemory = new ArrayList<>();

        try {

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM githuber");

            while(resultSet.next())
            {
                Githuber githuber = new Githuber();
                githuber.setId( resultSet.getInt("id") );
                githuber.setName( resultSet.getString("name") );
                githuber.setAvatar_url( resultSet.getString("avatar_url") );
                githuber.setBio( resultSet.getString("bio"));
                githuber.setGithuber_id( resultSet.getInt("githuber_id"));
                githuber.setEmail( resultSet.getString("email"));
                githuber.setLocation( resultSet.getString("location"));
                githuber.setLogin( resultSet.getString("login"));

                listGithubersMemory.add(githuber);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return listGithubersMemory;
    }


    public void deleteGithuber(String githuberLogin){
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate("DELETE FROM githuber WHERE login = \"" + githuberLogin +"\"");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    @PostConstruct
    private void JDBCGithuberDAO (){
        Statement statement = null;

    }

}
