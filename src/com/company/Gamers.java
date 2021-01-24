package com.company;

import java.util.Scanner;

public abstract class  Gamers {


    private char character;
    private int score;
    private String name;

    public abstract int[] moveCordinate();

    public abstract char wantCharacter();





    public char getCharacter() {
        return character;
    }

    public void setCharacter(char character) {
        this.character = character;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
