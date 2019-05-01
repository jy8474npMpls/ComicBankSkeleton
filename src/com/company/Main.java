package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Comic> allComics = new ArrayList<Comic>();

        Comic exampleComic = new Comic(999, "Batman", 321, 1939, "The Batman", 0.10, 1000000.00);

        allComics.add(exampleComic);

        ArrayList<Album> allInventory = new ArrayList<>();
        allInventory.addAll(lpInventory);
        allInventory.addAll(cdInventory);

        String searchText = "Batman"; // ("Enter artist or title to search for. Works for partial artists/titles.");
        searchforComic(allComics), searchText);

        searchText = searchText.toLowerCase();
        boolean found = false;
        for (Comic c : allInventory) {
            if (c.match(searchText)) {
                found = true;
                System.out.println(c);
            }
        }
        if (!found) {
            System.out.println("No matching comics found for" + searchText);
        }
    }
}