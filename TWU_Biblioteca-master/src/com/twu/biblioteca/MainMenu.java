package com.twu.biblioteca;

import java.util.ArrayList;

public class MainMenu {

    private ArrayList<String> optionsList;

    public MainMenu() {
        optionsList = new ArrayList<>();
        optionsList.add("List of books");
    }

    public void showMainMenu() {
        for(int i = 0; i < optionsList.size(); i++) {
            System.out.println((i+1) + ". " + optionsList.get(i));
        }
    }
}
