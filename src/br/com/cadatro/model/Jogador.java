/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cadatro.model;

/**
 *
 * @author Joel Sousa
 */
public class Jogador {
    private String player;
    private String position;
    private Integer year;
    private String currentTeam;
    private Integer goalsScored;

    public Jogador() {
    }

    public Jogador(String player, String position, Integer year, String currentTeam, Integer goalsScored) {
        this.player = player;
        this.position = position;
        this.year = year;
        this.currentTeam = currentTeam;
        this.goalsScored = goalsScored;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getCurrentTeam() {
        return currentTeam;
    }

    public void setCurrentTeam(String currentTeam) {
        this.currentTeam = currentTeam;
    }

    public Integer getGoalsScored() {
        return goalsScored;
    }

    public void setGoalsScored(Integer goalsScored) {
        this.goalsScored = goalsScored;
    }

    @Override
    public String toString() {
        return "Jogador{" + "player=" + player + ", position=" + position + ", year=" + year + ", currentTeam=" + currentTeam + ", goalsScored=" + goalsScored + '}';
    }
    
    
}
