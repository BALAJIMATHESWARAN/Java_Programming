import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class FirstProgram {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Read number of goodies
        int n = Integer.parseInt(readNonEmptyLine(br));

        List<String> labels = new ArrayList<>();
        List<BigInteger> weights = new ArrayList<>();

        // Read goodie details
        for (int i = 0; i < n; ) {
            String line = br.readLine();
            if (line == null) break;
            line = line.trim();
            if (line.isEmpty()) continue;

            String[] parts = line.split("\\s+");
            String label = parts[0];
            BigInteger weight = new BigInteger(parts[parts.length - 1]);

            labels.add(label);
            weights.add(weight);
            i++;
        }

        // Read K
        BigInteger k = new BigInteger(readNonEmptyLine(br));

        // Step 1: Compute total weight for each cargo ship
        Map<String, BigInteger> shipWeights = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = labels.get(i);
            BigInteger w = weights.get(i);
            shipWeights.put(name, shipWeights.getOrDefault(name, BigInteger.ZERO).add(w));
        }

        // Step 2: Compute value A (sum of weight * land position)
        BigInteger totalA = BigInteger.ZERO;
        for (int i = 0; i < n; i++) {
            BigInteger pos = BigInteger.valueOf(i + 1);
            totalA = totalA.add(weights.get(i).multiply(pos));
        }

        // Step 3: Group cargo ships by total weight (descending)
        TreeMap<BigInteger, List<String>> grouped = new TreeMap<>(Collections.reverseOrder());
        for (Map.Entry<String, BigInteger> entry : shipWeights.entrySet()) {
            grouped.computeIfAbsent(entry.getValue(), v -> new ArrayList<>()).add(entry.getKey());
        }

        List<List<String>> shipGroups = new ArrayList<>();
        for (List<String> group : grouped.values()) {
            Collections.sort(group);
            shipGroups.add(new ArrayList<>(group));
        }

        // Step 4: Precompute factorials
        BigInteger[] fact = new BigInteger[101];
        fact[0] = BigInteger.ONE;
        for (int i = 1; i < 101; i++) {
            fact[i] = fact[i - 1].multiply(BigInteger.valueOf(i));
        }

        // Step 5: Calculate factorial size per group
        int groupCount = shipGroups.size();
        BigInteger[] groupFact = new BigInteger[groupCount];
        for (int i = 0; i < groupCount; i++) {
            groupFact[i] = fact[shipGroups.get(i).size()];
        }

        // Step 6: Compute suffix product array
        BigInteger[] suffix = new BigInteger[groupCount];
        if (groupCount == 0) {
            System.out.println("0");
            System.out.println();
            return;
        }

        suffix[groupCount - 1] = BigInteger.ONE;
        for (int i = groupCount - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1].multiply(groupFact[i + 1]);
        }

        // Step 7: Determine Kth permutation (0-indexed)
        BigInteger index = k.subtract(BigInteger.ONE);
        List<String> finalOrder = new ArrayList<>();

        for (int i = 0; i < groupCount; i++) {
            BigInteger blockSize = suffix[i];
            BigInteger groupIndex = index.divide(blockSize);
            index = index.mod(blockSize);

            List<String> perm = getKthPermutation(shipGroups.get(i), groupIndex, fact);
            finalOrder.addAll(perm);
        }

        // Step 8: Compute total B (sum of weight * ship position)
        BigInteger totalB = BigInteger.ZERO;
        for (int i = 0; i < finalOrder.size(); i++) {
            String label = finalOrder.get(i);
            BigInteger w = shipWeights.get(label);
            totalB = totalB.add(w.multiply(BigInteger.valueOf(i + 1)));
        }

        // Step 9: Calculate final total cost
        BigInteger totalCost = totalA.add(totalB);

        // Output
        System.out.println(totalCost);
        System.out.println(String.join(" ", finalOrder));
    }

    // Helper to read next non-empty line
    private static String readNonEmptyLine(BufferedReader br) throws IOException {
        String s;
        while ((s = br.readLine()) != null) {
            s = s.trim();
            if (!s.isEmpty()) return s;
        }
        return "";
    }

    // Compute the Kth lexicographic permutation of a sorted list
    private static List<String> getKthPermutation(List<String> items, BigInteger k, BigInteger[] fact) {
        List<String> available = new ArrayList<>(items);
        List<String> result = new ArrayList<>();
        int n = available.size();
        BigInteger remaining = k;

        for (int i = n; i >= 1; i--) {
            BigInteger f = fact[i - 1];
            BigInteger idx = remaining.divide(f);
            remaining = remaining.mod(f);

            int index = idx.intValue();
            result.add(available.remove(index));
        }
        return result;
    }
}
