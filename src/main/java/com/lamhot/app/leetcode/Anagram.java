package com.lamhot.app.leetcode;

public class Anagram {

    public static void main(String args[]) {
        Anagram ob = new Anagram();
        System.out.println(ob.isAnagram("lamhot", "Lamhot"));
        System.out.println(ob.isAnagram("lamhot", "Lamhott"));
        System.out.println(ob.isAnagram("lamhot", "Lahott"));
    }

    public boolean isAnagram(String a, String b) {
        int aL = a.length();
        int bL = b.length();
        if (aL != bL) return false;
        a = a.toLowerCase();
        b = b.toLowerCase();

        int[] charFreq = new int[26];


        for (int i = 0; i < aL; i++) {
            char current = a.charAt(i);
            int index = current - 'a';
            charFreq[index]++;

        }


        for (int i = 0; i < bL; i++) {
            char current = b.charAt(i);
            int index = current - 'a';
            charFreq[index]--;

        }

        for (int i = 0; i < 26; i++) {
            if (charFreq[i] != 0) return false;

        }

        return true;
    }

}
