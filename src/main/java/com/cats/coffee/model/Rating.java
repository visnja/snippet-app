package com.cats.coffee.model;

import javax.persistence.*;

/**
 * Created by Milica on 23-Jun-17
 */
@Entity
public class Rating {
    @Id
    @GeneratedValue
    private long id;
    @Column
    private boolean upVote;
    @ManyToOne
    private User user;
    @ManyToOne
    private Comment comment;

    public boolean isUpVote() {
        return upVote;
    }

    public void setUpVote(boolean upVote) {
        this.upVote = upVote;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public Rating(boolean upVote, User user, Comment comment) {
        super();
        this.upVote = upVote;
        this.user = user;
        this.comment = comment;
    }

    public Rating() {

    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Rating [upVote=");
        builder.append(upVote);
        builder.append(", user=");
        builder.append(user);
        builder.append(", comment=");
        builder.append(comment);
        builder.append("]");
        return builder.toString();
    }
}
