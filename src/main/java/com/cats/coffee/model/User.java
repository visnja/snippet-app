package com.cats.coffee.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Milica on 23-Jun-17
 */
@Entity
public class User {
    @Id
    @GeneratedValue
    private long id;
    @Column
    private Role role;
    @Column
    private String username;
    @Column
    private String password;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String phoneNumber;
    @Column
    private String email;
    @Column
    private String address;
    @Column
    private String photoUrl;
    @Column
    private boolean banned;
    @OneToMany
    private List<Snippet> snippets;
    @OneToMany
    private List<Comment> comments;
    @OneToMany
    private List<Rating> ratings;

    public Role getRole() {

        return role;
    }

    public void setRole(Role role) {

        this.role = role;
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

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public String getLastName() {

        return lastName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public String getPhoneNumber() {

        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {

        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public String getAddress() {

        return address;
    }

    public void setAddress(String address) {

        this.address = address;
    }

    public String getPhotoUrl() {

        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {

        this.photoUrl = photoUrl;
    }

    public boolean isBanned() {

        return banned;
    }

    public void setBanned(boolean banned) {

        this.banned = banned;
    }

    public List<Snippet> getSnippets() {

        return snippets;
    }

    public void setSnippets(List<Snippet> snippets) {

        this.snippets = snippets;
    }

    public List<Comment> getComments() {

        return comments;
    }

    public void setComments(List<Comment> comments) {

        this.comments = comments;
    }

    public List<Rating> getRatings() {

        return ratings;
    }

    public void setRatings(List<Rating> ratings) {

        this.ratings = ratings;
    }
}
