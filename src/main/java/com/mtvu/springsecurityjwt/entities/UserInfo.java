package com.mtvu.springsecurityjwt.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
public class UserInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(unique = true)
    private String userName;

    private String password;

    private boolean enabled;

    @OneToMany(fetch = FetchType.EAGER)
    private Set<Authority> authorities;

    public UserInfo() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public Set<Authority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Set<Authority> authorities) {
        this.authorities = authorities;
    }
}
