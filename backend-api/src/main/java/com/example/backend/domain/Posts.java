package com.example.backend.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "posts")
public class Posts extends GenericDomain{
    @Id@Getter@Setter
    private Integer id;
    @Getter@Setter
    private Integer user_id;
    @Getter@Setter
    private String image;
    @Getter@Setter
    private String caption;
    @Getter@Setter
    private Integer likes;

    @Override
    protected Object keyObject() {
        return getId();
    }
}
