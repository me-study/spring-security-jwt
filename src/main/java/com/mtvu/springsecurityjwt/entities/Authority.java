package com.mtvu.springsecurityjwt.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Authority {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(unique = true)
    private String authority;

    public Authority() {
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}


