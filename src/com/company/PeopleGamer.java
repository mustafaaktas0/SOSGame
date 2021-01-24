package com.company;

import java.util.Scanner;

public class PeopleGamer extends Gamers{

    public PeopleGamer() {

        Scanner scanner =new Scanner(System.in);
        String name;
        System.out.println("Oyuncu ismi giriniz ..");
        name =scanner.nextLine();
        setName(name);
    }

    @Override
    public int[] moveCordinate() {
        int move[]=new int[2];
        int coorX=0;
        int coorY=0;

        do {

            System.out.println("X değeri giriniz! ");
            coorX = controlCoordinate();


        }
        while (coorX < 0 || coorX > BoardTable.table.length - 1);


        do {
            System.out.println("Y degeri giriniz! ");
            coorY = controlCoordinate();
        } while (coorY < 0 || coorY > BoardTable.table.length  - 1);





        move[0]=coorX;
        move[1]=coorY;

        return move;
    }



    public    int  controlCoordinate(){
        Scanner scan = new Scanner(System.in);
        int coor = 0;
        while (!scan.hasNextInt()) {
            System.out.println("Lutfen tam sayı değeri giriniz!");
            scan.nextLine();
        }
        coor= scan.nextInt();
        return  coor ;
    }

    @Override
    public char wantCharacter() {
        Scanner scanner =new Scanner(System.in);
        String ch;


        System.out.println("Karakter Giriniz (S-O):");
        ch =scanner.next();

        if(ch.equals("S")||ch.equals("s")){
            setCharacter('S');
        }

        else if (ch.equals("O") ||ch.equals("o")) {
            setCharacter('O');
        }
        else{
            System.out.println("Gecersiz karakter!!!.....");
            return  wantCharacter();
        }
        return getCharacter();
    }
}
