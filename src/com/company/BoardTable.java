package com.company;

import java.util.Scanner;

public class BoardTable {

    private int size;
    public static char table[][];


    public BoardTable(int size, char[][] table) {
        this.size = size;
        this.table = table;

    }

    public void createTable() {

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                table[i][j] = 'X';

            }

        }

    }

    public void showTable(){
        System.out.print("  ");
        for (int i = 0; i< table.length;i++) {
            System.out.print(ConsoleColors.YELLOW+i+ConsoleColors.RESET);
        }
        System.out.println();
        for (int i = 0; i< table.length;i++) {
            System.out.print(ConsoleColors.YELLOW+i+ " ");
            for (int j = 0; j< table.length;j++) {

                if(table[i][j]=='S'){
                    System.out.print(ConsoleColors.BLUE+this.table[i][j]+ConsoleColors.RESET);
                }
                else if(table[i][j]=='O'){
                    System.out.print(ConsoleColors.CYAN+this.table[i][j]+ConsoleColors.RESET);

                }
                else   System.out.print(ConsoleColors.RED+this.table[i][j]+ConsoleColors.RESET);
            }
            System.out.println();
        }




    }
    public static int  controlSize(){
        Scanner scan = new Scanner(System.in);
        int size = 0;
        while (!scan.hasNextInt()) {
            System.out.println("Lutfen tam sayı değeri giriniz!");
            scan.nextLine();
        }
        size= scan.nextInt();
        return  size ;
    }

    public  static int getSize(){
        int size  = 0;
        do{

            System.out.println("Lutfen boyut için 3 ile 7 arasında değer giriniz! ");
            size = controlSize();
        }
        while (size < 3 || size > 7);


        return size;
    }

    public  char[][] playTable(int coorX,int coorY ,char character) {

        table[coorX][coorY]=character;
        System.out.println("Girilen Karakter --->"+character);
        return table;
    }

    public boolean isEmptyBoard(){

        for(int i=0;i< table.length;i++){
            for(int j=0;j< table.length;j++){
                if(table[i][j]=='X'){
                    return true;
                }
            }
        }
        return false;
    }
    public static  boolean checkXY(int x,int y){

        if(table[x][y]=='X') {
            return true;
        }
        else
            return  false;

    }

}