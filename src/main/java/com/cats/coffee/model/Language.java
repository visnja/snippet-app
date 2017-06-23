package com.cats.coffee.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Milica on 23-Jun-17
 */
@Entity
public class Language {
    @Id
    @GeneratedValue
    private long id;
    @Column
    private String languageName;
    @OneToMany
    private List<Snippet> snippets;

    public String getLanguageName() {
        return languageName;
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }

    public List<Snippet> getSnippets() {
        return snippets;
    }

    public void setSnippets(List<Snippet> snippets) {
        this.snippets = snippets;
    }

    public Language(String languageName, List<Snippet> snippets) {
        super();
        this.languageName = languageName;
        this.snippets = snippets;
    }

    public Language() {

    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Language [languageName=");
        builder.append(languageName);
        builder.append(", snippets=");
        builder.append(snippets);
        builder.append("]");
        return builder.toString();
    }
}
