package com.cats.coffee.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by Milica on 23-Jun-17
 */
@Entity
public class Comment {

    @Id
    @GeneratedValue
    private long id;
    @Column
    private String text;
    @Column
    private Date date;
    @ManyToOne
    private User user;
    @ManyToOne
    private Snippet snippet;
    @OneToMany
    private List<Rating> rating;

    private int upVotes;
    private int downVotes;

    public String getText() {

        return text;
    }

    public void setText(String text) {

        this.text = text;
    }

    public Date getDate() {

        return date;
    }

    public void setDate(Date date) {

        this.date = date;
    }

    public User getUser() {

        return user;
    }

    public void setUser(User user) {

        this.user = user;
    }

    public Snippet getSnippet() {

        return snippet;
    }

    public void setSnippet(Snippet snippet) {

        this.snippet = snippet;
    }

    public List<Rating> getRating() {

        return rating;
    }

    public void setRating(List<Rating> rating) {

        this.rating = rating;
    }

    public int getUpVotes() {

        return upVotes;
    }

    public void setUpVotes(int upVotes) {

        this.upVotes = upVotes;
    }

    public int getDownVotes() {

        return downVotes;
    }

    public void setDownVotes(int downVotes) {

        this.downVotes = downVotes;
    }

    public Comment() {

    }

    public Comment(String text, Date date, User user, Snippet snippet, List<Rating> rating, int upVotes,
                   int downVotes) {

        super();
        this.text = text;
        this.date = date;
        this.user = user;
        this.snippet = snippet;
        this.rating = rating;
        this.upVotes = upVotes;
        this.downVotes = downVotes;
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();
        builder.append("Comment [text=");
        builder.append(text);
        builder.append(", date=");
        builder.append(date);
        builder.append(", user=");
        builder.append(user);
        builder.append(", snippet=");
        builder.append(snippet);
        builder.append(", rating=");
        builder.append(rating);
        builder.append(", upVotes=");
        builder.append(upVotes);
        builder.append(", downVotes=");
        builder.append(downVotes);
        builder.append("]");
        return builder.toString();
    }
}
