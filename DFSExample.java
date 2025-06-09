package com.mahathi;
import java.util.*;

public class DFSExample {
    private Map<String, List<String>> homeMap = new HashMap<>();
    private Set<String> visited = new HashSet<>();

    public void addRoom(String room, String connectedRoom) {
        homeMap.computeIfAbsent(room, k -> new ArrayList<>()).add(connectedRoom);
        homeMap.computeIfAbsent(connectedRoom, k -> new ArrayList<>()).add(room);
    }

    public void dfs(String currentRoom) {
        if (visited.contains(currentRoom)) return;

        visited.add(currentRoom);
        System.out.println(currentRoom);

        for (String neighbor : homeMap.getOrDefault(currentRoom, new ArrayList<>())) {
            dfs(neighbor);
        }
    }

    public static void main(String[] args) {
        DFSExample home = new DFSExample();
        home.addRoom("livingroom", "kitchen");
        home.addRoom("livingroom", "Bedroom");
        home.addRoom("Bedroom", "Bathroom");

        System.out.println("DFS traversal:");
        home.dfs("livingroom");
    }
}
