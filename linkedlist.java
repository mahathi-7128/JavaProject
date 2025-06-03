package xyz;

import java.util.LinkedList;

public class linkedlist {

    public static void main(String[] args) {
        LinkedList<String> friends = new LinkedList<String>();
        friends.add("Alice");
        friends.add("Bob");
        friends.add("Charlie");
        friends.add("Handi");
        friends.add("Grace");

        System.out.println("Friends list: " + friends);
    }
}