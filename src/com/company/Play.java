package com.company;

public class Play {


    public static void play(Gamers gamer,BoardTable boardTable){

        int coorX = -1, coorY = -1;
        boolean tableCoorCheck = true;
        char getCharacter='X';
        System.out.println(" Sıra "+gamer.getName());

if(boardTable.isEmptyBoard()){


    do {
        System.out.println("Lutfen boş alana karakter girişi yapın");


        int [] moveCoor =gamer.moveCordinate();
        coorX = moveCoor[0];
        coorY = moveCoor[1];

        tableCoorCheck = BoardTable.checkXY(coorX, coorY);
    }while (!tableCoorCheck);


     getCharacter =gamer.wantCharacter();
    boardTable.playTable(coorX,coorY, getCharacter);
}
        gamer.setScore(ControlScore.score(getCharacter,coorX,coorY,BoardTable.table.length)+gamer.getScore());
        System.out.println(gamer.getName()+ConsoleColors.CYAN+"   Oyuncu Puanı " +gamer.getScore()+ConsoleColors.RESET);

    }


    }

