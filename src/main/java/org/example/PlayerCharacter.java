package org.example;

public class PlayerCharacter {
    static int x=0;
    static int y= 0;
    public static int getX() {
        return x;
    }

    public static int getY() {
        return y;
    }

    public static void setX(int x) {
        PlayerCharacter.x = x;
    }
    public static void setY(int y) {
        PlayerCharacter.y = y;
    }

    public static void  move(char move) {
        if(move == 'w') {
          y++ ;
       }
        else if(move == 's') {
            y--;
        }
        else if(move == 'a') {
            x--;
        } else if (move=='d') {
            x++;

        }

    }
}
