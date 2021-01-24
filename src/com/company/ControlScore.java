package com.company;

public class ControlScore {




    public static  int score(char character, int x,int y,int size) {

        int scor = 0;
        if (character == 'S') {
            if ((x < size && y + 2 < size)) {
                if (BoardTable.table[x][y + 1] == 'O' && BoardTable.table[x][y + 2] == 'S') {
                    System.out.println(" S harfi yana dogru sos yapıldı");
                    scor+=1;
                }
            }
            if (x + 2 < size && y < size) {
                if (BoardTable.table[x + 1][y] == 'O' && BoardTable.table[x + 2][y] == 'S') {
                    System.out.println("S harfi asagı dogru sos yapıldı");
                    scor+=1;

                }
            }
            if (x - 2 >= 0 && y < size) {
                if (BoardTable.table[x - 1][y] == 'O' && BoardTable.table[x - 2][y] == 'S') {
                    System.out.println("S harfi yukarı dogru sos yapıldı");
                    scor+=1;

                }
            }
            if (x < size && y - 2 >= 0) {
                if (BoardTable.table[x][y - 1] == 'O' && BoardTable.table[x][y - 2] == 'S') {
                    System.out.println("S harfi yana geri sos yapıldı");
                    scor+=1;

                }
            }
            if (x - 2 >= 0 && y - 2 >= 0) {
                if (BoardTable.table[x - 1][y - 1] == 'O' && BoardTable.table[x - 2][y - 2] == 'S') {
                    System.out.println("S harfi capraz geri sos yapıldı");
                    scor+=1;

                }
            }
            if (x + 2 < size && y + 2 < size) {
                if (BoardTable.table[x + 1][y + 1] == 'O' && BoardTable.table[x + 2][y + 2] == 'S') {
                    System.out.println("S harfi capraz ileri sos yapıldı");
                    scor+=1;

                }
            }
            if (x - 2 >= 0 && y + 2 < size) {
                if (BoardTable.table[x - 1][y + 1] == 'O' && BoardTable.table[x - 2][y + 2] == 'S') {
                    System.out.println("S harfi capraz ileri sos yapıldı");
                    scor+=1;

                }
            }
            if (y - 2 >= 0 && x + 2 < size) {
                if (BoardTable.table[x + 1][y - 1] == 'O' && BoardTable.table[x + 2][y - 2] == 'S') {
                    System.out.println("S harfi capraz ileri sos yapıldı");
                    scor+=1;

                }
            }

        }


        if (character == 'O') {
            if (x < size && y + 1 < size && y - 1 >= 0) {
                if (BoardTable.table[x][y + 1] == 'S' && BoardTable.table[x][y - 1] == 'S') {
                    System.out.println("O harfi yatay sos");
                    scor+=1;

                }
            }
            if (x + 1 < size && y < size && x - 1 >= 0) {
                if (BoardTable.table[x - 1][y] == 'S' && BoardTable.table[x + 1][y] == 'S') {
                    System.out.println("O harfi dikey sos");
                    scor+=1;

                }
            }
            if (x - 1 >= 0 && y + 1 < size && x + 1 < size && y - 1 >= 0) {
                if (BoardTable.table[x - 1][y + 1] == 'S' && BoardTable.table[x + 1][y - 1] == 'S') {
                    System.out.println("O harfi   çapraz sos");
                    scor+=1;

                }
            }
            if (x - 1 >= 0 && y - 1 >= 0 && x + 1 < size && y + 1 < size) {
                if (BoardTable.table[x - 1][y - 1] == 'S' && BoardTable.table[x + 1][y + 1] == 'S') {
                    System.out.println("O harfi   çapraz sos");
                    scor+=1;

                }
            }
        }
        return scor;
    }


}
