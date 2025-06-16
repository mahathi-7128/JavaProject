package mahathi;
import java.util.*;

public class dfsimplementation {

    private Map<String, List<String>> graph = new HashMap<>();
    public void addConnection(String person1, String person2) {
        graph.computeIfAbsent(person1, k -> new ArrayList<>()).add(person2);
        graph.computeIfAbsent(person2, k -> new ArrayList<>()).add(person1);
    } 
    public List<String> findSocialCircle(String person) {
        Set<String> visited = new HashSet<>();
        List<String> result = new ArrayList<>();
        dfsRecursive(person, visited, result);
        return result;
    }

    private void dfsRecursive(String person, Set<String> visited, List<String> result) {
        if (!visited.contains(person)) {
            visited.add(person);
            result.add(person);
            for (String neighbor : graph.getOrDefault(person, Collections.emptyList())) {
                dfsRecursive(neighbor, visited, result);
            }
        }
    }
    public List<String> findSocialCircleIterative(String person) {
        Set<String> visited = new HashSet<>();
        List<String> result = new ArrayList<>();
        Stack<String> stack = new Stack<>();
        stack.push(person);

        while (!stack.isEmpty()) {
            String current = stack.pop();
            if (!visited.contains(current)) {
                visited.add(current);
                result.add(current);
                for (String neighbor : graph.getOrDefault(current, Collections.emptyList())) {
                    stack.push(neighbor);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
       dfsimplementation sn = new dfsimplementation();
        sn.addConnection("Alice", "Bob");
        sn.addConnection("Bob", "Charlie");
        sn.addConnection("David", "Eva");

        System.out.println("Recursive DFS from Alice: " + sn.findSocialCircle("Alice"));
        System.out.println("Iterative DFS from Alice: " + sn.findSocialCircleIterative("Alice"));

        System.out.println("Recursive DFS from David: " + sn.findSocialCircle("David"));
        System.out.println("Iterative DFS from David: " + sn.findSocialCircleIterative("David"));
    }
}
