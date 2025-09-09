package com.example.securitytry.model;

public class AppUser {
    private String username;
    private String role;

    public AppUser() { }

    public AppUser(String username, String role) {
        this.username = username;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "AppUser{username='" + username + "', role='" + role + "'}";
    }
}
