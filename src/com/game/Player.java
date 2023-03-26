package com.game;

import java.util.Scanner;

public class Player {

    // player fields
    String name;
    String type;

    // player contractor
    Player(String type) {

        this.type = type;

        Scanner input = new Scanner(System.in);
        if (type == "X") {
            System.out.println("Player selecting X, enter your name: ");
            this.name = input.nextLine();
        }
        else {
            System.out.println("Player selecting O, enter your name: ");
            this.name = input.nextLine();
        }
    }
}
