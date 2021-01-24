package com.company;

import java.util.Random;

public class Main {
    static int size;
    static char[][] table;
    private static Object Gamers;

    public static void main(String[] args) {
        // write your code here
        size = BoardTable.getSize();
        table = new char[size][size];

        BoardTable boardTable=new BoardTable(size,table);
        boardTable.createTable();
        boardTable.showTable();

        PeopleGamer peopleGamer=new PeopleGamer();
        ComputerGamer computerGamer =new ComputerGamer();



        int start =startRandom();
        while (boardTable.isEmptyBoard()){
    if(start ==0){
        Play.play(computerGamer,boardTable);
        boardTable.showTable();

        Play.play(peopleGamer,boardTable);
        boardTable.showTable();
        System.out.println("**************************************************************************");
    }
    else{
        Play.play(peopleGamer,boardTable);
        boardTable.showTable();

        Play.play(computerGamer,boardTable);
        boardTable.showTable();
        System.out.println("**************************************************************************");
    }

}
        System.out.println("********************OYUN SONA ERDİ************************** ");
        if(computerGamer.getScore()>peopleGamer.getScore()) System.out.println(ConsoleColors.RED+"Bilgisayar kazandi "+ConsoleColors.RESET);
        else if(peopleGamer.getScore()>computerGamer.getScore()) System.out.println(peopleGamer.getName()+ConsoleColors.RED+" kazandi "+ConsoleColors.RESET);
        else System.out.println("Oyun berabere bitti .");

            }

    public  static int  startRandom(){

        Random rand = new Random();
        int randInt = rand.nextInt(2);
        if(randInt==0)
          return 0;
        else
            return 1;
    }
}
