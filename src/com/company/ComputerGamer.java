package com.company;

import java.util.Random;

public class ComputerGamer extends Gamers {


    public ComputerGamer() {
        setName("Bilgisayar");
    }


    @Override
    public int[] moveCordinate() {
        int move[]=new int[2];
        int coorX=0;
        int coorY=0;
        do {
            Random rnd = new Random();

            coorX = rnd.nextInt(BoardTable.table.length);
            coorY = rnd.nextInt(BoardTable.table.length);
        } while (!BoardTable.checkXY(coorX,coorY));


            move[0]=coorX;
            move[1]=coorY;

        System.out.println("Bilgisayar X degeri : "+coorX+ConsoleColors.RESET);
        System.out.println("Bilgisayar Y degeri : "+coorY+ConsoleColors.RESET);




        return move;
    }

    @Override
    public char wantCharacter() {
        Random rand = new Random();
        int randInt = rand.nextInt(2);
        if (randInt == 0){
            setCharacter('S');
        }
        else{
            setCharacter('O');
        }
        return getCharacter();
    }
}
