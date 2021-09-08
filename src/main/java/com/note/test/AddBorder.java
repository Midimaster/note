package com.note.test;

import java.util.Arrays;

public class AddBorder {
    public static void main(String[] args) {

    }

    String[] addBorder(String[] picture) {
        String[] newPicture = new String[picture.length + 2];
        for (int i = 0; i < picture.length; i++) {
            newPicture[i + 1] = "*" + picture[i] + "*";
        }
        newPicture[0] = newPicture[picture.length + 1] = newPicture[1].replaceAll(".", "*");
        return newPicture;
    }

    boolean areSimilar(int[] a, int[] b) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                count++;
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a,b) && count <= 2;
    }
}
