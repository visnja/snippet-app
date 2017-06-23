package com.cats.coffee.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by Milica on 23-Jun-17
 */
@Entity
public class Snippet {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private String description;
    @Column
    private String codeSnippet;
    @Column
    private Date date;

    @Column
    private String repositoryUrl;

    @Column
    private int duration;
    @Column
    private boolean banned;
    @ManyToOne
    private Language language;
    @ManyToOne
    private User user;
    @OneToMany
    private List<Comment> comments;

    public String getDescription() {

        return description;
    }

    public void setDescription(String description) {

        this.description = description;
    }

    public String getCodeSnippet() {

        return codeSnippet;
    }

    public void setCodeSnippet(String codeSnippet) {

        this.codeSnippet = codeSnippet;
    }

    public Date getDate() {

        return date;
    }

    public void setDate(Date date) {

        this.date = date;
    }

    public String getRepositoryUrl() {

        return repositoryUrl;
    }

    public void setRepositoryUrl(String repositoryUrl) {

        this.repositoryUrl = repositoryUrl;
    }

    public int getDuration() {

        return duration;
    }

    public void setDuration(int duration) {

        this.duration = duration;
    }

    public boolean isBanned() {

        return banned;
    }

    public void setBanned(boolean banned) {

        this.banned = banned;
    }

    public Language getLanguage() {

        return language;
    }

    public void setLanguage(Language language) {

        this.language = language;
    }

    public User getUser() {

        return user;
    }

    public void setUser(User user) {

        this.user = user;
    }

    public List<Comment> getComments() {

        return comments;
    }

    public void setComments(List<Comment> comments) {

        this.comments = comments;
    }

    public Snippet(String description, String codeSnippet, Date date, String repositoryUrl, int duration,
                   boolean banned, Language language, User user, List<Comment> comments) {

        super();
        this.description = description;
        this.codeSnippet = codeSnippet;
        this.date = date;
        this.repositoryUrl = repositoryUrl;
        this.duration = duration;
        this.banned = banned;
        this.language = language;
        this.user = user;
        this.comments = comments;
    }

    public Snippet() {

    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();
        builder.append("Snippet [description=").append(description).append(", codeSnippet=").append(codeSnippet)
                .append(", date=").append(date).append(", repositoryUrl=").append(repositoryUrl).append(", duration=")
                .append(duration).append(", banned=").append(banned).append(", language=").append(language)
                .append(", user=").append(user).append(", comments=").append(comments).append("]");
        return builder.toString();
    }
}
