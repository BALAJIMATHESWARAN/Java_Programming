import java.util.*;

public class ThreeProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numConnections = Integer.parseInt(scanner.nextLine().trim());
        Map<String, Set<String>> network = new HashMap<>();

        // Build initial bidirectional railway network
        for (int i = 0; i < numConnections; i++) {
            String[] stations = scanner.nextLine().trim().split("\\s+");
            String from = stations[0];
            network.putIfAbsent(from, new HashSet<>());

            for (int j = 1; j < stations.length; j++) {
                String to = stations[j];
                network.putIfAbsent(to, new HashSet<>());
                network.get(from).add(to);
                network.get(to).add(from);
            }
        }

        // Read and store queries
        int numQueries = Integer.parseInt(scanner.nextLine().trim());
        List<String> operations = new ArrayList<>();
        for (int i = 0; i < numQueries; i++) {
            operations.add(scanner.nextLine().trim());
        }

        // Read restrictions for trains starting from specific stations
        int numRestrictions = Integer.parseInt(scanner.nextLine().trim());
        Map<String, Set<String>> restrictedStations = new HashMap<>();
        for (int i = 0; i < numRestrictions; i++) {
            String[] parts = scanner.nextLine().trim().split("\\s+");
            String source = parts[0];
            restrictedStations.putIfAbsent(source, new HashSet<>());
            for (int j = 1; j < parts.length; j++) {
                restrictedStations.get(source).add(parts[j]);
            }
        }

        // Process each query sequentially
        for (String op : operations) {
            if (op.contains(" to ")) {
                String[] parts = op.split(" to ");
                String start = parts[0].trim();
                String end = parts[1].trim();
                boolean reachable = isPathAvailable(network, restrictedStations, start, end);
                System.out.println(reachable ? "yes" : "no");
            } else if (op.contains(" connects ")) {
                String[] parts = op.split(" connects ");
                String stationA = parts[0].trim();
                String stationB = parts[1].trim();
                network.putIfAbsent(stationA, new HashSet<>());
                network.putIfAbsent(stationB, new HashSet<>());
                network.get(stationA).add(stationB);
                network.get(stationB).add(stationA);
            } else if (op.contains(" disconnects ")) {
                String[] parts = op.split(" disconnects ");
                String stationA = parts[0].trim();
                String stationB = parts[1].trim();
                if (network.containsKey(stationA)) network.get(stationA).remove(stationB);
                if (network.containsKey(stationB)) network.get(stationB).remove(stationA);
            }
        }
    }

    // BFS traversal to check if destination is reachable from source without passing through restricted stations
    private static boolean isPathAvailable(Map<String, Set<String>> network, Map<String, Set<String>> restrictions,
                                           String source, String destination) {
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.add(source);
        visited.add(source);

        Set<String> forbidden = restrictions.getOrDefault(source, Collections.emptySet());

        while (!queue.isEmpty()) {
            String current = queue.poll();
            if (current.equals(destination)) return true;

            for (String neighbor : network.getOrDefault(current, Collections.emptySet())) {
                if (!visited.contains(neighbor) && !forbidden.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
        return false;
    }
}
