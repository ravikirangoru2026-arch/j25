package org.example.ds;

public class RoboMoveLRUD {
    static Boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        for (char i : moves.toCharArray()) {
            if (i == 'L' || i == 'l')
                --x;
            else if (i == 'R' || i == 'r')
                ++x;
            else if (i == 'U' || i == 'u')
                ++y;
            else if (i == 'D' || i == 'u')
                --y;
            else
                System.out.println("Invalid Move.");
        }
        if (x == 0 && y == 0)
            return true;
        else
            return false;
    }

    static void main(String[] args) {
        System.out.println(judgeCircle("LRDUU"));
        System.out.println(judgeCircle("LLRURD"));
    }
}
