package com.rps.model;

//encapsulation
public class Player {
    // private fields
    private String username; // used for identification
    private String password; // for security
    private int wins; // wins every match
    private int gamesPlayed; //

    // constructor: called when loadeing from json or creating a new account
    public Player(String username, String password, int wins, int gamesPlayed) {
        this.username = username;
        this.password = password;
        this.wins = wins;
        this.gamesPlayed = gamesPlayed;
    }

    // getters and setters
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

    public int getWins() {
        return wins;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public void incrementWins() {
        this.wins++;
    }

    public void incrementGamesPlayed() {
        this.gamesPlayed++;
    }

    public double getWinRate() {
        if (gamesPlayed == 0)
            return 0.0;
        return ((double) wins / gamesPlayed) * 100;
    }
}
