package com.lamhot.app.leetcode;

public class Q292NimGame {

    public boolean canWinNim(int n) {
        if (n % 4 == 0) return false;
        else return true;
    }

    public static void main(String[] args)
    {
        Q292NimGame nim = new Q292NimGame();
        System.out.println(nim.canWinNim(4));
    }
}
