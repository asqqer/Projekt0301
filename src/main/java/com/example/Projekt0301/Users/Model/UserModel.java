package com.example.Projekt0301.Users.Model;
import javax.persistence.*;

@Entity
@Table(name = "users")
public class UserModel {
        @Id
        @GeneratedValue(strategy= GenerationType.IDENTITY)
        @Column(name = "id", unique = true, nullable = false)
        private Integer id;
        @Column(name = "username")
        private String username;

        @Column(name = "password")
        private String password;

    public UserModel(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public UserModel() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
